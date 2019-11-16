package _06_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridRun {
	public static void main(String[] args) {
		World world = new World();
		world.show();
		Bug bug = new Bug();
		Bug bug2 = new Bug();
		
		int y = 0;
		
		Flower flower1 = new Flower();
		Flower flower2 = new Flower();
		
		bug.setColor(Color.blue);
		
		for(int i = 0; i < 2; i++) {
			bug.turn();
		}
		
		Location bruh = new Location(1,1);
		Location bruh2 = new Location(2,1);
		Location bruh3 = new Location(0,1);
		Location bruh4 = new Location(6,9);
//		Location bruh = new Location(1,1);
//		Location bruh = new Location(1,1);
//		Location bruh = new Location(1,1);
//		Location bruh = new Location(1,1);
//		Location bruh = new Location(1,1);
		world.add(bruh, bug);
		world.add(bruh4, bug2);
		world.add(bruh2, flower1);
		world.add(bruh3, flower2);
		
		for(int i = 0; i < 11; i++) {
			if(i == 10) {
				i = 0;
				y+=1;
			}
			if(y == 10) {
				y = 0;
			}
			
			Location bruh9000 = new Location(i , y);
			Flower flower9000 = new Flower(Color.BLACK);
			world.add(bruh9000, flower9000);
			
			
		}
		
	}
	
}
