package Observer;

import java.util.HashSet;

import lombok.Getter;

public class NewsFeed implements Subject{

	private GeneralNews generalNews;
	
	private SportsResults sportsResults;

	private HashSet<Observer> observerSet = new HashSet<Observer>();
	
	@Override
	public void addObserver(Observer observer) {
		observerSet.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observerSet.remove(observer);
	}	

	public void setGeneralNews(GeneralNews generalNews) {
		this.generalNews = generalNews;
		notifyObservers(StringConstants.GENERAL_NEWS);
	}
	
	public void setSportsResults(SportsResults sportsResults) {
		this.sportsResults = sportsResults;
		notifyObservers(StringConstants.SPORTS_RESULTS);
	}
	
	@Override
	public void notifyObservers(String subjectType) {
		
		switch (subjectType) {
			case StringConstants.GENERAL_NEWS : observerSet.forEach((Observer observer) -> observer.updateGeneralNews(generalNews));
				break;
			case StringConstants.SPORTS_RESULTS : observerSet.forEach((Observer observer) -> observer.updateSportsResults(sportsResults));
				
		}
			
	}
	
	
}
