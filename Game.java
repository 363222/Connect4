
public class Game {
    private Board board;
    private String color1;
    private String color2;
    
    //true if player1's turn
    //false if player2's turn
    private boolean is1playing;
    
    public_Game(String color1, String color2) {
        this.board = new Board();
        this.color1 = color1;
        this.color2 = color2;
        
        is1playing = (new Random()).nextBoolean();
    }
    
    public void startGame() {
        
    }
}
   