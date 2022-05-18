import java.util.Scanner;

public class Valid{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day,month,year;
		boolean validDay,validMonth;
		boolean leapYear;
		
	System.out.println("enter day");
	day = scanner.nextInt() ;
	System.out.println("enter month");
	month =  scanner.nextInt() ;
	System.out.println("enter year");
	year =  scanner.nextInt() ;
	
	int daysInMonth;
	validMonth = month <= 12 && month >= 1;
			
			leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
			
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
             daysInMonth = 31;
			 if ((day > 0) && (day<=daysInMonth)) {
			validDay = true;
			System.out.println("this is a valid date, you entered: "+day+"/"+month+"/"+year);
			 } else System.out.println("this date is not valid");
			}
			
			if ( month == 4 || month == 6 || month == 9 || month == 11){
			daysInMonth = 30;
			if ((day > 0) && (day<=daysInMonth)) {
			validDay = true;
			System.out.println("this is a valid date, you entered: "+day+"/"+month+"/"+year);
			 } else System.out.println("this date is not valid");
			}
			if  (month == 2 ){
			daysInMonth = 28;
				if ((leapYear)&&(month==2)){
				daysInMonth = 29;
			if (day >= 1 && day<=daysInMonth) {
			System.out.println("this is a valid date, you entered: "+day+"/"+month+"/"+year);
			validDay = true;
			} else if ((day > 0) && (day<=daysInMonth)) {
			validDay = true;
			System.out.println("this is a valid date, you entered: "+day+"/"+month+"/"+year);
				}
			}	
		}
	}
}
