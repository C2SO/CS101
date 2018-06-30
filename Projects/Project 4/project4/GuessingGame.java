
/*
Nicholas Rahbany
Guessing Game Project
CS101
*/

import java.util.*;

/*
initialize EASY_GAME to true
initialize DIFFICULT_GAME to false
initialize DEFAULT_MAXIMUM_RANGE to 10
initialize GAME_WIN to 1
initialize GAME_LOST to 0
initialize GAME_IN_PROGRESS to 10
initialize gameState
initialize numberToGuess
initialize numberOfGuesses
initialize largestPossibleNumber
initialize maximumNumberIfGuesses
initialize currentMinimumRange to 0
initialize currentMaximumRange to integer max balue
initialize guessTooLow to false
initialize easyGame
*/

/*
Data Table - GuessingGame	
------------------------------------	
Variable              |	Type	  | Purpose
------------------------------------
EASY_GAME             |	boolean |	This class constant will have the value true
DIFFICULT_GAME        | boolean | This class constant will have the value false
DEFAULT_MAXIMUM_RANGE |	int     |	This class constant will have the value 10
GAME_WON              | int     |	This class constant holds an int value for the instance GameState
GAME_LOST	            | int     |	This class constant holds an int value for the instance variable gameState, this value must be different than GAME_WON
GAME_IN_PROGRESS      | int     | This class constant holds an int value for the instance variable gameState, this value must be different than GAME_WON and GAME_LOST
gameState             |	int     |	This instance variable holds the state of the game, which only allows GAME_WON, GAME_LOST, and GAME_IN_PROGRESS
numberToGuess         |	int     |	This field hosts the random number which the user is trying to guess
numberOfGuesses       |	int     |	This field hosts the number of guesses the user has made
largestPossibleNumber |	int     |	The user will be guessing a number from 1 up to the number this field hosts
maximumNumerOfGuesses |	int     |	This field hosts the number of maximum guesses a user is allowed to make
currentMinimumRange   |	int     |	This number is the largest guess made where it is too low
currentMaximumRange   |	int     |	This number is the smallest guess made where it is too high
guessTooLow           |	boolean |	If this boolean is true, the guess was too low. If the boolean is false, the guess was too high
easyGame              | boolean | If it is equal to EASY_GAME, it is an easy game. Same thing for DIFFICULT_GAME.
*/

public class GuessingGame {
  final boolean EASY_GAME = true;
  final boolean DIFFICULT_GAME = false;
  final int DEFAULT_MAXIMUM_RANGE = 10;
  final int GAME_WON = 1;
  final int GAME_LOST = 0;
  final int GAME_IN_PROGRESS = 10;
  private int gameState;
  private int numberToGuess;
  private int numberOfGuesses;
  private int largestPossibleNumber;
  private int maximumNumberOfGuesses;
  private int currentMinimumRange = 0;
  private int currentMaximumRange = Integer.MAX_VALUE;
  private boolean guessTooLow = false;
  private boolean easyGame;

  /*
  set rand as new Random
  setLargestPossibleNumber(largestPossibleNumber)
  setNumberToGuess(rand.nextInt(largestPossibleNumber) + 0)
  setNumberOfGuesses(0)
  setEasyGame(difficulty)
  setMaximumNumberOfGuesses(computeMaxNumberOfGuesses)
  setCurrentMinimumRange(0)
  setCurrentMaximumRange(largestPossibleNumber)
  setGameState(GAME_IN_PROGRESS)
  setGuessTooLow(false)
  */

  /*
  Data Table - GuessingGame		
  ----------------------------------------
  Variable              |	Type	  | Purpose
  ----------------------------------------
  rand                  |	Random  |	Random object
  difficulty            | boolean |	The boolean determines the difficulty of the game
  DEFAULT_MAXIMUM_RANGE |	int     |	This class constant will have the value 10
  largestPossibleNumber | int     |	The user will be guessing a number from 1 up to the number this field hosts

  */
  public void GuessingGame(int largestPossibleNumber, boolean difficulty) {
    Random rand = new Random();
    setLargestPossibleNumber(largestPossibleNumber);
    setNumberToGuess(rand.nextInt(largestPossibleNumber) + 0);
    setNumberOfGuesses(0);
    setEasyGame(difficulty);
    setMaximumNumberOfGuesses(computeMaxNumberOfGuesses());
    setCurrentMinimumRange(0);
    setCurrentMaximumRange(largestPossibleNumber);
    setGameState(GAME_IN_PROGRESS);
    setGuessTooLow(false);
  }

  /*
  GuessingGame(int)
    this GuessingGame(largestPossibleNumber, EASY_GAME)
  */

  /*
  Data Table - GuessingGame		
  --------------------------------------
  Variable	            | Type | Purpose
  --------------------------------------
  largestPossibleNumber | int  | The user will be guessing a number from 1 up to the number this field hosts
  */

  public void GuessingGame(int largestPossibleNumber) {
    this.GuessingGame(largestPossibleNumber, EASY_GAME);
  }

