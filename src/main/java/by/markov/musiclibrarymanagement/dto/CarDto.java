package by.markov.musiclibrarymanagement.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CarDto {

    private String make;
    private String model;
    private int yearOfIssue;
    private int power;
    private String fuelType;

    private long ownerId;
}
