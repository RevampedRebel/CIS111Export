package midterm;
import java.util.*;
public class Prob7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int add = 0, in=1;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Enter an integer:");
			in = input.nextInt();
			if(in!=0) {
				if(in>0) {
					add+=in;
					// Confirming functionality
					System.out.println("Added " + in);
					System.out.println();
				}
				else {
					System.out.println("Negative inputs will not be added.");
					System.out.println();
				}
				
			}
			
		}while(in !=0);
		System.out.println();
		System.out.println("Total is: " + add);
	}

}
