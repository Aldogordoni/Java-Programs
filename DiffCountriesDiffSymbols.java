import java.util.Scanner;
import java.text.DecimalFormat;

public class DiffCountriesDiffSymbols{
	public static void main(String [] args){
		Scanner numEntered = new Scanner(System.in);
		DecimalFormat ukAndUs = new DecimalFormat("#,##0.0");
		DecimalFormat restOfWorld = new DecimalFormat("#' '##0");
		
		String n; //will use this variable to convert the number input into a string
		
		System.out.println("Please enter the number that you want to display: ");
		double x = numEntered.nextInt();
		
		
		
		//n=Integer.toString(x); //conversion of an int to a String
		System.out.println("Your numer is displayed like this in Uk and US: "+ukAndUs.format(x));
		System.out.println("\nYour number is displayed like this in the rest of the world: "+restOfWorld.format(x));
		
	}
}