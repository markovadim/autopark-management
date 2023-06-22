package by.markov.musiclibrarymanagement.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class OwnerDto {

    private String firstName;
    private String lastName;
    private String passportNumber;
    private String email;
    private String phoneNumber;
}
