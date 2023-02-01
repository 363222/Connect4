
public class Board
{
    private int rows = 6;
    private int columns = 7;

    Piece [][]ourBoard = new Piece[rows][columns];

    public boolean addPiece(int rowToAdd, String color) {
        // within normal range 
        if(rowToAdd >= 0 && rowToAdd < rows) {
            // we can add
            if(ourBoard[rowToAdd][0] == null) {
                boolean addedThePiece = false;
                for(int col = columns -1; col >= 0; col--) { 
                    if(ourBoard[rowToAdd][col] == null) {
                        ourBoard[rowToAdd][col] = new Piece();
                        ourBoard[rowToAdd][col].setColor(color);
                        addedThePiece = true; 
                        break;
                    }
                }
                return addedThePiece;
            } else {
                //that row is full
                System.err.println("This row is full, please choose another.");
                return false;
            }
        } else {
            //outsude normal range
            System.err.println("You are trying to add somewhere that is not supported.");
            return false;
        }
    }

    public void printBoard() {
        for (int row = 0; row < rows; row++) {
            System.out.print("|");
            for(int col = 0; col < columns; col++) {
                if(ourBoard[row][col] == null) {
                    System.out.print("_");
                } else {    
                    System.out.print(ourBoard[row][col].getColor());
                } 
                System.out.print("|");
            }
            System.out.println();
        }
    }

    public Board() {
        for (int row = 0; row < rows; row++) {
            for(int col = 0; col < columns; col++) {
                ourBoard[row][col] = null;
            }
        }
    }

}
