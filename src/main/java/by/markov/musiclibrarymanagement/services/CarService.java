package by.markov.musiclibrarymanagement.services;


import by.markov.musiclibrarymanagement.dao.CarRepository;
import by.markov.musiclibrarymanagement.dto.CarDto;
import by.markov.musiclibrarymanagement.entities.Car;
import by.markov.musiclibrarymanagement.exceptions.CarNotFoundException;
import by.markov.musiclibrarymanagement.mapping.CarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;
    private final CarMapper carMapper;

    public List<CarDto> findAll() {
        return carMapper.toCarDtoList(carRepository.findAll());
    }

    public CarDto findById(long id) {
        Car car = carRepository.findById(id).orElseThrow(() -> new CarNotFoundException(id));
        return carMapper.toDto(car);
    }

    public void saveCar(CarDto carDto) {
        carRepository.save(carMapper.toEntity(carDto));
    }

    @Transactional
    public void updateCarById(long id, CarDto carDto) {
        Car car = carRepository.findById(id).orElseThrow(() -> new CarNotFoundException(id));
        carMapper.update(carDto, car);
        carRepository.save(car);
    }

    public void deleteCarById(long id) {
        findById(id);
        carRepository.deleteById(id);
    }

    public List<CarDto> findCarsByOwnerId(long id){
        return carMapper.toCarDtoList(carRepository.findAllCarsByOwnerId(id));
    }
}
