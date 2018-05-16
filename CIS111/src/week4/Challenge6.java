package week4;

import java.util.Scanner;

public class Challenge6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println("");
		*/
		
		int time;
		int sec;
		int min;
		System.out.println("Enter amount of seconds.");
		Scanner in = new Scanner(System.in);
		time = in.nextInt();
		if((time/60)>=1) {
			min = time/60;
			sec = time%60;
			System.out.println(min + " Minutes, " + sec + " Seconds.");	
		}
	}

}
