package week4;
import java.util.Scanner;
public class Challenge12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println("");
		*/
		String medium;
		System.out.println("Enter medium of sound:");
		Scanner in = new Scanner(System.in);
		medium = in.nextLine();
		int distance;
		System.out.println("Enter distance the sound must travel: ");
		distance = in.nextInt();
		int speed=0;
		if(medium.equals("Air")) {
			speed = 1100;
		}
		if(medium.equals("Water")) {
			speed = 4900;
		}
		if(medium.equals("Steel")) {
			speed = 16400;
		}
		double time = (double)distance/(double)speed;
		
		System.out.println("That will take " + time + " seconds.");
		
		
	}

}
