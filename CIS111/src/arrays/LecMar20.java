package arrays;

public class LecMar20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int blah = 10;
		int [] data = new int[blah];
		for(int i = 0; i<data.length;i++) {
			data[i] = i * 10 + 6;
		}
		for(int i = 0; i<data.length;i++) {
			System.out.println(data[i]);
		}

	}

}
