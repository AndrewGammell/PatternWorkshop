package Observer;

public class NewsApp {
	
	
	
	public static void main(String[] args) {
		
		NewsFeed newsFeed = new NewsFeed();
		SportsFeed sportsFeed = new SportsFeed();
		
		Observer mobileSubscriber = new MobileSubscriber();
		Observer webSubscriber = new WebSubscriber();
		
		mobileSubscriber.addSubject(newsFeed);
		webSubscriber.addSubject(newsFeed);
		newsFeed.setArtical("todays top story florida man wakes up birds by sing welcome to the jungle and 3am");

		mobileSubscriber.removeSubject(newsFeed);
		webSubscriber.removeSubject(newsFeed);
		newsFeed.setArtical("todays top birds attack florida man for sing welcome to the jungle");
		
		
		mobileSubscriber.addSubject(sportsFeed);
		webSubscriber.addSubject(sportsFeed);
		sportsFeed.setArtical("Manchester united to sell tops player to avoid bankruptcy");
		
		mobileSubscriber.removeSubject(sportsFeed);
		webSubscriber.removeSubject(sportsFeed);
		newsFeed.setArtical("Major premier league teams caught up in match fixing scandal");
		
		
	}		


}
