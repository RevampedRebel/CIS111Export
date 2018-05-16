package challengeTester;

import shortcuts.*;
import java.util.*;

import classes.Circle;
public class CircleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the desired radius:");
		double radIn = input.nextDouble();
		System.out.println("Format:");
		String out = "Radius in cm, Diameter in cm, Area in cm^2, Circumference in cm:";
		ListFormatter.format(out);
		Circle test1 = new Circle(radIn);
		System.out.println(test1.toString());
	}

}
