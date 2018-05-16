package methods;

public class Problem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Table of Prime Numbers: 1-10");
		System.out.println("============================");
		System.out.println();
		for(int i=0;i<10;i++) {
			if(isPrime((i+1)) == true) {
				System.out.println("Number " + (i+1) + ": Prime" );
			}
			else {
				System.out.println("Number " + (i+1) + ": Not Prime" );
			}
		}

	}
	
		public static boolean isPrime(int in) {
			int count=0;
			if(in== 0|| in== 1|| in==2 ) {
				count--;
			}
			else {
				if((in%2)==0) {
					count++;
				}
				else {
					for(int i = 3; i<(in);i++) {
						if((in%i)<1) {
							count++;
						}
						
					}
				} // End of First Nested if/else
								
			}// End of First If/Else
			if(count>0) {
				return false;
			}
			else {
				return true;
				
			}
			
			
		}

}
