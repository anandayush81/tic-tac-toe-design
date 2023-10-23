package com.lld3.tictactoedesign.models;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

@Getter
public class Board {
    private int size;
    private List<List<BoardCell>> cells = new ArrayList<>();
    public Board(int size) {
        this.size = size;
        this.cells = initialiseCells(size);
    }

    private List<List<BoardCell>> initialiseCells(int size) {
        //Normal way
        //List<BoardCell> firstRow = Collections.nCopies(size, new BoardCell());
        //return Collections.nCopies(size, firstRow);

        List<List<BoardCell>> cells = new ArrayList<>();
        for(int i=0;i<size;i++){
            List<BoardCell>row=new ArrayList<>();
            for(int j=0;j<size;j++){
                row.add(new BoardCell(i,j));
            }
            cells.add(row);
        }
        return cells;

        //Using Streams
        /*List<List<BoardCell>> cells = new ArrayList<>();
        IntStream.range(0, size).forEach(row -> {
            List<BoardCell> rowCells = new ArrayList<>();
            IntStream.range(0, size).forEach(column -> rowCells.add(new BoardCell(row, column)));
            cells.add(rowCells);
        });
        return cells;*/
    }
    public boolean isEmpty(int row, int column) {
        return getBoardCell(row, column).getSymbol() == null;
    }
    public void update(BoardCell move) {
        getBoardCell(move.getRow(), move.getColumn()).setSymbol(move.getSymbol());
    }
    private BoardCell getBoardCell(int row, int column) {
        return cells.get(row).get(column);
    }

    public void printBoard() {
        for (int i = 0; i < cells.size(); ++i) {
            for (int j = 0; j < cells.size(); ++j) {
                GameSymbol symbol = cells.get(i).get(j).getSymbol();

                if (symbol == null) {
                    System.out.printf(" | - | ");
                } else {
                    System.out.printf(" | " + symbol + " | ");
                }
            }
            System.out.printf("\n");
        }
    }

    public List<BoardCell> getEmptyCells() {
        // Iterate over the cells
        // Flatten the array 2D => 1D
        // Filter out cells where symbol != null

        // Get a list of streams and combine it into one
        //using stream
        /*return cells.stream()
                .flatMap(List::stream)
                .filter(cell -> cell.getSymbol() == null)
                .toList();*/

        //Using Loop
        List<BoardCell>emptyCells=new ArrayList<>();
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(cells.get(i).get(j).getSymbol()==null)
                    emptyCells.add(cells.get(i).get(j));
            }
        }
        return emptyCells;
    }
}