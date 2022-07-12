package boardgame;

public class Piece {
    
    protected Position position;
    private Board board;

    public Piece(Board board){
        
        this.board = board;

    }

    //tabuleiro é de uso interno, e não pode ser acessado externamente
    // e não temos o setBoard pois ele não deve ser alterado externamente
    protected Board getbBoard(){

        return board;
        
    }

    
}
