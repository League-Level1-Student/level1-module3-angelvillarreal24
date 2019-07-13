package _01_intro_to_static;

public class Athlete {
    static int nextBibNumber;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed, String raceLocation, String raceStartTime){
        this.name = name;
        this.speed = speed;
    }

    public static void main(String[] args) {
    	int number = 0;
    	
    	Athlete Bob = new Athlete("Bob", 3, "Manhattan","6.00pm");
    	System.out.print(Bob.name);
    	System.out.print(" ");
    	number++;
    	System.out.print(number);
    	System.out.print(" ");
    	System.out.println(raceLocation);
    	
    	Athlete Jack = new Athlete("Jack", 5);
    	System.out.print(Jack.name);
    	System.out.print(" ");
    	number++;
    	System.out.print(number);
    	System.out.print(" ");
    	System.out.println(raceLocation);
    	
    	
    	//create two athletes
        //print their names, bibNumbers, and the location of their race. 
    }
}

