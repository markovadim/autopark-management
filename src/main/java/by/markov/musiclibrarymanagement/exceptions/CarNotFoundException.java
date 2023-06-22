package by.markov.musiclibrarymanagement.exceptions;

public class CarNotFoundException extends RuntimeException {

    public CarNotFoundException(long id) {
        super(String.format("Car with id:%d not found", id));
    }
}
