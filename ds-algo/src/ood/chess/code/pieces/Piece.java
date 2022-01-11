package ood.chess.code.pieces;

import ood.chess.code.Board;
import ood.chess.code.Cell;

public abstract class Piece {
    Boolean isWhite;

    public abstract boolean canMove(Board board, Cell from, Cell dest);
}
