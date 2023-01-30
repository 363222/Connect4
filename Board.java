public class Board
{
    private int rows = 6;
    private int columns = 7;
    
    Piece [][]ourBoard = new Piece[rows][columns];
    
    public void printBoard() {
        for (int row = 0; row < rows; row++) {
            Syste.out.print("|");
            for(int col = 0; col < colums; col++) {
                if(ourBoard[row][col] == null) {
                    System.ut.print(" ");
                } else {    
                
                } 
            }
        }
    }
    
    public Board() {
        for (int row = 0; row < rows; row++) {
            for(int col = 0; col < colums; col++) {
                ourBoard[row][col] = null;
            }
        }
    }
    
}
