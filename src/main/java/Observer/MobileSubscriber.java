package Observer;

import java.util.HashMap;

public class MobileSubscriber implements Observer {

	private String artical;
	
	private HashMap<Class,Subject> subjectMap = new HashMap<Class,Subject>();
	
	public void addSubject(Subject feed) {
		feed.addObserver(this);
		subjectMap.put(feed.getClass(), feed);
	}
	
	public void removeSubject(Subject feed) {
		feed.removeObserver(this);
		subjectMap.remove(feed.getClass());
	}
	
	@Override
	public void update(String artical) {
		this.artical = artical;
		sendUpdate();
	}

	@Override
	public void sendUpdate() {
		System.out.println("This push notification is to let you know that the latest artical is " + artical);
		
	}
	

}
