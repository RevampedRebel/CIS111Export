package methods;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printMany(60);
		
		int[]prices = {5, 120, 45, 54, 99};
		
		System.out.println(average(prices));
		

	}
	
	public static void printMany(int i) {
		for(int x = 0; x <i; x++) {
			System.out.println("Blah blah blah....");
		}
	}

	public static double average(int[] input) {
		int sum = 0;
		for(int i = 0; i<input.length; i++) {
			sum+=input[i];
		}
		 double avg = (double)sum / (double)input.length;
		 return avg;
	}
	
	
}
