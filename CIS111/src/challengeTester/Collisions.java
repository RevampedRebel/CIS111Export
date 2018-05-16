package challengeTester;

import randomWalk.Rwalk;
import java.util.*;

public class Collisions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// public Rwalk(int sX, int xY, int mSteps, int squares)
		Rwalk p1 = new Rwalk( -3, 0, 10000000, 2000000);
		Rwalk p2 = new Rwalk( 3, 0, 10000000, 2000000);
		int collisions = 0;
		
		
		
		for(int i = 0; i < 10000000; i++) {
		collide(p1, p2);
		
		if(didCollide(p1, p2) == true) {
			collisions++;
		}
			
		} // End of For
		
		// Outputs
		System.out.println("");
		System.out.println("Test Completed. Collision Count: " + collisions);
		
		
		

	}
	
	
	
		public static void collide(Rwalk p1, Rwalk p2) {
			 int collideX;
			 int collideY;
			 
			p1.takeStepNoOut();
			p2.takeStepNoOut();
			
			int p1x = p1.getcX();
			int p1y = p1.getcY();
			
			int p2x = p2.getcX();
			int p2y = p2.getcY();
			
			if(p1x == p2x && p1y == p2y) {
				collideX = p1x;
				collideY = p1y;
				System.out.println("Hit! Coordinates: (" + collideX + ", " + collideY + ")");
			}
		} // End of Method
		
		public static boolean didCollide(Rwalk p1, Rwalk p2) {
			int p1x = p1.getcX();
			int p1y = p1.getcY();
			
			int p2x = p2.getcX();
			int p2y = p2.getcY();
			if(p1x == p2x && p1y == p2y) {
				return true;
			}
			else {
				return false;
			}
			
			
		}
	
	
	
	

}
