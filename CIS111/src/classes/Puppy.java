package classes;

public class Puppy {
	
	// private data; instance data
	private int adorableness;
	private String name;
	private double weight;
	
	public Puppy(int adorableness, String name, double weight) {
		this.adorableness = adorableness;
		if(this.name != "Dunderhead") {
			this.name=name;
		}
		else {
			name = "Sweet Pea";
		}
		this.weight = weight;
		
		
	}
	public String toString() {
		String answer;
		answer = "lol my puppy is named " + name;
		return answer;
	}
	
	public double getWeight() {
		return weight;
	}
	public int getAdorableness() {
		return adorableness;
	}
	public String getName() {
		return name;
	}
	

}
