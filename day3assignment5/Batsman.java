package day3assignment5;
import java.lang.Math;

public class Batsman extends Player{
	
	private int runsScored;
	private int centuries;
	private int halfCenturies;
	private int ballsFaced;
	private int sixes;
	private int fours;
	

	public Batsman( String name, int runsScored, int centuries, int halfCenturies, int ballsFaced, int sixes,
			int fours) {
		super(name);
		this.runsScored = runsScored;
		this.centuries = centuries;
		this.halfCenturies = halfCenturies;
		this.ballsFaced = ballsFaced;
		this.sixes = sixes;
		this.fours = fours;
	}


	public int getRunsScored() {
		return runsScored;
	}


	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}


	public int getCenturies() {
		return centuries;
	}


	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}


	public int getHalfCenturies() {
		return halfCenturies;
	}


	public void setHalfCenturies(int halfCenturies) {
		this.halfCenturies = halfCenturies;
	}


	public int getBallsFaced() {
		return ballsFaced;
	}


	public void setBallsFaced(int ballsFaced) {
		this.ballsFaced = ballsFaced;
	}


	public int getSixes() {
		return sixes;
	}


	public void setSixes(int sixes) {
		this.sixes = sixes;
	}


	public int getFours() {
		return fours;
	}


	public void setFours(int fours) {
		this.fours = fours;
	}
	
	public float getStrikeRate() {
		float strikeRate;
		strikeRate = ( runsScored*100) / ballsFaced ;
		float strikeRateroundValue = Math.round(strikeRate * 100)/100;
		return strikeRateroundValue;
	}
	
	public int getRunsScoredInBoundaries() {
		
		int RunsScoredInBoundaries =  4 * fours + 6 * sixes;
		return RunsScoredInBoundaries;
	} 


	@Override
	public String toString() {
		return "Batsman [runsScored=" + runsScored + ", centuries=" + centuries + ", halfCenturies=" + halfCenturies
				+ ", ballsFaced=" + ballsFaced + ", sixes=" + sixes + ", fours=" + fours + ", StrikeRate="+ getStrikeRate() +
				", RunsScoredInBoundaries="+ getRunsScoredInBoundaries() +"]";
	}
	
	
	
	

}
