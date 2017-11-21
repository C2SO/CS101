public class SwitchGrades
{
  public static void main(String [] args)
  {
    //We have a number of mutually exclusive conditions,
    //  different code for different conditions.
    //  Example, assign a letter grade to a quiz score.
    
    int score = 23;
    //score above 8 is A
    //score of 8 is B
    //score of 7 is C
    //score of 6 is D
    //score below 6 is F
    
    char grade = 'U';
    switch(score)
    {
      case 10:
      case  9: grade = 'A';
               break;
      case  8: grade = 'B';
               break;
      case  7: grade = 'C';
               break;
      case  6: grade = 'D';
               break;
      case  5:
      case  4:
      case  3:
      case  2:
      case  1:
      case  0: grade = 'F';
               break;
      default: System.out.println("invalid score");
                                           
    }        
  }
}