package challengeTester;
import classes.*;
import shortcuts.*;
public class RouletteTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int in = 25;
		Roulette test = new Roulette(in);
		System.out.println("Format:");
		String out = "Pocket, Color";
		ListFormatter.format(out);
		
		
		System.out.println(test.toString());
	}

}
