package week3;

import java.util.Scanner;

public class Challenge13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double meal;
		System.out.println("Enter Meal Cost: ");
		Scanner inp = new Scanner(System.in);
		meal = inp.nextDouble();
		double tax = meal*0.67;
		double tip = meal * 0.2;
		double total = meal + tax + tip;
		
		System.out.println("Meal Charge: " + meal + "  Tax: " + tax + "   Suggested Tip: " + tip);
		
		System.out.println("Your total tonight is: " +total);
		
		
		
	}

}
