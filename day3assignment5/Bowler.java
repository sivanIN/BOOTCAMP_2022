package day3assignment5;
import java.lang.Math;

public class Bowler extends Player {
	private int ballsBowled;

	private int runsLeaked;

	private int wickets;


	public Bowler(String name, int ballsBowled, int runsLeaked, int wickets) {
		super(name);
		this.ballsBowled = ballsBowled;
		this.runsLeaked = runsLeaked;
		this.wickets = wickets;
		
	}


	public int getBallsBowled() {
		return ballsBowled;
	}


	public void setBallsBowled(int ballsBowled) {
		this.ballsBowled = ballsBowled;
	}


	public int getRunsLeaked() {
		return runsLeaked;
	}


	public void setRunsLeaked(int runsLeaked) {
		this.runsLeaked = runsLeaked;
	}


	public int getWickets() {
		return wickets;
	}


	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	
	
	public String getStrikeRate() {
		double strikeRate= ballsBowled / wickets;
		double roundValueOfStrikeRate = Math.round(strikeRate);
		return roundValueOfStrikeRate + "";
	}


	@Override
	public String toString() {
		return "Bowler [ballsBowled=" + ballsBowled + ", runsLeaked=" + runsLeaked + ", wickets=" + wickets + ", strikeRate="+ getStrikeRate() +"]";
	}
	
	
	
	
}
