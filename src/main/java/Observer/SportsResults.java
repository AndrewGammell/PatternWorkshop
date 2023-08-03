package Observer;

public class SportsResults {

	private String homeTeam;
	
	private byte homeTeamScore;
	
	private String awayTeam;
	
	private byte awayTeamScore;
	
	private String scoreFormat = "%s %d - %d %s";
	
	public SportsResults(String homeTeam, byte homeTeamScore, String awayTeam, byte awayTeamScore) {
		this.homeTeam = homeTeam;
		this.homeTeamScore = homeTeamScore;
		this.awayTeam = awayTeam;
		this.awayTeamScore = awayTeamScore;
	}
	
	@Override
	public String toString() {
		return String.format(scoreFormat, homeTeam, homeTeamScore, awayTeamScore, awayTeam);
	}
}
