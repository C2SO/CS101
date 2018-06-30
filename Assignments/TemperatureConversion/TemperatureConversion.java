/* Temperature Conversion
   Anderson, Franceschi
   Rahbany, Nicholas
*/

public class TemperatureConversion
{
   public static void main( String [] args )
   {
      //***** 1. declare any constants here
      
//       double cToF = ((celsiusDouble * 9) / 5) + 32;
//       double fToC = ((fahrenheitValue - 32) * 5) / 9;

      //***** 2.  declare temperature in Fahrenheit as an int 

      int fahrenheitValue = 210;
	  	  		
      //***** 3. calculate equivalent Celsius temperature	
      
      double fahrenheitDouble = fahrenheitValue;
      double celsius = ((fahrenheitValue - 32) * 5) / 9;
      double celsiusDouble = ((fahrenheitDouble - 32) * 5) / 9;
      System.out.println();
	  		
      //***** 4. output the temperature in Celsius
      
      System.out.println("Temperature in Celsius: " + (int)(celsius) + " degrees");
												  
      //***** 5. convert Celsius temperature back to Fahrenheit
      
      double fahrenheitEquation = ((celsiusDouble * 9) / 5) + 32;
				
      //***** 6. output Fahrenheit temperature to check correctness 

      System.out.println("Temperature in Fahrenheit: " + (int)(fahrenheitEquation) + " degrees");		
				
   }
} 