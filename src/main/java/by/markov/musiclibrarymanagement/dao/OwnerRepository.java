package by.markov.musiclibrarymanagement.dao;


import by.markov.musiclibrarymanagement.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {

    Optional<Owner> findByPassportNumberOrPhoneNumberOrEmail(String passportNumber, String phoneNumber, String email);
}
