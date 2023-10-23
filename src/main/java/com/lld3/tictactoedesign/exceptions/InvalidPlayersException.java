package com.lld3.tictactoedesign.exceptions;

public class InvalidPlayersException extends RuntimeException {
    public InvalidPlayersException() {
        super("Invalid list of players!");
    }
}