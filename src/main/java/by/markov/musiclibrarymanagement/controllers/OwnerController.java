package by.markov.musiclibrarymanagement.controllers;

import by.markov.musiclibrarymanagement.dto.CarDto;
import by.markov.musiclibrarymanagement.dto.OwnerDto;
import by.markov.musiclibrarymanagement.services.OwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/owners")
public class OwnerController {

    private final OwnerService ownerService;

    @GetMapping
    public ResponseEntity<List<OwnerDto>> findAllOwners() {
        return ResponseEntity.status(HttpStatus.OK).body(ownerService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<OwnerDto> findOwnerById(@PathVariable long id) {
        return ResponseEntity.status(HttpStatus.OK).body(ownerService.findById(id));
    }

    @GetMapping("/{id}/cars")
    public ResponseEntity<List<CarDto>> findOwnerCarsById(@PathVariable long id) {
        return ResponseEntity.status(HttpStatus.OK).body(ownerService.findOwnerCarsById(id));
    }

    @PostMapping
    public ResponseEntity<OwnerDto> saveOwner(@RequestBody OwnerDto ownerDto) {
        ownerService.saveOwner(ownerDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(ownerDto);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<OwnerDto> updateOwnerById(@PathVariable long id, @RequestBody OwnerDto ownerDto) {
        ownerService.updateOwnerById(id, ownerDto);
        return ResponseEntity.status(HttpStatus.OK).body(ownerDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteOwnerById(@PathVariable long id) {
        ownerService.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(String.format("Owner with id:%d was deleted", id));
    }
}
