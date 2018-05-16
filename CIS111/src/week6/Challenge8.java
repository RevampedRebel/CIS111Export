package week6;
import java.util.Scanner;
public class Challenge8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		System.out.println("");
		*/
		int y=0, o;
		double i=0, tot = 0, avg;
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("Enter Number of Years:");
			y = in.nextInt();
			if(y<1) {
				System.out.println("You must enter at least 1 year.");
			}
			
			
		}while(y<1);
		
		// Original y val
					o = y;
					
		do {
			for(int c = 1; c<13; c++) {
			System.out.println("Enter inches of rainfall for this month: ");
			i = in.nextInt();
			tot+=i;
			}
			y--;
		}while(y!=0);
		
		avg = (double)tot/(double)o;
		System.out.println("The average monthly rainfall over " + o + " years, or " + (o*12 )+ " was: " + avg + " inches.");
	}

}
