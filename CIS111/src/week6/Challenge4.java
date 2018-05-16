package week6;
import java.util.Scanner;
public class Challenge4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		System.out.println("");
		*/
		int days;
		
		double salary=1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number of Days: ");
		days = in.nextInt();
		double total = 0;
		if(days>0) {
		for(int i = 0; i<days;i++) {
			salary*=2;
		}
		
		System.out.println("After " + days + ", you made $" + (salary/100)+".");
		}
		else {
			System.out.println("You have entered an invalid number of days!");
		}
		
	}

}