  /*
  GuessingGame(boolean)
    this GuessingGame(DEFAULT_MAXIMUM_RANGE, difficulty)
  */

  /*
  Data Table - GuessingGame		
  --------------------------------
  Variable   |	Type    |	Purpose
  --------------------------------
  difficulty |	boolean	| The boolean determines the difficulty of the game
  */

  public void GuessingGame(boolean difficulty) {
    this.GuessingGame(DEFAULT_MAXIMUM_RANGE, difficulty);
  }

  /*
  GuessingGame()
    this GuessingGame(DEFAULT_MAXIMUM_RANGE, EASY_GAME)
  */

  public void GuessingGame() {
    this.GuessingGame(DEFAULT_MAXIMUM_RANGE, EASY_GAME);
  }

  /*
  setNumberToGuess(int)
    numberToGuess equals number
  */

  /*
  Data Table - setNumberToGuess		
  ---------------------------
  Variable | Type	| Purpose
  --------------------------
  number	 | int  |	Number used to define random number
  */

  private void setNumberToGuess(int number) {
    numberToGuess = number;
  }

  /*
  setNumberOfGuess(int)
    numberOfGuesses equals number
  */

  /*
  Data Table - setNumberOfGuesses	
  ------------------------	
  Variable | Type |	Purpose
  --------------------------
  number   | int  | Number used to define number of guesses
  */

  private void setNumberOfGuesses(int number) {
    numberOfGuesses = number;
  }

  /*
  setLargestPossibleNumber(int)
    largestPossibleNumber equals maximum(number, DEFAULT_MAXIMUM_RANGE)
  */

  /*
  Data Table - setLargestPossibleNumber	
  ------------------------	
  Variable | Type |	Purpose
  ------------------------
  number	 | int	| Number used to define upper bound in random number
  */

  private void setLargestPossibleNumber(int number) {
    largestPossibleNumber = Math.max(number, DEFAULT_MAXIMUM_RANGE);
  }

  /*
  setEasyGame(boolean)
    easyGame equals difficulty
  */

  /*
  Data Table - setEasyGame		
  -----------------------
  Variable	 | Type	   | Purpose
  -------------------------
  difficulty | boolean | Boolean used to determine the difficulty of the game
  */

  private void setEasyGame(boolean difficulty) {
    easyGame = difficulty;
  }

  /*
  computeMaxNumberOfGuesses()
    initialize pong
    mathWork equals largestPossibleNumber
    loops equals 0
    if (easyGame)
      pong equals largestPossibleNumber / 2
    else
      while (mathWork greater than or equal to 1)
        mathWork = mathWork / 2
        add one to loops
      add one to loops
      pong equals loops
    return pong
  */

  /*
  Data Table - computeMaxNumberOfGuesses		
  ------------------------
  Variable | Type	| Purpose
  ------------------------
  pong	   | int 	| return value for method
  mathWork | int	| Used as largest possible number when determining number of guesses for high difficulty
  loops	   | int	| number of loops the function itterated to get the number of guesses
  */

  private int computeMaxNumberOfGuesses() {
    int pong;
    int mathWork = largestPossibleNumber;
    int loops = 0;
    if (easyGame)
      pong = largestPossibleNumber / 2;
    else {
      while (mathWork >= 1) {
        mathWork = mathWork / 2;
        loops++;
      }
      loops++;
      pong = loops;
    }
    return pong;
  }

  /*
  setMaximumNumberOfGuesses(int)
    maximumNumber of guesses equals number
  */

  /*
  Data Table - setMaximumNumberOfGuesses	
  -------------------------	
  Variable | Type	| Purpose
  --------------------------
  number	 | int  |	Number used to define maximum number of guesses
  */

  private void setMaximumNumberOfGuesses(int number) {
    maximumNumberOfGuesses = number;
  }

  /*
  setCurrentMinimumRange(int)
    if (min less than numberToGuess and min is greater than or equal to currentMinimumRange)
      currentminimumRange equals min
  */

  /*
  Data Table - setCurrentMinimumRange		
  --------------------------
  Variable | Type	| Purpose
  ----------------------------
  min	     | int  |	When a guess is made, this determines if it is the new minimum range for the hints
  */

  private void setCurrentMinimumRange(int min) {
    if (min < numberToGuess && min >= currentMinimumRange)
      currentMinimumRange = min;
  }

  /*
  setCurrentMaximumRange(int)
    if (max is rgeater than numberToGuess and max is less than or equal to currentMaximumRange)
      currentMaximumRange equals max
  */

  /*
  Data Table - setCurrentMaximumRange		
  Variable | Type |	Purpose
  max	     | int  | When a geuss is made, this determines if it is the new maximum range for the hints
  */

  private void setCurrentMaximumRange(int max) {
    if (max > numberToGuess && max <= currentMaximumRange)
      currentMaximumRange = max;
  }

  /*
  setGameState(int)
    gameState equals state
  */

