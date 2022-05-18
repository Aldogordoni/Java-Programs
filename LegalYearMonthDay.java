import java.util.Scanner;

public class LegalYearMonthDay{
	public static void main (String[]args){
		
		Scanner choice = new Scanner (System.in);
		
		int day;
		int year;
		boolean leapYear = false;
		
		System.out.println("Please enter the year (number format)");
		 year = choice.nextInt();
		 
			if (year % 4 == 0){
				if (year % 100 == 0){
					if(year % 400 == 0)
							leapYear = true;
						else
							leapYear = false;
				} else leapYear = true;
			} else leapYear = false;
		
			if (0<year){
		
		System.out.println("Please enter the month (number format)");
		int month = choice.nextInt();
		
		switch (month){
			case 1 :
			System.out.println("Please enter the day of the month(number format)");
				 day = choice.nextInt();
				if ((0<day)&&(day<=31)){
					System.out.println("The day you entered is legal, you entered: "+day+" January "+year);
				}else System.out.println("The day you entered is not legal");
			break;
			case 2 :
			System.out.println("Please enter the day of the month(number format)");
				 day = choice.nextInt();
				if (leapYear){
				if ((0<day)&&(day<=29)){
					System.out.println("The day you entered is legal, you entered: "+day+" February "+year);
				}else System.out.println("The day you entered is not legal");
				} else if ((0<day)&&(day<=28)){
					System.out.println("The day you entered is legal, you entered: "+day+" February "+year);
				}else System.out.println("The day you entered is not legal");
			break;
			case 3 :
			System.out.println("Please enter the day of the month(number format)");
				 day = choice.nextInt();
				if ((0<day)&&(day<=31)){
					System.out.println("The day you entered is legal, you entered: "+day+" March "+year);
				}else System.out.println("The day you entered is not legal");
			break;
			case 4 :
			System.out.println("Please enter the day of the month(number format)");
				 day = choice.nextInt();
				if ((0<day)&&(day<=30)){
					System.out.println("The day you entered is legal, you entered: "+day+" April "+year);
				}else System.out.println("The day you entered is not legal");
			break;
			case 5 :
			System.out.println("Please enter the day of the month(number format)");
				 day = choice.nextInt();
				if ((0<day)&&(day<=31)){
					System.out.println("The day you entered is legal, you entered: "+day+" May "+year);
				}else System.out.println("The day you entered is not legal");
			break;
			case 6 :
			System.out.println("Please enter the day of the month(number format)");
				 day = choice.nextInt();
				if ((0<day)&&(day<=30)){
					System.out.println("The day you entered is legal, you entered: "+day+" June "+year);
				}else System.out.println("The day you entered is not legal");
			break;
			case 7 :
			System.out.println("Please enter the day of the month(number format)");
				 day = choice.nextInt();
				if ((0<day)&&(day<=31)){
					System.out.println("The day you entered is legal, you entered: "+day+" July "+year);
				}else System.out.println("The day you entered is not legal");
			break;
			case 8 :
			System.out.println("Please enter the day of the month(number format)");
				 day = choice.nextInt();
				if ((0<day)&&(day<=31)){
					System.out.println("The day you entered is legal, you entered: "+day+" August "+year);
				}else System.out.println("The day you entered is not legal");
			break;
			case 9 :
			System.out.println("Please enter the day of the month(number format)");
				 day = choice.nextInt();
				if ((0<day)&&(day<=30)){
					System.out.println("The day you entered is legal, you entered: "+day+" September "+year);
				}else System.out.println("The day you entered is not legal");
			break;
			case 10:
			System.out.println("Please enter the day of the month(number format)");
				 day = choice.nextInt();
				if ((0<day)&&(day<=31)){
					System.out.println("The day you entered is legal, you entered: "+day+" October "+year);
				}else System.out.println("The day you entered is not legal");
			break;
			case 11:
			System.out.println("Please enter the day of the month(number format)");
				 day = choice.nextInt();
				if ((0<day)&&(day<=30)){
					System.out.println("The day you entered is legal, you entered: "+day+" November "+year);
				}else System.out.println("The day you entered is not legal");
			break;
			case 12:
			System.out.println("Please enter the day of the month(number format)");
				 day = choice.nextInt();
				if ((0<day)&&(day<=31)){
					System.out.println("The day you entered is legal, you entered: "+day+" December "+year);
				}else System.out.println("The day you entered is not legal");
			break;
			default:
				System.out.println("The month you entered is not legal");
			break;
		}
		}else 
		System.out.println("The year you entered is not legal");	
	}
}