import java.util.Scanner;

public class ConvertCmToInches{
	
	public static void main (String[] args){
		Scanner length = new Scanner(System.in);
		
		double inches;
		
		System.out.println("Please enter the length in mm that you want to convert: ");
		int mm = length.nextInt();
		
		inches = mm*25.4;
		inches = Math.round(inches*100)/100.0;
		
		System.out.println(mm + "mm in inches is equivalent to: " + inches+ " inches");
		
	}	
}