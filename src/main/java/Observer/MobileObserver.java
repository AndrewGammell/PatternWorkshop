package Observer;

import java.util.HashSet;

public class MobileObserver implements Observer {
	
	private HashSet<Subject> subjectSet = new HashSet<Subject>();
	
	private GeneralNews generalNews;

	private SportsResults sportsResults;
	
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
		sendMobileUpdate(StringConstants.GENERAL_NEWS);
	}
	
	public void updateSportsResults(SportsResults sportsResults) {
		this.sportsResults = sportsResults;
		sendMobileUpdate(StringConstants.SPORTS_RESULTS);
	}

	
	private void sendMobileUpdate(String subjectType) {
		
		switch (subjectType) {
			case StringConstants.GENERAL_NEWS : System.out.println("Mobile notification Breaking News: " + generalNews.toString());
				break;
			case StringConstants.SPORTS_RESULTS : System.out.println("Mobile notification Match Results: " + sportsResults.toString());
		}
	}
	

}
