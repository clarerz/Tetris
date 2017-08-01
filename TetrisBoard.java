package assignment;

import java.awt.*;

/**
 * Represents a Tetris board -- essentially a 2-d grid of
 * booleans. Supports tetris pieces and row clearing.
 * Does not do any drawing or have any idea of pixels. Instead, just
 * represents the abstract 2-d board.
 */
public final class TetrisBoard implements Board {

    // JTetris will use this constructor
    public TetrisBoard(int width, int height) {}

    public Result move(Action act) { return Result.NO_PIECE; }

    public Board testMove(Action act) { return null; }

    public void nextPiece(Piece p) {}

    public boolean equals(Object other) { return false; }

    public Result getLastResult() { return Result.NO_PIECE; }

    public Action getLastAction() { return Action.NOTHING; }

    public int getRowsCleared() { return -1; }

    public int getWidth() { return -1; }

    public int getHeight() { return -1; }

    public int getMaxHeight() { return -1; }

    public int dropHeight(Piece piece, int x) { return -1; }

    public int getColumnHeight(int x) { return -1; }

    public int getRowWidth(int y) { return -1; }

    public boolean getGrid(int x, int y) { return false; }

}
