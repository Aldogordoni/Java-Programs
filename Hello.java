public class Hello{
    public static void main(String []args){

        
		double length = 1.609*5.5;
		double roundedLength = Math.round(length*10000)/10000.0;
		
        System.out.println("Hello world!");
        System.out.println("The distance between campuses is "+ roundedLength + "km.");
    }
}