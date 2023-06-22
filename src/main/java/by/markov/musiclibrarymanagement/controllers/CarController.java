package by.markov.musiclibrarymanagement.controllers;


import by.markov.musiclibrarymanagement.dto.CarDto;
import by.markov.musiclibrarymanagement.services.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/cars")
public class CarController {

    private final CarService carService;

    @GetMapping
    public ResponseEntity<List<CarDto>> findAllCars() {
        return ResponseEntity.status(HttpStatus.OK).body(carService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarDto> findCarById(@PathVariable long id) {
        return ResponseEntity.status(HttpStatus.OK).body(carService.findById(id));
    }

    @PostMapping
    public ResponseEntity<CarDto> saveCar(@RequestBody CarDto carDto) {
        carService.saveCar(carDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(carDto);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<CarDto> updateCarById(@PathVariable long id, @RequestBody CarDto carDto) {
        carService.updateCarById(id, carDto);
        return ResponseEntity.status(HttpStatus.OK).body(carDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCarById(@PathVariable long id) {
        carService.deleteCarById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(String.format("Car with id:%d was deleted", id));
    }
}
