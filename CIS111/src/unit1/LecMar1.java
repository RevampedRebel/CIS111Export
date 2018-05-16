package unit1;

import java.util.Scanner;

public class LecMar1 {

	public static void main(String[] args) {

		// Vars
		double num = 4.0;
		double denom = 1.0;
		
		double estPi = 0;
		int numTerms = 0;
		double newTerm=0;
		
		
		int console = 0;
		
		int count;
		int i = 400000;
		int sign = (int) Math.pow(-1, i);
	
		
		
		// First For
		for(count = 0; count<=i;count++) {
			sign = (int) Math.pow(-1, i);
			newTerm = (num/denom)*sign;
			
			estPi += estPi + newTerm;
			if((i%500)==0) {
				System.out.println(estPi);
			}
			
		
		}
		
		
		
	}

}
