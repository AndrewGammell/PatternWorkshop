package Observer;

public class NewsApp {
	
	
	
	public static void main(String[] args) {
		

		
		NewsFeed newsFeed = new NewsFeed();
		
		Observer mobileSubscriber = new MobileObserver();
		Observer webSubscriber = new WebObserver();
		
		GeneralNews generalNews1 = new GeneralNews("Florida man story","A florida man wakes up birds by sing welcome to the jungle at 3am");
		GeneralNews generalNews2 = new GeneralNews("Florida man Attacked by birds","birds attack florida man for sing welcome to the jungle");
		
		SportsResults sportsResults1 = new SportsResults("Man city", (byte)1, "Man utd", (byte)1);
		SportsResults sportsResults2 = new SportsResults("Wrexham utd", (byte)2, "Chelsea", (byte)6);
		
		mobileSubscriber.addSubject(newsFeed);
		webSubscriber.addSubject(newsFeed);
		newsFeed.setGeneralNews(generalNews1);
		newsFeed.setSportsResults(sportsResults1);
		
		mobileSubscriber.removeSubject(newsFeed);
		webSubscriber.removeSubject(newsFeed);
		newsFeed.setGeneralNews(generalNews2);
		newsFeed.setSportsResults(sportsResults2);
		
	}		


}
