
/*
Nicholas Rahbany
Guessing Game Project
CS101
*/

import java.util.*;

/*
main(args) 
  scan = Scanner Object
  playAgain = true boolean
  while playAgain is true
        player = GamePlayer object
        GamePlayer GamePlayer function
        GamePlayer play function
        Ask user if they want to play again
        playAgain = user input
  close scanner
*/

/*
Data Table
-----------------------------------
Variable   | Type       | Purpose
---------------------------------
scan       | Scanner    | Scans the console for user input
playAgain  | boolean    | Checks if the user wants to play again
boolean    | GamePlayer | References GamePlayer class
*/

public class PlayGame {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean playAgain = true;
    while (playAgain) {
      GamePlayer player = new GamePlayer();
      player.GamePlayer();
      player.play();
      System.out.println("Do you want to play again?(true/false)");
      playAgain = scan.nextBoolean();
    }
    scan.close();
  }
}