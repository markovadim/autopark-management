package by.markov.musiclibrarymanagement.mapping;

import by.markov.musiclibrarymanagement.dto.OwnerDto;
import by.markov.musiclibrarymanagement.entities.Owner;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper
public interface OwnerMapper {

    OwnerDto toDto(Owner owner);

    Owner toEntity(OwnerDto ownerDto);

    List<OwnerDto> toOwnerDtoList(List<Owner> owners);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void update(OwnerDto ownerDto, @MappingTarget Owner owner);
}
