/**
 * 
 * Profile Class that takes in a profile, using arrays for interests and 
 * activity groups and arraylist for friend list
 * @author Fjoraldo Gordoni 
 * @version 1.0.0
 * 
 */

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Profile{

    private String firstName;
    private String lastName;
    private int day;
    private int month;
    private int year;
    private String emailAddress;
    private String[] interests;
    private String[] actAndGrp;
    private ArrayList<Profile> friendList = new ArrayList<Profile>();

    //uses decimal format to ensure the following of DD/MM/YYYY
    DecimalFormat decFormat = new DecimalFormat("00");
    DecimalFormat yearFormat = new DecimalFormat("0000");

    public Profile(String firstName, String lastName, int day,
     int month, int year, String emailAddress, String[] interests,
     String[] actAndGrp){

        
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setDOB(day, month, year);
        this.setEmailAddress(emailAddress);
        this.setInterests(interests);
        this.setActAndGrp(actAndGrp);

    }

    //getters and setters
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    /**
     * uses the decimal format function to print the DOB in the right format
     * @return returns the string previously set
     */
    public String getDateOfBirth(){
        String dob = decFormat.format(this.day) + "-" + decFormat.format(this.month) + "-" + this.year;
        return dob;
    }

    public void setDOB(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String[] getInterests() {
        return interests;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }

    public String[] getActAndGrp() {
        return actAndGrp;
    }

    public void setActAndGrp(String[] actAndGrp) {
        this.actAndGrp = actAndGrp;
    }


    /**
     * function that adds friends in the friend list
     * @param p is the profile that will be added in the friend list
     */
    public void insertFriend(Profile p){
        friendList.add(p);
    }

    /**
     * Function that returns a specific profile in a friend list
     * @param i is the position of the friend 
     * @return the friend found
     * @throws IllegalArgumentException is thrown if a profile is not found
     */
    public Profile getFriend(int i) throws IllegalArgumentException{
        
        if (friendList.get(i) == null){
            throw new IllegalArgumentException("Friend record not found - check number");
        } else {
            return friendList.get(i);
        }
        
    }

    /**
     * function that returns the size of the friend list
     */
    public int numOfFriends(){
        return friendList.size();
    }

    /**
     * function that puts the profile content into a string to be printed
     * used mostly for testing
     */
    public String toString(){
        String result = getFirstName() + ", " + getLastName() + ", " +
        getDateOfBirth() + ", " + getEmailAddress();
        return result;
       }



}