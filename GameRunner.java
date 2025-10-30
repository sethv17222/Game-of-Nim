/**
 * Project 2.2.11
 *
 * GameRunner Class for the Game of Nim 
*/
public class GameRunner
{
  private Player player1;
  private Player player2;
  public static void main(String[] args)
  {
    System.out.println("Welcome to the Game of Nim!");
    
    Game nim = new Game(); 
    Player player1 = new Player("Seth", false);
    Player player2 = new Player("Sebastian", false);
    nim.addPlayer(player1);
    nim.addPlayer(player2);
    Board.populate(); 
    Board.getNumPieces();
    Board.getRandomPlayer();

    System.out.println("Each player will take turns taking no more than half of the total pieces until someone takes the last piece.");
    System.out.print("That player that takes the last piece will lose the game.");

  }
}