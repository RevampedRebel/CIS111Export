package challengeTester;

import classes.*;
import shortcuts.*;

public class EployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// public Employee(String name, int id, String dpt, String pos)
		Employee Susan = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
		Employee Mark = new Employee("Mark Jones", 39119, "IT", "Programmer");
		Employee Joy = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
		
		System.out.println("Format:");
		String in = "Name, ID Number, Department, Position";
		ListFormatter.format(in);
		
		System.out.println(Susan.toString());
		System.out.println(Mark.toString());
		System.out.println(Joy.toString());
		
		
		
	}

}
