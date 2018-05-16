package challengeTester;

import randomWalk.Rwalk;
import java.util.*;

public class DrunkWalk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 System.out.println();
		 */
		
		int cSurvive=0, cFall=0, cDrunks=0, mDrunks, edge, mSteps;
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter number of times to run: ");
		mDrunks = inp.nextInt();
		System.out.println("Enter dock size: ");
		edge = inp.nextInt();
		System.out.println("Enter maximum number of attempted steps: ");
		mSteps = inp.nextInt();
		
		int minSteps = mSteps;
		
		
		
		
		// public Rwalk(int sX, int xY, int mSteps, int squares)
		int[] stepsUntilFall = new int[mDrunks];
		boolean[] didFall = new boolean[mDrunks];
		Rwalk[] drunks = new Rwalk[mDrunks];
		
		
		
		do {
			int newX = (int)(Math.random()*(edge-1));
			int newY = (int)(Math.random()*(edge-1));
			Rwalk template = new Rwalk(newX, newY, mSteps, edge);
			drunks[cDrunks] = template;
			
			for(int i = 0; i < mSteps; i++) {
			drunks[cDrunks].takeStepNoOut();
			if(drunks[cDrunks].inBounds() == false) {
				cFall++;
				stepsUntilFall[cDrunks] = i+1;	
				i=mSteps;
				didFall[cDrunks] = true;
			}
			else {
				stepsUntilFall[cDrunks] = 0;
				didFall[cDrunks] = false;
				cSurvive++;
			}
			
			}
			
			cDrunks++;
			
		}while(cDrunks < mDrunks);
		
		for(int i = 0; i<mDrunks; i++) {
			if(stepsUntilFall[i]<minSteps) {
				minSteps = stepsUntilFall[i];
			}
		}
		
		
		System.out.println("Test over. Out of " + mDrunks + " tests, " + cFall + " of the drunks fell, and " + (mDrunks - cFall) + " of the drunks survived.");
		
		
		
		
	}

}
