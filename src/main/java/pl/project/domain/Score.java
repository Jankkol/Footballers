package pl.project.domain;

public class Score {
	
	private SpotBean id_spot;
	private int firstScore;
	private int secondScore;
	
	
	
	public Score(SpotBean id_spot, int firstScore, int secondScore) {
		super();
		this.id_spot = id_spot;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}
	public SpotBean getId_spot() {
		return id_spot;
	}
	public void setId_spot(SpotBean id_spot) {
		this.id_spot = id_spot;
	}
	public int getFirstScore() {
		return firstScore;
	}
	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}
	public int getSecondScore() {
		return secondScore;
	}
	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}
	
	
	

}
