package week4;
import java.util.Scanner;
public class Challenge16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println("");
		*/
		int books;
		System.out.println("How many books have you purchased this month?");
		Scanner in = new Scanner(System.in);
		books = in.nextInt();
		if(books == 0) {
			System.out.println("You have earned 0 points... :( ");
		}
		if(books == 1) {
			System.out.println("You have earned 5 points!");
		}
		
		if(books == 2) {
			System.out.println("You have earned 15 points!");
		}
		
		if(books == 3) {
			System.out.println("You have earned 30 points!");
		}
		
		if(books >= 4) {
			System.out.println("You have earned 60 points!");
		}
		
	}

}
