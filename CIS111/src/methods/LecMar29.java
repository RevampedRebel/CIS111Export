package methods;

public class LecMar29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {10, 15, 37, -6, 112};
		int sum = 0, min = x[0], minv = 0;
		for(int i = 0; i<x.length;i++) {
			sum+=x[i];
			if(x[i] > min) {
				min=x[i];
				minv = i;
			}
		}
		int avg =sum/x.length;
		System.out.print("The smallest value is: " + min + ", which is located in slot: " + minv + "\n");
		System.out.print("The average value is: " + avg);
	}

}