  /*
  Data Table - setGameState		
  --------------------------
  Variable | Type |	Purpose
  ----------------------------
  state	   | int  |	Determines if the game is in progress, won, or lost
  */

  private void setGameState(int state) {
    gameState = state;
  }

  /*
  setGuessTooLow(boolean)
    guessTooLow equals tooLow
  */

  /*
  Data Table - setGuessTooLow
  ---------------------------		
  Variable | Type	   | Purpose
  ----------------------------
  tooLow	 | boolean | True or false depending on if the guess was too low or not
  */
  private void setGuessTooLow(boolean tooLow) {
    guessTooLow = tooLow;
  }

  /*
  makeGuess(int)
    if (gameState equals GAME_IN_PROGRESS)
      add one to numberOfGuesses
    if (guess equals numberToGuess)
      setGameState(GAME_WON)
    else if (guess less than numberToGuess)
      setGuessTooLow(true)
      setCurrentMinimumRange(guess)
    else if (guess greater than numberToGuess)
      setGuessTooLow(false)
      setCUrrentMaximumRange(guess)
    if (numberOfGuesses equals maximumNumberOfGuesses and not gameState == GAME_WON)
      setGameState(GAME_LOST)
  */

  /*
  Data Table - makeGuess		
  -----------------------
  Variable | Type |	Purpose
  ----------------------
  guess	   | int  | The user's guess
  */

  public void makeGuess(int guess) {
    if (gameState == GAME_IN_PROGRESS)
      numberOfGuesses++;
    if (guess == numberToGuess)
      setGameState(GAME_WON);
    else if (guess < numberToGuess) {
      setGuessTooLow(true);
      setCurrentMinimumRange(guess);
    } else if (guess > numberToGuess) {
      setGuessTooLow(false);
      setCurrentMaximumRange(guess);
    }
    if (numberOfGuesses == maximumNumberOfGuesses && !(gameState == GAME_WON))
      setGameState(GAME_LOST);
  }

  /*
  hint()
    pong equals "Choose a number between" + currentMinimumRange + " and " + currentMaximumRange
    return pong
  */

  /*
  Data Table - hint	
  ----------------------------	
  Variable | Type   |	Purpose
  ---------------------------
  pong	   | String |	String that is returned to the user
  */

  public String hint() {
    String pong = "Choose a number between " + currentMinimumRange + " and " + currentMaximumRange;
    return pong;
  }

  /*
  quit()
    setGameState(GAME_LOST)
  */

  public void quit() {
    setGameState(GAME_LOST);
  }

  /*
  toString()
    initialize pong
    if (gameState equals GAME_IN_PROGRESS)
      pong equals "You have " + (maximumNumberOfGuesses - numberOfGuesses) + " guesses left"
    else if (gameState == GAME_WON)
      pong = "You guessed " + numberToGuess + " in " + numberOfGuesses + " guesses. You win!"
    else
      pong = "Sorry! The answer was " + numberToGuess + ". Better luck next time!"
    return pong
  */

  /*
  Data Table - toString		
  ---------------------------
  Variable | Type   |	Purpose
  ---------------------------
  pong	   | String |	Prints statistics of current session
  */
  public String toString() {
    String pong;
    if (gameState == GAME_IN_PROGRESS)
      pong = "You have " + (maximumNumberOfGuesses - numberOfGuesses) + " guesses left";
    else if (gameState == GAME_WON)
      pong = "You guessed " + numberToGuess + " in " + numberOfGuesses + " guesses. You win!";
    else
      pong = "Sorry! The answer was " + numberToGuess + ". Better luck next time!";
    return pong;
  }

  /*
  getGameState()
    return gameState
  */

  public int getGameState() {
    return gameState;
  }

  /*
  getNumberToGuess()
    return numberToGuess
  */

  public int getNumberToGuess() {
    return numberToGuess;
  }

  /*
  getNumberOfGuesses()
    return numberOfGuesses
  */

  public int getNumberOfGuesses() {
    return numberOfGuesses;
  }

  /*
  getLargestPossibleNumber()
    return largestPossibleNumber
  */

  public int getLargestPossibleNumber() {
    return largestPossibleNumber;
  }

  /*
  getMaximumNumberOfGuesses()
    return maximumNumberOfGuesses
  */

  public int getMaximumNumberOfGuesses() {
    return maximumNumberOfGuesses;
  }

  /*
  getCurrentMinimumRange()
    return currentMinimumRange
  */

  public int getCurrentMinimumRange() {
    return currentMinimumRange;
  }

  /*
  getCurrentMaximumRange()
    returncurrentMaximumRange
  */

  public int getCurrentMaximumRange() {
    return currentMaximumRange;
  }

  /*
  getGuessTooLow()
    return guessTooLow
  */

  public boolean getGuessTooLow() {
    return guessTooLow;
  }

  /*
  getEasyGame()
    return easyGame
  */

  public boolean getEasyGame() {
    return easyGame;
  }
}