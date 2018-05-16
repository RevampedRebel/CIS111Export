package week4;
import java.util.Scanner;
public class Challenge9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println("");
		*/
		int weight;
		System.out.println("Enter the weight of the package: ");
		Scanner in = new Scanner(System.in);
		weight = in.nextInt();
		
		if(weight<=2) {
			System.out.println("The rate is $1.10 per 500 miles.");
		}
		if(weight>2 && weight <= 6){
			System.out.println("The rate is $2.20 per 500 miles.");	
		}
		if(weight>6 && weight <= 10){
			System.out.println("The rate is $3.70 per 500 miles.");
		}
		if(weight>10) {
			System.out.println("The rate is $3.80 per 500 miles.");
		}
		
	}

}
