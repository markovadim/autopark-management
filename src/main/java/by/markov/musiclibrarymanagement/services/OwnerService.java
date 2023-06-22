package by.markov.musiclibrarymanagement.services;


import by.markov.musiclibrarymanagement.dao.OwnerRepository;
import by.markov.musiclibrarymanagement.dto.CarDto;
import by.markov.musiclibrarymanagement.dto.OwnerDto;
import by.markov.musiclibrarymanagement.entities.Owner;
import by.markov.musiclibrarymanagement.exceptions.OwnerAlreadyExist;
import by.markov.musiclibrarymanagement.exceptions.OwnerNotFoundException;
import by.markov.musiclibrarymanagement.mapping.OwnerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OwnerService {

    private final OwnerRepository ownerRepository;
    private final OwnerMapper ownerMapper;
    private final CarService carService;

    public List<OwnerDto> findAll() {
        return ownerMapper.toOwnerDtoList(ownerRepository.findAll());
    }

    public OwnerDto findById(long id) {
        Owner owner = ownerRepository.findById(id).orElseThrow(() -> new OwnerNotFoundException(id));
        return ownerMapper.toDto(owner);
    }

    public void saveOwner(OwnerDto ownerDto) {
        if (ownerRepository.findByPassportNumberOrPhoneNumberOrEmail(ownerDto.getPassportNumber(), ownerDto.getPhoneNumber(), ownerDto.getEmail()).isPresent()) {
            throw new OwnerAlreadyExist();
        } else {
            ownerRepository.save(ownerMapper.toEntity(ownerDto));
        }
    }

    @Transactional
    public void updateOwnerById(long id, OwnerDto ownerDto) {
        Owner owner = ownerRepository.findById(id).orElseThrow(() -> new OwnerNotFoundException(id));
        ownerMapper.update(ownerDto, owner);
        ownerRepository.save(owner);
    }

    public void deleteById(long id) {
        findById(id);
        ownerRepository.deleteById(id);
    }

    public List<CarDto> findOwnerCarsById(long id) {
        findById(id);
        return carService.findCarsByOwnerId(id);
    }
}
