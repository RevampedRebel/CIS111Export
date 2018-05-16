package methods;

public class Problem15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int out;
		int e = 0, o = 0;
		for(int i=0;i<100;i++) {
			int rn = (int)(Math.random()*100);
			if(isEven(rn)==true) {
				e++;
			}
			else {
				o++;
			}
		}
		System.out.println("Even Numbers Generated: " + e);
		System.out.println("Odd Numbers Generated: " + o);
		
		
	}
	
	public static boolean isEven(int in) {
		if((in%2)==0) {
			return true;
		}
		else {
			return false;
		}
	}

}
