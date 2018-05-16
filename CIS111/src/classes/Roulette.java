package classes;

public class Roulette {

	
	private int pocket;
	private String color;
	public Roulette(int pocket) {
		this.pocket = pocket;
		if(pocket == 0) {
			this.color = "Green";
		}
		if(pocket > 0 && pocket<11) {
			if((pocket%2)!=1) {
				this.color = "Black";
			}
			else {
				this.color = "Red";
			}
		}
		if(pocket > 10 && pocket<19) {
			if((pocket%2)==1) {
				this.color = "Black";
			}
			else {
				this.color = "Red";
			}
		}
		if(pocket > 18 && pocket<37) {
			if((pocket%2)!=1) {
				this.color = "Black";
			}
			else {
				this.color = "Red";
			}
		}
		else {
			this.color = "Error: Invalid Pocket Number!";
					
		}
		
		
		
	}
	public void setPocket() {
		this.pocket = pocket;
	}
	public void setColor() {
		this.color = color;
	}
	public int getPocket() {
		return pocket;
	}
	public String getColor() {
		return color;
	}
	public String toString() {
		String answer = pocket + ", " + color;
		return answer;
	}
	
	

}
