package finals;

import java.util.Arrays;

public class LittleLeagueGame {


	private String home, away;
	private int scHome, scAway;
	private boolean warm;
	Name homeL[] = new Name[10];
	Name awayL[] = new Name[10];
	
	public LittleLeagueGame(String home, String away, int scHome, int scAway, boolean warm, Name[] homeL, Name[] awayL) {
		super();
		this.home = home;
		this.away = away;
		this.scHome = scHome;
		this.scAway = scAway;
		this.warm = warm;
		this.homeL = homeL;
		this.awayL = awayL;
	}
	
	public int ErrorCount() {
		int errors;
		if(isWarm() == true) {
			errors = getScHome() - getScAway();
			if(errors<0) {
				errors*=-1;
			}// End of Nest If
		}// End of first if
		
		else {
			errors = (getScHome() - getScAway())*7;
			if(errors<0) {
				errors*=-1;
			}// End of Nest If
		}// End of Else
		return errors;
	}// End of int

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getAway() {
		return away;
	}

	public void setAway(String away) {
		this.away = away;
	}

	public int getScHome() {
		return scHome;
	}

	public void setScHome(int scHome) {
		this.scHome = scHome;
	}

	public int getScAway() {
		return scAway;
	}

	public void setScAway(int scAway) {
		this.scAway = scAway;
	}
	public boolean isWarm() {
		return warm;
	}
	public Name[] getHomeL() {
		return homeL;
	}
	public void setHomeL(Name[] homeL) {
		this.homeL = homeL;
	}
	public Name[] getAwayL() {
		return awayL;
	}
	public void setAwayL(Name[] awayL) {
		this.awayL = awayL;
	}
	public void setWarm(boolean warmOrNot) {
		this.warm = warm;
	}

	public String toString() {
		String answer;
		if(isWarm() == true) {
			answer = "Game Day for " + getAway() + " vs. " + getHome() + "\nOn this hot day the final score was " + scAway + " to " + scHome + ".\n\nThe lineup for the "
					+ "away team was: \n";
			
			for(int i = 0; i < 3; i++) {
				answer += getAwayL()[i].getLast() + ", " + getAwayL()[i].getFirst() + "\n";
				
			}
			
			answer += "The lineup for the home team was:\n";
			for(int i = 0; i < 3; i++) {
				answer += getHomeL()[i].getLast() + ", " + getHomeL()[i].getFirst() + "\n";
				
			}
			
			return answer;
		}
		else {
			answer = "Game Day for " + getAway() + " vs. " + getHome() + "\nOn this chilly day the final score was " + scAway + " to " + scHome + ".\n\nThe lineup for the "
					+ "away team was: \n";
			
			for(int i = 0; i < 3; i++) {
				answer += getAwayL()[i].getLast() + ", " + getAwayL()[i].getFirst() + "\n";
				
			}
			answer += "\n\nThe lineup for the home team was:\n";
			for(int i = 0; i < 3; i++) {
				answer += getHomeL()[i].getLast() + ", " + getHomeL()[i].getFirst() + "\n";
				
			}
			
			
			return answer;
		}
		
	}
	
	
	/*public String toString() {
		String answer;
	
		if(isWarm() == true) {
		answer = "Game Day for " + getAway() + " vs. " + getHome() + "\nOn this hot day the final score was " + scAway + " to " + scHome + ".\n\nThe lineup for the "
				+ "away team was: \n"  + getAwayL()[0].getLast() + ", " + getAwayL()[0].getFirst() + "\n"  + getAwayL()[1].getLast() + ", " + getAwayL()[1].getFirst() + "\n" 
				 + getAwayL()[2].getLast() + ", " + getAwayL()[2].getFirst() + "\n\n " + "The lineup for the home team was: /n"+ getHomeL()[0].getLast() + ", " + 
				getHomeL()[0].getFirst() + "\n" + getHomeL()[1].getLast() + ", " + getHomeL()[1].getFirst() + "\n" + getHomeL()[2].getLast() + ", " + getHomeL()[2].getFirst()  ;
		return answer;
		}
		else {
			answer = "Game Day for " + getAway() + " vs. " + getHome() + "\nOn this chilly day the final score was " + scAway + " to " + scHome + ".\n\nThe lineup for the "
					+ "away team was: \n"  + getAwayL()[0].getLast() + ", " + getAwayL()[0].getFirst() + "\n"  + getAwayL()[1].getLast() + ", " + getAwayL()[1].getFirst() + "\n" 
					 + getAwayL()[2].getLast() + ", " + getAwayL()[2].getFirst() + "\n\n" + "The lineup for the home team was: \n"+ getHomeL()[0].getLast() + ", " + 
					getHomeL()[0].getFirst() + "\n" + getHomeL()[1].getLast() + ", " + getHomeL()[1].getFirst() + "\n" + getHomeL()[2].getLast() + ", " + getHomeL()[2].getFirst()  ;
			
			return answer;
		}

	} // End of ToString
	*/
}
