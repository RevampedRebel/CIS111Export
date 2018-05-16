package week6;
import java.util.Scanner;
public class Challenge12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

		/*
		System.out.println("");
		*/
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Store 1: ");
		int a= in.nextInt();
		System.out.println("Enter Store 2: ");
		int b= in.nextInt();
		System.out.println("Enter Store 3: ");
		int c= in.nextInt();
		System.out.println("Enter Store 4: ");
		int d= in.nextInt();
		System.out.println("Enter Store 5: ");
		int e= in.nextInt();
		int a2= a/100, b2=b/100, c2= c/100, d2=d /100, e2= e/100;
		int i = 0;
		System.out.println("");
		System.out.println("SALES BAR CHART");
		System.out.print("Store 1: ");
		for(i=0;i<a2;i++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.print("Store 2: ");
		for(i=0;i<b2;i++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.print("Store 3: ");
		for(i=0;i<c2;i++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.print("Store 4: ");
		for(i=0;i<d2;i++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.print("Store 5: ");
		for(i=0;i<e2;i++) {
			System.out.print("*");
		}
	}

}
