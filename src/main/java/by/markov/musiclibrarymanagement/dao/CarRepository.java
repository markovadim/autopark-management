package by.markov.musiclibrarymanagement.dao;

import by.markov.musiclibrarymanagement.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    @Query(value = "select * from cars where owner_id = :id", nativeQuery = true)
    List<Car> findAllCarsByOwnerId(@Param("id") long id);
}
