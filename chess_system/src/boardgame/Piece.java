package boardgame;

public abstract class Piece {
    
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

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position){
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove(){
        boolean[][] mat = possibleMoves();
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat.length; j ++){
                if(mat[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}
