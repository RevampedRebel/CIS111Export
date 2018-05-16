package challengeTester;

import java.util.Scanner;

import randomWalk.*;

public class TestWalk {
	/*
	 												System.out.println();
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int squares = 10, sX = 1, sY = 1, mSteps = 200, hardInput;
		
		boolean hardcode;
		// Determination on whether or not the tester will ask for custom values or will just use hardcoded values.
		Scanner input = new Scanner(System.in);
		System.out.println("1 for Hardcoded Values, 2 for Custom, 3 for all 0's, 4 for Start out of Bounds:");
		System.out.println();
		hardInput = input.nextInt();
		
		// Will Ask for User Value Input
		if(hardInput == 2) {
			
			// REMINDER: LOWEST COORDINATE IS 0, HIGHEST IS BOARD SIZE MINUS ONE. STARTING OUT OF BOUNDS WILL IMMEDIATELY TERMINATE.
			
			System.out.println("Enter Starting X Coordinate: ");
			sX = input.nextInt();
			System.out.println("Enter Starting y Coordinate: ");
			sY = input.nextInt();
			System.out.println("Enter Max Number of Steps: ");
			mSteps = input.nextInt();
			System.out.println("Enter Board Size: ");
			squares = input.nextInt();
		}
		// Will use initialized values
		if(hardInput == 1) {
			System.out.println("Hardcoded Vales:");
			System.out.println("Board Size: " + squares + "	Starting X: " + sX + "	Starting Y: " + sY + "	Maximum Steps: " + mSteps);
			
		}
		
		// Will set all values but squares to 0; squares set to 5.
		if(hardInput == 3) {
			sX = 0;
			sY = 0;
			mSteps = 0;
			squares = 5;
		}
		
		
		// public Rwalk(int sX, int xY, int mSteps, int squares)
		Rwalk test1 = new Rwalk(sX, sY, mSteps, squares);
		hardInput = 0;
		System.out.println();
		System.out.println("Enter 1 to use TestWalk. Enter 2 to use Walk Method in Rwalk.");
		hardInput = input.nextInt();
		System.out.println();
		/*
		 * String answer = "(" + cX + ", " + cY + ")" + "		 Subject is Within Boundaries: " + isInBounds() + "		Steps Taken: " + ((maxSteps - stepsLeft));
		 * Answer = (Current X Coordinate, Current Y Coordinate)  Whether or not an x or y value exceeds it's given limits, and a counter of how many steps have been taken.
		 */
		if(hardInput == 1) {
		for(int i = 0; i<mSteps;i++) {
			test1.takeStep();
		System.out.println(test1.toString());
		
		
		}
	}
		
		if(hardInput == 2) {
			test1.walk();
		}
	}

	
	
	
}
