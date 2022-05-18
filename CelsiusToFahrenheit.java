import java.util.Scanner;

public class CelsiusToFahrenheit{
	public static void main(String [] args){
		//The formula to convert °C to °F(0°C × 9/5) + 32 = 32°F
		Scanner numberEntered= new Scanner(System.in);
		
		int choice;
		double tempInF;
		double tempInC;
		
		System.out.println("Enter 1 to convert to Fahrenheit, enter 2 to convert to Celsius and 3 to exit the program: ");
		choice = numberEntered.nextInt();
		
		switch(choice){			//switch statement integrates the "case" function of an element/var previously declared
			
			case 1:
			
				System.out.println("Enter the temperature in \u00B0"+"C that you want to convert: ");
				double temperatureF = numberEntered.nextInt();
		
				tempInF = ((temperatureF*9/5)+32);
		
					double roundedtempInF = Math.round(tempInF*100)/100.0;
					double roundedtemperatureF = Math.round(temperatureF*100)/100.0;
		
				System.out.println("The temperature you entered was: " + roundedtemperatureF + "\u00B0" + "C\nThe equivalent in Fahrenheit is: " + roundedtempInF + "\u00B0" + "F");
				
			break;	
				
			
				
			case 2:
			
				System.out.println("Enter the temperature in \u00B0"+"F that you want to convert: ");
				double temperatureC = numberEntered.nextInt();
		
				tempInC = ((temperatureC-32)*5/9);
		
					double roundedtempInC = Math.round(tempInC*100)/100.0;
					double roundedtemperatureC = Math.round(temperatureC*100)/100.0;
		
				System.out.println("The temperature you entered was: " + roundedtemperatureC + "\u00B0" + "F\nThe equivalent in Celsius is: " + roundedtempInC + "\u00B0" + "C");
				
				
				
			break;
				
			case 3:
				
				
			break;
				
			default: //must create a case where the user doesn't input a right var so that the program doesn't crash
			
				System.out.println("Please enter a valid number (1 for Celsius, 2 for Fahrenheit and 3 to exit)");
				//break;
				
		}	
	}
}