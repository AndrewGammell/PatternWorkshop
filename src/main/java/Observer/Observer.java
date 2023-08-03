package Observer;

public interface Observer {
	
	public void addSubject(Subject subject);
	
	public void removeSubject(Subject subject);
	
	void updateGeneralNews(GeneralNews generalNews);
	
	void updateSportsResults(SportsResults sportsResults);
	
}