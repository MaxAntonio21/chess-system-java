package chess_pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece{

    public Bishop(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "B";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getbBoard().getRows()][getbBoard().getColumns()];

        Position p = new Position(0, 0);

        //northWest
        p.setValues(position.getRow() - 1, position.getColumn() - 1);
        while (getbBoard().positionExists(p) && !getbBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() - 1,p.getColumn() - 1);
        }
        if( getbBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        //northEast
        p.setValues(position.getRow() - 1, position.getColumn() + 1);
        while (getbBoard().positionExists(p) && !getbBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() - 1,p.getColumn() + 1);
        }
        if( getbBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        //southEast
        p.setValues(position.getRow() + 1, position.getColumn() + 1);
        while (getbBoard().positionExists(p) && !getbBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() + 1,p.getColumn() + 1);
        }
        if( getbBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        //southWest
        p.setValues(position.getRow() + 1, position.getColumn() - 1);
        while (getbBoard().positionExists(p) && !getbBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() + 1,p.getColumn() - 1);
        }
        if( getbBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        return mat;
    }
    

}
