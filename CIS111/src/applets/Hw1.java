package applets;
import java.applet.*;
import java.awt.*;
import javax.swing.*;
public class Hw1 extends Applet
	{

	public void init(){
		// TODO Auto-generated method stub

		
		} // init
	
		public void paint(Graphics rCircles) {
			int radius;
			int count;
			int[] circle =	new int[100];
			
			// Coordinate Vars
			int[] x =  new int[100];
			int[] y =  new int[100];
			int[] rad =  new int[100];
			
			// Color Vars
			int r,g,b;
			Color rcolor;
			
			//Loop for 120 Circles
			for(count = 1;count<121;count++)
			{
			// Setting Color
				r = (int)(Math.random()*256);
				g = (int)(Math.random()*256);
				b = (int)(Math.random()*256);
				rcolor = new Color(r,g,b);
				rCircles.setColor(rcolor);
				// Setting Coordinates & Radius
				x[count] = (int)(Math.random()*900);
				y[count] = (int)(Math.random()*500);
				rad[count] = (int)(Math.random()*500);
				
				// Creating the Circles
				rCircles.drawOval(x[count], y[count], rad[count], rad[count]);
			}
		}// Paint

} // Class
