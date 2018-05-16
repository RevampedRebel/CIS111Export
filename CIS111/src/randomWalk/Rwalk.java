package randomWalk;

public class Rwalk {
	
	// Starting X, Starting Y, # of steps to be taken, board length, steps left to take (initializ
	private int cX, cY, maxSteps, stepsC, edge, sX, sY, maxDistance;
	private boolean moreSteps;
	
			
			// Constructors
			public Rwalk(int cX, int cY, int mSteps, int edge) {
				this.cX = cX;
				this.cY = cY;
				this.sX = cX;
				this.sY = cY;
				this.maxSteps = mSteps;
				this.stepsC = 0;
				this.edge = edge;
				this.maxDistance = 0;
				
				
			}
			
			public Rwalk(int mSteps, int edge) {
				this.cX = (int) (Math.random()*(edge-1));
				this.cY = (int) (Math.random()*(edge-1));
				this.maxSteps = mSteps;
				this.stepsC = 0;
				this.edge = edge;
			
				
			}
				
				// Take a single step
				public void takeStep() {
					int r =  (int) (Math.random()*4);
					
						if(stepsC<=maxSteps) {
							//System.out.println("Switch Used. Steps Taken So Far: " + (getStepsC() + 1));
									switch(r) {
									// Left
									case 0:
										System.out.println("r = " + r + ", Moving Left 1 Tile. Step Number: " + (getStepsC()+1));
										cX--;
										stepsC++;
										distance();
										break;
									// Right
									case 1:
										System.out.println("r = " + r + ", Moving Right 1 Tile. Step Number: " + (getStepsC()+1));
										cX++;
										stepsC++;
										distance();
										break;
									// Up
									case 2:
										System.out.println("r = " + r + ", Moving Up 1 Tile. Step Number: " + (getStepsC()+1));
										cY++;
										stepsC++;
										distance();
										break;
									// Down
									case 3:
										System.out.println("r = " + r + ", Moving Down 1 Tile. Step Number: " + (getStepsC()+1));
										cY--;
										stepsC++;
										distance();
										break;
									
									}
									
									
				}
			
	}
				
				// Take a single step
				public void takeStepNoOut() {
					int r =  (int) (Math.random()*4);
					
						if(stepsC<=maxSteps) {
							//System.out.println("Switch Used. Steps Taken So Far: " + (getStepsC() + 1));
									switch(r) {
									// Left
									case 0:
										
										cX--;
										stepsC++;
										distance();
										break;
									// Right
									case 1:
										
										cX++;
										stepsC++;
										distance();
										break;
									// Up
									case 2:
										
										cY++;
										stepsC++;
										distance();
										break;
									// Down
									case 3:
										
										cY--;
										stepsC++;
										distance();
										break;
									
									}
				}
						
			
	}
				
				
				// Checking Bounds
				public boolean inBounds() {
						
						if(cX>= (edge*-1) && cX<=edge && cY>=(edge*-1) && cY<=edge) {
							return true;
							}
						else {
							return false;
							}
	}
				// Determine whether walker can keep walking.
				public boolean moreSteps() {
				if(getMaxSteps()>getStepsC()) {
					return true;
				}
				else {
					return false;
				}
			}

				

						public void setMoreSteps() {
							moreSteps = this.moreSteps();
						}
						public boolean getMoreSteps() {
							return moreSteps;
						}
						public int getMaxSteps() {
							return maxSteps;
								}
						public void setMaxSteps(int maxSteps) {
							this.maxSteps = maxSteps;
						}			
						public int getEdge() {
							return edge;
						}			
						public void setEdge(int squares) {
							this.edge = squares;
						}			
						public int getStepsC() {
							return stepsC;
						}			
						public void setStepsC(int stepsLeft) {
							this.stepsC = stepsLeft;
						}			
						public int getcX() {
							return cX;
						}
						public void setcX(int cX) {
							this.cX = cX;
						}
						public int getcY() {
							return cY;
						}
						public void setcY(int cY) {
							this.cY = cY;
						}
						public int getsX() {
							return sX;
						}
						public void setsX(int sX) {
							this.sX = sX;
						}
						public int getsY() {
							return sY;
						}
						public void setsY(int sY) {
							this.sY = sY;
						}
				
				public int getMaxDistance() {
							return maxDistance;
						}

						public void setMaxDistance(int maxDistance) {
							this.maxDistance = maxDistance;
						}

				public void walk() {
			for(int i=0;i<getMaxSteps();i++) {
				if(moreSteps() == true && inBounds() == true) {
					takeStep();
					System.out.println(this.toString());
					System.out.println();
					}
				else {
					i = getMaxSteps();
					if(moreSteps() == false) {
						System.out.println("No more steps to take. Walk has terminated.");
					}
					if(inBounds() == false) {
						System.out.println("Walker has gone out of bounds. Walk has terminated.");	
					}
					else {
						System.out.println("HEY I AM AN ERROR I SHOULD NOT EVER BE ABLE TO GET OUTPUTTED SOMETHING IS WRRONG");
						System.out.println();
					}// End of else
				}//End of If
			}// End of for
		} // End of Walk
			
				public void walkNoOutput() {
		for(int i=0;i<getMaxSteps();i++) {
			if(moreSteps() == true && inBounds() == true) {
				takeStepNoOut();
				
				}
			else {
				i = getMaxSteps();
				if(moreSteps() == false) {
					
				}
				if(inBounds() == false) {
					
				}
				else {
					System.out.println("HEY I AM AN ERROR I SHOULD NOT EVER BE ABLE TO GET OUTPUTTED SOMETHING IS WRRONG");
					System.out.println();
				}
			}
		}
			
			
			
		}

				public int distance() {
					
					int x1=0, x2=0, y1=0, y2 = 0, hic = getMaxDistance(), dist=0;
					
							x1 =  getsX();
							y1 =  getsY();
							x2 =  getcX();
							y2 =  getcY();
						
						hic = (int) Math.sqrt((Math.pow((x2-x1), 2)) + (Math.pow((y2 - y1), 2)));
							
						if(hic < dist) {
							dist = hic;
							dist = hic;
					}
						
								return dist;
				}//end of int
				public int maxDistance() {
					
					int x1=0, x2=0, y1=0, y2 = 0, hic, dist=0;
					
							x1 =  getsX();
							y1 =  getsY();
							x2 =  getcX();
							y2 =  getcY();
						
						hic = (int) Math.sqrt((Math.pow((x2-x1), 2)) + (Math.pow((y2 - y1), 2)));
							
						if(hic > dist) {
							dist = hic;
							maxDistance = hic;
					}
						
								return dist;
				}//end of int
				
				
				public String toString() {
					String answer = "(" + cX + ", " + cY + ")" + "	 Subject is Within Boundaries: " + inBounds() + "	Steps Taken: " + (getStepsC()	)  + 
							"	More Steps: " + moreSteps() + "   Max Distance: " + getMaxDistance();
					return answer;
				}
	
	
	
	
	
	

}
