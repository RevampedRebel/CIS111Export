package shortcuts;

public class Extras {
	
	public static int exponent(int input, int x) {
		int total = input;
		for(int i = 0;i<(x-1);i++) {
			total*=input;
		}
		return total;
	}
	
	public static double exponentDouble(double input, double x) {
		double total = input;
		for(double i = 0;i<(x-1);i++) {
			total*=input;
		}
		return total;
	}
	
	public static double quadraticEqn1(double a, double b, double c) {
		/*    -b+- sqrt(b^2 - 4ac)
		 * x= ---------------------
		 *				2a
		 */   
		
		double out;
		out = ((b * (-1))+Math.sqrt((Math.pow(b, 2)) - (4*a*c)))/(2*a);
		return out;
	}
	
	public static double quadraticEqn2(double a, double b, double c) {
		/*    -b+- sqrt(b^2 - 4ac)
		 * x= ---------------------
		 *				2a
		 */   
		
		double out;
		out = ((b * (-1))-Math.sqrt((Math.pow(b, 2)) - (4*a*c)))/(2*a);
		return out;
	}

}
