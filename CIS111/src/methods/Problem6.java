package methods;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		shortcuts.ListFormatter.format("Table of Farenheit Conversions: 0 - 20 degrees");
		
		System.out.println("");
		for(int i = 0; i<21; i++){
			System.out.println("Farenheit: " + i + "   Celsius: " + celsius(i));
		}
	}
	
	public static double celsius(int f) {
		double c;
		double p1 = (5.0/9.0);
      double p2 = (double)f - 32;
		c = p1*p2;
		
		return c;
		
	}

}
