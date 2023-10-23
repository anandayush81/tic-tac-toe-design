package com.lld3.tictactoedesign.exceptions;

public class InvalidMoveException extends RuntimeException{
    public InvalidMoveException(int row, int col) {
        super("The move was invalid: " + row + " " + col );
    }
}





