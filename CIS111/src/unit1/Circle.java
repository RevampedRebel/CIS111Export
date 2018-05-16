package unit1;
import java.util.*;
public class Circle {
	 private static Scanner scan;

	public static void main(String[] args)
	 {
	 final double PI = 3.14159;

	 int radius1 = 10;
	 int radius2 = 20;
	 double area1 = PI * Math.pow(radius1, 2);
	 double area2 = PI * Math.pow(radius2, 2);
	 double circum1 = 2 * PI * radius1;
	 double circum2 = 2 * PI * radius2;
	 
	 // All Scanner Input and Output Lines
	 double circum3;
	 double area3;
	 scan = new Scanner(System.in);
	 System.out.println("Enter third radius value:");
	 int radius3 = scan.nextInt();
	 System.out.println("");
	 
	 area3 = PI * Math.pow(radius3, 2);
	 circum3 = 2 * PI * radius3;
	 
	 System.out.println("The area of a circle with radius " + radius3 +
			 " is " + area3);
			 System.out.println("The circumference of a circle with radius " + radius3 +
					 " is " + circum3);
			 System.out.println("");
	 
	 
	 
	 System.out.println("The area of a circle with radius " + radius1 +
	 " is " + area1);
	 System.out.println("The circumference of a circle with radius " + radius1 +
			 " is " + circum1);
	 System.out.println("");		
	 
	 
	 
	 System.out.println("The area of a circle with radius " + radius2 +
	 " is " + area2);
	 System.out.println("The circumference of a circle with radius " + radius2 +
			 " is " + circum2);
	 System.out.println("");
	 
	 System.out.println("Division of second by first of the area outputs is:" + (area2/area1));
	 System.out.println("Division of second by first of the circum	 outputs is:" + (circum2/circum1));
	 
	 }//End of main
	
} // End of class
