package _01_intro_to_static;

public class Athlete {
	static int nextBibNumber;
	static String raceLocation = "San Diego";
	static String raceStartTime = "5.00pm";

	String name;
	int speed;

	Athlete(String name, int speed) {
		this.name = name;
		this.speed = speed;
		nextBibNumber++;
	}

	public static void main(String[] args) {
		Athlete Bob = new Athlete("Bob", 3);
		System.out.println(Bob.name);
		System.out.println("Bib Number: " + nextBibNumber);
		System.out.println("Race Location: " + raceLocation);
		System.out.println(raceStartTime);
		System.out.println(" ");

		Athlete Jack = new Athlete("Jack", 5);
		System.out.println(Jack.name);
		System.out.println("Bib Number: " + nextBibNumber);
		System.out.println("Race Location: " + raceLocation);
		System.out.println(raceStartTime);
		System.out.println(" ");

		// create two athletes
		// print their names, bibNumbers, and the location of their race.
	}
}
