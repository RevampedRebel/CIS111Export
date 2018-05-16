package finalExam;

public class Order {

	private double taxRate, subT = 0, ship=0, taxT=0, tot=0;

	public Order(double taxR) {
		this.taxRate = taxR;
		this.subT = subT;
		this.ship = ship;
		this.taxT = taxT;
		this.tot = tot;
		
	}
	
	public void setCost(double priceTag) {
		if(priceTag < 50.00) {
			ship = (priceTag * 0.08);
		}
		else {
			ship = 0;
		}
		taxT = (priceTag * taxRate);
		subT = priceTag;
		
	}
	
	public double getTotalCost() {
		tot = subT + taxT + ship;
		double answer = subT + taxT + ship;
		return answer;
	}
	

}
