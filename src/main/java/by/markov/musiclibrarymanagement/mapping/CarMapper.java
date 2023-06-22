package by.markov.musiclibrarymanagement.mapping;

import by.markov.musiclibrarymanagement.dto.CarDto;
import by.markov.musiclibrarymanagement.entities.Car;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper
public interface CarMapper {

    CarDto toDto(Car car);

    Car toEntity(CarDto carDto);

    List<CarDto> toCarDtoList(List<Car> cars);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void update(CarDto carDto, @MappingTarget Car car);
}
