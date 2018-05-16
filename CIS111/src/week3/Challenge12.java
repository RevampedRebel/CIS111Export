package week3;

import java.util.Scanner;

public class Challenge12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String city;
		String find;
		Scanner stdin = new Scanner(System.in);
		
		/*
		 * Just holding onto this for copy and paste. I'm lazy.
		System.out.println();
		*/
		
		System.out.println("Enter the name of your favorite city.");
		city = stdin.nextLine();
		int x;
		int i = city.length();
		int cUpper=0;
		
		String upper = city.toUpperCase();
		String lower = city.toLowerCase();
		String first = city.substring(0, 1);
		
		/*for(x=0;x<=i;x++) {
			
			I misread the initial question. Figured it couldnt hurt to just have this here should I need it later. Commented the section out for the time being.
			find = city.substring(x, x);
			if(find.equals("A") || find.equals("B") || find.equals("C") || find.equals("D") || find.equals("E") || find.equals("F") || find.equals("G") || find.equals("H") || find.equals("I") || find.equals("J") || find.equals("K") || find.equals("L") || find.equals("M") || find.equals("N") || find.equals("O") || find.equals("P") || find.equals("Q") || find.equals("R") || find.equals("S") || find.equals("T") || find.equals("U") || find.equals("V") || find.equals("W") || find.equals("X") || find.equals("Y") || find.equals("Z")) {
				
				cUpper++;
			}*/
		
		
		
		// Outputs
		System.out.println("String Length: " +i);
		System.out.println("City in Upper Case: " + upper);
		System.out.println("City in Lowe Case: " + lower);
		System.out.println("First Letter: " + first);
		
		
		
		
		
	}

}
