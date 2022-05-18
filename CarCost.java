import java.util.Scanner;

public class CarCost{
	public static void main(String []args){
		
		Scanner inputChoice = new Scanner(System.in);
		
		double carCost;
		double serviceCost;
		double serviceIntervals;
		double kmPerLitre;
		double fuelCost;
		double carOneTotal;
		double carTwoTotal;
		
		double mileage;
		
		int choice;
		
		System.out.println("please enter the number of the operation you want to carry: \n"+
						   "1: Show formula\n2: 1 car calculation\n3: Compare cars\n4:exit");
		choice = inputChoice.nextInt();
		
		switch (choice){
			case 1:
				System.out.println("The formula is: T = car cost + ((mileage/km per Litre)*fuel cost) + ((mileage/service intervals)*service cost)");
				break;
			case 2:
				
				System.out.println("Enter car cost: ");
				carCost = inputChoice.nextDouble();
				
				System.out.println("Enter car service cost: ");
				serviceCost = inputChoice.nextDouble();
				
				System.out.println("Enter car service intervals: ");
				serviceIntervals = inputChoice.nextDouble();
				
				System.out.println("Enter car km per litre: ");
				kmPerLitre = inputChoice.nextDouble();
				
				System.out.println("Enter car fuel cost: ");
				fuelCost =  inputChoice.nextDouble();
				
				System.out.println("Enter the car mileage: ");
				mileage = inputChoice.nextDouble();
				
					carOneTotal= Math.round((carCost+((mileage/kmPerLitre)*fuelCost)+((mileage/serviceIntervals)*serviceCost))*100)/100.0;
					
					System.out.println("Your car cost is: "+carOneTotal);
					
				break;
				
			case 3:
				System.out.println("Enter car 1 cost: ");
				carCost = inputChoice.nextDouble();
				
				System.out.println("Enter car 1 service cost: ");
				serviceCost = inputChoice.nextDouble();
				
				System.out.println("Enter car 1 service intervals: ");
				serviceIntervals = inputChoice.nextDouble();
				
				System.out.println("Enter car 1 km per litre: ");
				kmPerLitre = inputChoice.nextDouble();
				
				System.out.println("Enter car 1 fuel cost: ");
				fuelCost =  inputChoice.nextDouble();
				
				System.out.println("Enter the car 1 mileage: ");
				mileage = inputChoice.nextDouble();
				
					carOneTotal= Math.round((carCost+((mileage/kmPerLitre)*fuelCost)+((mileage/serviceIntervals)*serviceCost))*100)/100.0;
				
				System.out.println("Enter car 2 cost: ");
				carCost = inputChoice.nextDouble();
				
				System.out.println("Enter car 2 service cost: ");
				serviceCost = inputChoice.nextDouble();
				
				System.out.println("Enter car 2 service intervals: ");
				serviceIntervals = inputChoice.nextDouble();
				
				System.out.println("Enter car 2 km per litre: ");
				kmPerLitre = inputChoice.nextDouble();
				
				System.out.println("Enter car 2 fuel cost: ");
				fuelCost =  inputChoice.nextDouble();
				
				System.out.println("Enter the car 2 mileage: ");
				mileage = inputChoice.nextDouble();
				
					carTwoTotal= Math.round((carCost+((mileage/kmPerLitre)*fuelCost)+((mileage/serviceIntervals)*serviceCost))*100)/100.0;
				
				System.out.println("The Total car cost for Car 1 is: "+carOneTotal+"\n\nCar 2 total is: "+carTwoTotal);
				
					if (carOneTotal>carTwoTotal){
						System.out.println("\nCar one is more expensive than car two");
					} else {
						System.out.println("\nCar two is more expensive than car one");
					}
				break;	
				
			
			case 4:
				System.out.println("\n\nProgram terminated succesfully\n\nThank you for using the car price calculator program!\n");
			break;
			
			default:
			System.out.println("Please enter a valid choice");
			break;
		}
						   
		
	}
}