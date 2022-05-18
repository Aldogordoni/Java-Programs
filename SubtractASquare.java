/* This program is a turn-based game with 2 players where each player 
takes out a square number of coins from defined heaps.
The player who can't subtract any more coins from the heaps loses. 
Code written by Fjoraldo Gordoni, aiming for Lvl 3. */

import java.util.Scanner;
//this library imports the exceptions thrown when the Scanner reads an erroneous type of input
import java.util.InputMismatchException;

//I created a Heap object to simplify the code's structure behind the value assignment of each heap
class Heap{

    private static final int DEFAULT_HEAP_VALUE = 13;
    private int heapValue;

    //default constructor of Heap class
    Heap(){
        this.heapValue = DEFAULT_HEAP_VALUE;
    }

    //override constructor fo Heap class
    Heap(int heapValue){
        this.heapValue = heapValue;
    }

    //getter of heapValue
    public int getCoins(){
        return heapValue;
    }

    //subtracts a chosen amount from the current heap value
    public void subtract(int subCoins){
        heapValue -= subCoins;
        if (heapValue<0){
            heapValue = 0;
        }
    }
}

public class SubtractASquare{

    //used global variables to be able to use them in functions outside main
    private static Heap[] heapArray;

    private static int heapChoice;
    private static int coinsChoice;

    //identifies which player's turn it is
    private static boolean isPlayerOne = true;
    
    private static final String PLAYER_ONE_CHOICE = "Player 1: choose a pile: "; 
    private static final String PLAYER_TWO_CHOICE = "Player 2: choose a pile: ";
    private static final String COINS_CHOICE = "Now choose a square number of coins: ";
    private static final String VICTORY_PLAYER_ONE_MESSAGE = "Player 1 wins!";
    private static final String VICTORY_PLAYER_TWO_MESSAGE = "Player 2 wins!";
    private static final String ERROR_HEAP_NUM = "The heap you chose is not valid";
    private static final String ERROR_COINS_SIZE = "The number of coins you chose is "
    + "greater than the number of coins in the heap";
    private static final String ASK_VALID_SQUARE_NUM = "Please enter a valid square number";
    private static final String ASK_POSITIVE_NUM = "Please enter a positive number";

    //function that outputs the current number of remaining coins
    public static void remainingCoins(){

        //this string is not final so that I can append the coins inside each heap
        String remainingCoins = "Remaining coins: ";

        for (int i=0; i<heapArray.length; i++){
            remainingCoins += heapArray[i].getCoins()+", ";
        }
        //removes ", " from the last part of the string
        remainingCoins = remainingCoins.substring(0, remainingCoins.length()-2);
        System.out.println(remainingCoins);
    }

    //function to check if the input x is a positive integer
    public static int inputInt(Scanner in) throws InputMismatchException, NumberFormatException{

        //checks if the input is exactly a single integer number (avoids nextInt() error with "1 2 3")
        int x = Integer.parseInt(in.nextLine());

        if (x>0){
            return x;
        } else {
            System.out.println(ASK_POSITIVE_NUM);
            throw new InputMismatchException();
        }
    }

    //function to verify if a number x is a square
    //made it a function so that it's easier to understand and update in case the rules of the game change
    public static boolean isSquare(int x){
        //if x is perfectly divisible by its root, then it's a square number
        return (x % Math.sqrt(x)==0);
    }

    //function to check if the input is a square number x
    public static int inputSquare(Scanner in) throws InputMismatchException{

        int x = inputInt(in);

        if (isSquare(x)){
            return x;
        } else {
            //if the number is not a square outputs error message and throws exception to be catched in main
            System.out.println(ASK_VALID_SQUARE_NUM);
            throw new InputMismatchException();
        }
    }

    //function to check all the array and find if every heap is empty
    public static boolean heapsEmpty(){
        for (int i=0; i<heapArray.length; i++){
            if (heapArray[i].getCoins()!=0){
                return false;
            }
        } 
        return true;
    }

    //function to set the game to the default parameters (3 heaps and 13 coins)
    public static void defaultSettings(){
        final int DEFAULT_HEAP_NUM = 3;

        heapArray = new Heap[DEFAULT_HEAP_NUM];

        for (int i = 0; i<heapArray.length; i++){
            //creates every heap using the default constructor
            heapArray[i] = new Heap();
        }
    }

    //function to set the game to the custom parameters
    //every time an input is erroneous the user is asked if he wants to change game settings
    public static void personalisedSettings(Scanner in){

        System.out.println("Erroneous input: want to change game settings? Y/N");

        String choice = in.nextLine();

        if (choice.equalsIgnoreCase("Y")){
            //try-catch block to catch the input errors (e.g. a letter or a negative number)
            try {
                System.out.println("Enter number of heaps: ");
                int heapNum = inputInt(in);
                System.out.println("Enter number of coins: ");
                int coinsNum = inputInt(in);

                heapArray = new Heap[heapNum];

                for (int i = 0; i<heapArray.length; i++){
                    heapArray[i] = new Heap(coinsNum);
                }

                //sets player one to true to restart the game
                isPlayerOne = true;

            } catch (InputMismatchException e){
                //clears the input error
                in.nextLine();
                personalisedSettings(in);
            } catch (ArrayIndexOutOfBoundsException e){
                personalisedSettings(in);
            }
           
        } else {
            return; 
        }
    }

    public static void main(String[]args){

        Scanner in = new Scanner(System.in); 
        
        //sets game to default settings at the beginning of the program
        defaultSettings();

        while (!heapsEmpty()){
            try {

                remainingCoins();

                if (isPlayerOne){
                    System.out.print(PLAYER_ONE_CHOICE);
                } else {
                    System.out.print(PLAYER_TWO_CHOICE);
                }
                
                //subtracts 1 from heapChoice because array positions start at 0
                heapChoice = inputInt(in)-1;

                if (heapChoice >= heapArray.length){
                    System.out.println(ERROR_HEAP_NUM);
                    throw new InputMismatchException();
                }

                System.out.print(COINS_CHOICE);
                coinsChoice = inputSquare(in);

                //if coinsChoice is smaller or equal to the coins in the chosen heap, performs subtraction
                if (heapArray[heapChoice].getCoins()>=coinsChoice){
                    heapArray[heapChoice].subtract(coinsChoice);
                    //else if it is greater, sends error message and throws the exception
                } else {
                    System.out.println(ERROR_COINS_SIZE);
                    throw new InputMismatchException();
                } 

                //changes player turn
                isPlayerOne = !isPlayerOne;

            } catch (InputMismatchException e){
                //clears input errors and triggers override of parameters
                in.nextLine();
                personalisedSettings(in);
            } catch (NumberFormatException e){
                personalisedSettings(in);
            }
        }

        //undo last player turn change
        isPlayerOne = !isPlayerOne;

        //outputs victory message for the player who emptied the last heap
        if (isPlayerOne){
            System.out.println(VICTORY_PLAYER_ONE_MESSAGE);
        } else {
            System.out.println(VICTORY_PLAYER_TWO_MESSAGE);
        }  

        //closes scanner to prevent memory leaks
        in.close();
    }
}
