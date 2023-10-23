package com.lld3.tictactoedesign.exceptions;

public class InvalidSymbolException extends RuntimeException {
    public InvalidSymbolException() {
        super("You have entered an invalid symbol. Use O or X.");
    }
}
