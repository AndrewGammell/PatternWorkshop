package Observer;

import java.util.HashSet;

public class WebObserver implements Observer{

	private GeneralNews generalNews;

	private SportsResults sportsResults;
		
	private HashSet<Subject> subjectSet = new HashSet<Subject>();
	
	public void addSubject(Subject subject) {
		subject.addObserver(this);
		subjectSet.add(subject);
	}
	
	public void removeSubject(Subject subject) {
		subject.removeObserver(this);
		subjectSet.remove(subject);
	}
	
	public void updateGeneralNews(GeneralNews generalNews) {
		this.generalNews = generalNews;	
		sendEmailUpdate(StringConstants.GENERAL_NEWS);
	}
	
	public void updateSportsResults(SportsResults sportsResults) {
		this.sportsResults = sportsResults;
		sendEmailUpdate(StringConstants.SPORTS_RESULTS);
	}

	
	private void sendEmailUpdate(String subjectType) {
		
		switch (subjectType) {
			case StringConstants.GENERAL_NEWS : System.out.println("Email notification Breaking News: " + generalNews.toString());
				break;
			case StringConstants.SPORTS_RESULTS : System.out.println("Email notification Match Results: " + sportsResults.toString());
		}
				
	}
	

	
}
