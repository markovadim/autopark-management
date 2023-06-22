package by.markov.musiclibrarymanagement.exceptions;

public class OwnerAlreadyExist extends RuntimeException {

    public OwnerAlreadyExist() {
        super("Owner already exist. Incorrect data");
    }
}
