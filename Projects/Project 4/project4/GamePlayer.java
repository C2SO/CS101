
/*
Nicholas Rahbany
Guessing Game Project
CS101
*/

import java.util.*;

/* 
guessingGame equals GuessingGame Object
player equals Scanner object
*/

/*
Data Table - GamePlayer
-----------------------------------
Variable     | Type         | Purpose
---------------------------------
guessingGame | GuessingGame | References the GessingGame class
player       | Scanner      | Accepts inputs from the player
*/

public class GamePlayer {
  GuessingGame guessingGame = new GuessingGame();
  Scanner player = new Scanner(System.in);

  /*
  getGuessingGame()
    return guessingGame
  */

  public GuessingGame getGuessingGame() {
    return guessingGame;
  }

  /*
  getPlayer()
    return player
  */

  public Scanner getPlayer() {
    return player;
  }

  /*
  setGuessingGame(args)
    guessingGame equals newGame
  */

  /*
  Data Table - setGuessingGame
  -----------------------------------
  Variable     | Type         | Purpose
  ---------------------------------
  guessingGame | GuessingGame | References the GessingGame class
  player       | Scanner      | Accepts inputs from the player
  */

  public void setGuessingGame(GuessingGame newGame) {
    guessingGame = newGame;
  }

  /*
  setPlayer(args)
    player equals newPlayer
  */

  /*
  Data Table - setPlayer
  -----------------------------------
  Variable  | Type    | Purpose
  ---------------------------------
  newPlayer | Scanner | Sets the scanner to the function setPlayer
  */

  public void setPlayer(Scanner newPlayer) {
    player = newPlayer;
  }

  /*
  GamePlayer()
    option equals 1;
    easyModeToPass equals true;
    upperBound equals 10;
    while (option does not equal 3)
          Print "Select an option my entering the option's number:\n1. Choose difficulty level\n2. Pick upper bound for guess\n3. Play game"
          option equals player nextInt()
              switch (option)
              case 1
                print "Choose game difficulty: Easy(true) or Hard(false)"
                easyModeToPass equals player.nextBoolean()
                break
              case 2
                print "Set the highest number you want to guess:"
                upperBound equals player.nextInt()
                break
              case 3
                print "Let's Start!"
                break
              default
                print "Please choose an option that was listed..."
        guessingGame GuessingGame(upperBound, easyModeToPass)
  */

  /*
  Data Table - GamePlayer
  -----------------------------------
  Variable       | Type    | Purpose
  ---------------------------------
  option         | int     | Default menu choice
  easyModeToPass | boolean | Helps determine if game is easy or hard
  upperBound     | int     | the upper bound of the randomly generated number
  */

  public void GamePlayer() {
    int option = 1;
    boolean easyModeToPass = true;
    int upperBound = 10;
    while (option != 3) {
      System.out.println(
          "Select an option my entering the option's number:\n1. Choose difficulty level\n2. Pick upper bound for guess\n3. Play game");
      option = player.nextInt();
      switch (option) {
      case 1:
        System.out.println("Choose game difficulty: Easy(true) or Hard(false)");
        easyModeToPass = player.nextBoolean();
        break;
      case 2:
        System.out.println("Set the highest number you want to guess:");
        upperBound = player.nextInt();
        break;
      case 3:
        System.out.println("Let's Start!");
        break;
      default:
        System.out.println("Please choose an option that was listed...");
        break;
      }
    }
    guessingGame.GuessingGame(upperBound, easyModeToPass);
  }

  /*
  public void play()
    option equals 1
    tempState equals 5
    while (option != 4)
          print "Select a menu option my entering the option's number:\n1. Make a guess\n2. Get a hint\n3. Print statistics\n4. Quit this game"
          option equals player nextInt()
          switch (option)
            case 1
              Print "Make a guess:"
              tempState equals guessingGame getGameState()
              guessingGame makeGuess(player nextInt()
              if (tempState does not equal guessingGame getGameState())
                print guessingGame toString()
                return
                break
            case 2
              print guessingGame hint()
              break
            case 3
              print guessingGame toString()
              break
            case 4
              if (guessingGame getGameState() == 10)
                guessingGame quit()
                print guessingGame toString()
                return 
              break
            default
              print "Invalid entry"
              break
    close player
  */

  /*
  Data Table - play
  -----------------------------------
  Variable  | Type | Purpose
  ---------------------------------
  option    | int  | Default menu choice
  tempState | int  | Determines if the game continues to run
  */

  public void play() {
    int option = 1;
    int tempState = 5;
    while (option != 4) {
      System.out.println(
          "Select a menu option my entering the option's number:\n1. Make a guess\n2. Get a hint\n3. Print statistics\n4. Quit this game");
      option = player.nextInt();
      switch (option) {
      case 1:
        System.out.println("Make a guess:");
        tempState = guessingGame.getGameState();
        guessingGame.makeGuess(player.nextInt());
        if (tempState != guessingGame.getGameState()) {
          System.out.println(guessingGame.toString());
          return;
        }
        break;
      case 2:
        System.out.println(guessingGame.hint());
        break;
      case 3:
        System.out.println(guessingGame.toString());
        break;
      case 4:
        if (guessingGame.getGameState() == 10) {
          guessingGame.quit();
          System.out.println(guessingGame.toString());
          return;
        }
        break;
      default:
        System.out.println("Invalid entry");
        break;
      }
    }
    player.close();
  }
}