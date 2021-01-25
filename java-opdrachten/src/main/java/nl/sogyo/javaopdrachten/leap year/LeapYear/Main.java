import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 

public class Main {

	public static void main(String[] args) throws IOException  {
		
		// get user input for the year
		int year = getYear();
		// call the leapYear function to see whether 
		// the user input year is a leap year
		leapYear(year);
		
	}
	
	public static int getYear() throws IOException {
		System.out.println("Give year as number"); 
		BufferedReader reader =  
                new BufferedReader(new InputStreamReader(System.in)); 
      
     // Reading data using readLine 
     String year = reader.readLine(); 

     // change to intriguer
     int year_int = Integer.parseInt(year);    
		return year_int;
		
	}
	
	public static void leapYear(int s) {
		// check whether the number can be cleanly divided by 4,100 and 400  
		boolean isDivisibleBy4 = s % 4 == 0;
		boolean isDivisibleBy100 = s % 100 == 0;
		boolean isDivisibleBy400 = s % 100 == 0 & s % 400 == 0;
		
		// check with true and false statements whether the year is a leap year
		if (isDivisibleBy100 == true) {
			if (isDivisibleBy400 == true & isDivisibleBy4 == true ) {
				System.out.println("Leap Year");
			}
			else {
				System.out.println("not a Leap Year"); 
			}
			
		}
		else {
			if (isDivisibleBy4 == true) {
				System.out.println("Leap Year");
			}
			else {
				System.out.println("not a Leap Year"); 
			}
		}
		
	}
}
