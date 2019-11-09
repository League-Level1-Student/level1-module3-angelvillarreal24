package _06_gridworld;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridRun {
	public static void main(String[] args) {
      //Hans stop looking at my screen!!!
		World world = new World();
		world.show();
		Bug bug = new Bug();
		Bug bug2 = new Bug();
		
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
	}
	
}
