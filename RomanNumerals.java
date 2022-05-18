import java.util.Scanner;

public class RomanNumerals{

    public static int romanNumeralToInt(char romanNumeral){

        switch(romanNumeral){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M': 
                return 1000;
            default: 
                return 0;
        }

    }

    public static int convertRomanString(String romanString){

        int finalSum = 0;

        int[] romanStringArray = new int[romanString.length()];

        for (int i = 0; i<romanString.length(); i++){
            romanStringArray[i] = romanNumeralToInt(romanString.charAt(i));
        }

        for (int i = 0; i<romanStringArray.length; i++){

            if(romanStringArray[i] == 1 && i!=romanStringArray.length-1){
                if ((romanStringArray[i+1] == 5 || romanStringArray[i+1] == 10 || romanStringArray[i+1] == 50 || romanStringArray[i+1] == 100 || romanStringArray[i+1] == 500 || romanStringArray[i+1] == 1000)&& romanStringArray[i+1]!=1){
                    finalSum -= 2;
                }
            }
            finalSum += romanStringArray[i];
        }

        return finalSum;

    }

    public static void main (String[]args){

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the Roman string you want to convert: ");
        String romanString = in.nextLine();

        System.out.println(convertRomanString(romanString.toUpperCase()));
        in.close();
    }
}