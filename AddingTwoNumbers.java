import java.util.Scanner;

public class AddingTwoNumbers {

public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);
		
		//int a;
		//int b; 
		//there's no need to declare the integers before wasting time as you can define them
		//when you read the input, if you want to declare them before you have to remove the "int" when reading the input
		int result;
		
		System.out.println("Enter your first number: ");
		int a = numberInput.nextInt();
		
		System.out.println("Enter your second number: ");
		int b = numberInput.nextInt();
		
		result = a + b;
		
		System.out.printf("Your result is: %d",result);
}
}