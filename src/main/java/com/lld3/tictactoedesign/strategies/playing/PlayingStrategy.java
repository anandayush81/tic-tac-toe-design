package com.lld3.tictactoedesign.strategies.playing;

import com.lld3.tictactoedesign.models.Board;
import com.lld3.tictactoedesign.models.BoardCell;

public interface PlayingStrategy {
    BoardCell makeMove(Board board);
}
