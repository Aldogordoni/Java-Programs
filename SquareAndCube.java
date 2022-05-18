import java.util.Scanner;

public class SquareAndCube{
	public static void main (String[]args){
		Scanner in = new Scanner(System.in);
		
		int square;
		int cube;
		
		System.out.println("Please type the number that you want to square and cube: ");
		int number = in.nextInt();
		
		square=number*number;
		cube=number*number*number;
		
		System.out.printf("\nThe square of your number is: %d \n\nThe cube of your number is: %d",square,cube);

	}	
}