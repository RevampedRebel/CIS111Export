package shortcuts;

public class Averager {
	public static double intAvg(int[] input) {
		int div = input.length, total = 0;
		double out;
		for(int i = 0; i<div;i++) {
			total+=input[i];
		}
		out = (double)total/(double)div;
		return out;
	}
	public static double doubleAvg(double[] input) {
		int div = input.length;
		double out, total = 0;
		for(int i = 0; i<div;i++) {
			total+=input[i];
		}
		out = (double)total/(double)div;
		return out;
	}
}
