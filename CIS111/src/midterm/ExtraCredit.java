package midterm;

import java.util.Scanner;

public class ExtraCredit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				/*
				System.out.println();
				*/
		
		/* Scratch Pad
		  for(x=0;x<y;x++) {
				System.out.print("*");
			}
			System.out.println();
		 
		 */
		int in, i, x, y, stop;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		in = input.nextInt();
		x = in;
		y= x;
		stop = in - 1;
		
		// First Half
		for(i=1;i<stop;i++) {
			for(x=y;x>0;x--) {
				System.out.print("*");
			}
			y-=1;
			System.out.println();
		}
		System.out.println("** **");
		// Second half
		y = 3;
		
		for(i=1;i<stop;i++) {
			for(x=y;x>0;x--) {
				System.out.print("*");
			}
			y+=1;
			System.out.println();
		}
		
	}

}
