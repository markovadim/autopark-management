package by.markov.musiclibrarymanagement.exceptions;

public class OwnerNotFoundException extends RuntimeException {

    public OwnerNotFoundException(long id) {
        super(String.format("Owner with id:%d not found", id));
    }
}
