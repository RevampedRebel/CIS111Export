package week3;
import java.util.Scanner;

public class Challenge14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int males;
		int females;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number of Males:");
		males = in.nextInt();
		System.out.println("Enter Number of Females:");
		females = in.nextInt();
		int total = males + females;
		double pmale = ((double)males /(double)total)*100;
		double pfemale = ((double)females /(double)total)*100;
		
		System.out.println("In a class consisting of " + total + " students, " + pmale + "% of the class consists of males, and " + pfemale + "% of the class consists of females.");
	}

}
