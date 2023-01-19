package org.vin;

public class GameAlreadyStartedException extends Exception {
    public GameAlreadyStartedException(String message) {
        super(message);
    }
}
