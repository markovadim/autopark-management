package by.markov.musiclibrarymanagement.entities;


import by.markov.musiclibrarymanagement.entities.enums.CarMake;
import by.markov.musiclibrarymanagement.entities.enums.FuelType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cars")
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private CarMake make;
    private String model;
    private int yearOfIssue;
    private int power;

    @Enumerated(EnumType.STRING)
    private FuelType fuelType;

    @Column(name = "owner_id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private long ownerId;
}
