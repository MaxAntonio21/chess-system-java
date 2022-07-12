package application;

import Chess.ChessMatch;

public class Program {
    public static void main(String[] args) throws Exception {

        ChessMatch chessMatch = new ChessMatch();
        System.out.println();

        UI.printBoard(chessMatch.getPieces());

        
    }
}
