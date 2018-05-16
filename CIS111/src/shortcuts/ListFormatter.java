package shortcuts;

public class ListFormatter {

		public static void format(String input) {
			int len = input.length();
			System.out.println(input);
			for(int i = 0; i <len;i++) {
				System.out.print("=");
			}
			System.out.print("\n");
		}
}
