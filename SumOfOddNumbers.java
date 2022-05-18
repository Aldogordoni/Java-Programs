import java.util.Scanner;

public class SumOfOddNumbers{
	public static void main(String[]args){
		
		int totalOddNumber=0;
		
		Scanner number = new Scanner (System.in);
		
		System.out.println("Please enter the max odd number");
		int oddSumMax = number.nextInt();
		
		if (oddSumMax%2==1){
			for (int i=1; oddSumMax>=i; i++){
					if (i%2!=0){
					totalOddNumber = totalOddNumber+i;
					}
				} System.out.println("\nThe total of the odd numbers is: "+totalOddNumber);
		} else {
			System.out.println("Please enter a valid odd number");
		}	
	}
}