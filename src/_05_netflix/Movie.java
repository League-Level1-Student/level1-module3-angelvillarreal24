package _05_netflix;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class Movie implements Comparable<Movie> {

	public static void main(String[] args) {
		Movie movie = new Movie("Twilight", 1);
		System.out.println(movie.getTicketPrice());
		Movie bruh = new Movie("Star Wars: Bruh Moment ", 4);
		Movie lol = new Movie("The Pursuit of Happiness", 5);
		Movie nonbad = new Movie("Coco", 100000);
		Movie reallybad = new Movie("Frozen",3);

		NetflixQueue n = new NetflixQueue();

		n.addMovie(movie);
		n.addMovie(bruh);
		n.addMovie(lol);
		n.printMovies();



		System.out.println("The Best Movie is " + n.getMovie(2));
		System.out.println("The second Best Movie is " + n.getMovie(1));



	}

	private String title;
	private int stars;

	public Movie(String title, int stars) {
		this.title = title;
		this.stars = stars;
	}

	public String getTitle() {
		return this.title;
	}

	public int getRating() {
		return this.stars;
	}

	public String toString() {
		return "\"" + title + "\" - " + stars + " stars";
	}

public String getTicketPrice() {
		if (this.stars > 2) {
			return "That will be $12 please.";
		} else if (this.title.contains("Twilight")) {
			return "This movie is so bad, we'll pay YOU to watch it!";
		} else {
			return "Don't waste your money on this horrible rubbish.";
		}
	}
 

	public int compareTo(Movie otherMovie) {
		int compareQuantity = otherMovie.getRating();

		// return this.stars - compareQuantity; //ascending order
		return compareQuantity - this.stars; // descending order
	}
}
