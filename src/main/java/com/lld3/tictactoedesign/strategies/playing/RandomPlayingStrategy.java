package com.lld3.tictactoedesign.strategies.playing;

import com.lld3.tictactoedesign.models.Board;
import com.lld3.tictactoedesign.models.BoardCell;

import java.util.List;

//This is the playing strategy of the Bot
public class RandomPlayingStrategy implements PlayingStrategy{

    @Override
    public BoardCell makeMove(Board board) {
        // Output -> A cell from the list of available cells
        // Get a list of empty cells
        List<BoardCell> emptyCells = board.getEmptyCells();

        // Generate a random index for the cells
        int randomIndex = (int) (Math.random() * emptyCells.size());

        // Return the random cell
        BoardCell boardCell = emptyCells.get(randomIndex);
        return new BoardCell(boardCell.getRow(), boardCell.getColumn());
    }
}
// Task 3 - FirstCellStrategy
// Return the first empty cell