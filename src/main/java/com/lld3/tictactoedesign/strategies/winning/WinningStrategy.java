package com.lld3.tictactoedesign.strategies.winning;

import com.lld3.tictactoedesign.models.Board;
import com.lld3.tictactoedesign.models.GameSymbol;

public interface WinningStrategy {

    boolean checkWinner(Board board, GameSymbol symbol);

}

// Task 4 - Implement column winner and row winner
