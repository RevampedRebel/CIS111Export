package classes;

public class Circle {

	
	private double radius = -1;
	final double pi = 3.14159;
	private double area, diam, circ;
	
	public Circle(double radius) {
		if(radius != -1) {
			this.radius = radius;
			this.area = pi * Math.pow(radius, 2);
			this.diam = radius * 2;
			this.circ = 2 * pi * radius;
		}
		else {
			radius = 0.0;
			area = 0.0;
			diam = 0.0;
			circ = 0.0;
		}
		
		
	}
	
	public void setRadius() {
		this.radius=radius;
	}
	public void setDiam() {
		this.diam = diam;
	}
	public void setArea() {
		this.area = area;
	}
	public void setCirc() {
		this.circ = circ;
	}
	public double getRadius() {
		return radius;
	}
	public double getDiam() {
		return diam;
	}
	public double getArea() {
		return area;
	}
	public double getCirc() {
		return circ;
	}
	public String toString() {
		String answer = radius + ", " + diam + ", " + area+ ", " + circ;
		return answer;
	}

}
