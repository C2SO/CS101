public class IfElseIf
{
  public static void main(String [] args)
  {
    //We have a number of mutually exclusive conditions,
    //  different code for different conditions.
    //  Example, assign a letter grade to a quiz score.
    
    int score = 7;
    //score above 8 is A
    //score of 8 is B
    //score of 7 is C
    //score of 6 is D
    //score below 6 is F
    
    char grade = 'U';
    if (score > 8)
      grade = 'A';
    else if (score == 8)
      grade = 'B';
    else if (score == 7)
      grade = 'C';
    else if (score == 6)
      grade = 'D';
    else
      grade = 'F';        
  }
}