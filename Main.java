public class Main {

    public static void main(String[] args) {
        Board boardGame = new Board();
        boardGame.printBoard();
        boardGame.addPiece(colToAdd:0, color:"X");
        boardGame.addPiece(colToAdd:0, color:"0");
        boardGame.addPiece(colToAdd:1, color:"X");
        boardGame.addPiece(colToAdd:2, color:"0");
        boardGame.addPiece(colToAdd:1, color:"X");
        boardGame.printBoard();

    }
}