package applets;
import java.applet.*;
import java.awt.*;
import javax.swing.*;
public class Hw2 extends Applet
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
			
			// Red setting vars
			int hival=0, hicount=1;
			
			//Loop for 100 Circles
			for(count = 1;count<101;count++)
			{
			
				if(count==1) {
					hival = rad[count];
					
					
				}
				// Setting Coordinates & Radius
				x[count] = (int)(Math.random()*900);
				y[count] = (int)(Math.random()*500);
				rad[count] = (int)(Math.random()*500);
				
				if(rad[count]>hival) {
					hival = rad[count];
					hicount = count;
				}
				
				// Setting Color
				if(count==100) {
					rCircles.setColor(Color.red);
					rCircles.drawOval(x[hicount], y[hicount], hival, hival);
					
				}
				r = (int)(Math.random()*256);
				g = (int)(Math.random()*256);
				b = (int)(Math.random()*256);
				rcolor = new Color(r,g,b);
				rCircles.setColor(rcolor);
				
				
				
				
				// Creating the Circles
				rCircles.drawOval(x[count], y[count], rad[count], rad[count]);
			}
			
		}// Paint

} // Class
