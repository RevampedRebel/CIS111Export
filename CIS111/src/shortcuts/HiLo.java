package shortcuts;

public class HiLo {

	
	public static int hiInt(int[] input) {
		int hi = input[0], hiVal = 0;
		for(int i = 0; i<input.length;i++) {
			if(input[i]>input[hiVal]) {
				hi=input[i];
				hiVal = i;
			}
		}
		return hi;
		
	}
	public static int hiIntSlot(int[] input) {
		int hiVal = 0;
		for(int i = 0; i<input.length;i++) {
			if(input[i]>input[hiVal]) {
				hiVal = i;
			}
		}
		return hiVal;
		
	}
	public static int loInt(int[] input) {
		int hi = input[0], hiVal = 0;
		for(int i = 0; i<input.length;i++) {
			if(input[i]<input[hiVal]) {
				hi=input[i];
				hiVal = i;
			}
		}
		return hi;
		
	}
	public static int loIntSlot(int[] input) {
		int hiVal = 0;
		for(int i = 0; i<input.length;i++) {
			if(input[i]<input[hiVal]) {
				hiVal = i;
			}
		}
		return hiVal;
		
	}
	
	public static int hiDoubleSlot(double[] input) {
		int  hiVal = 0;
		for(int i = 0; i<input.length;i++) {
			if(input[i]>input[hiVal]) {
				hiVal = i;
			}
		}
		return hiVal;
		
	}
	public static double hiDouble(double[] input) {
		int  hiVal = 0;
		double hi = 0;
		for(int i = 0; i<input.length;i++) {
			if(input[i]>input[hiVal]) {
				hi=input[i];
				hiVal = i;
			}
		}
		return hi;
		
	}
	public static int loDoubleSlot(double[] input) {
		int  hiVal = 0;
		for(int i = 0; i<input.length;i++) {
			if(input[i]<input[hiVal]) {
				hiVal = i;
			}
		}
		return hiVal;
		
	}
	public static double loDouble(double[] input) {
		int  hiVal = 0;
		double hi = 0;
		for(int i = 0; i<input.length;i++) {
			if(input[i]<input[hiVal]) {
				hi=input[i];
				hiVal = i;
			}
		}
		return hi;
		
	}
}
