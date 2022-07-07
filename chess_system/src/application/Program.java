package application;

import Chess.ChessMatch;
import boardgame.Board;
import boardgame.Position;

public class Program {
    public static void main(String[] args) throws Exception {

        ChessMatch chessMatch = new ChessMatch();
        System.out.println();

        UI.printBoard(chessMatch.getPieces());

        
    }
}
