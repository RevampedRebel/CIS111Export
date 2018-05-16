package finalExam;

public class Customer {
	
	private String first, last;
	private int code;
	private Order[] history;
	
	public Customer(String first, String last, int code, Order[] in) {
		this.first = first;
		this.last = last;
		this.code = code;
		this.history = in;
		
		
		
	}
	
	public String toString() {
		String answer = "CUSTOMER INFORMATION\nNAME: " + first + " " + last + "\nID CODE: " + code;
		return answer;
	}
	
	public double AveragePayment() {
		double total = 0;
		for(int i = 0; i < history.length; i++) {
			total += history[i].getTotalCost();
			
		}
		double answer = total / history.length;
		return answer;
	}
	
	

}
