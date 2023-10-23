package com.lld3.tictactoedesign.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class BoardCell {
    private int row;
    private int column;
    private GameSymbol symbol;

    //Constructor overloading is done here, since we already have an AllArgsConstructor (with 3 arguments)
    //We're adding another Constructor with 2 arguments
    //The all args const is used when in the makeMove method where we're updating a cell (x,y) with a symbol
    //This const with 2 arguments is used only when we're initialising the board (cells)
    public BoardCell(int row, int column) {
        this.row = row;
        this.column = column;
    }
}