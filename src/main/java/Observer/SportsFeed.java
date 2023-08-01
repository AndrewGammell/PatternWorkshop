package Observer;

import java.util.ArrayList;
import java.util.HashMap;

import lombok.Getter;
import lombok.Setter;

public class SportsFeed implements Subject{

	private HashMap<Class, Observer> subscriberMap = new HashMap<Class, Observer>();
	
	@Getter
	public String artical;
	
	public void setArtical(String artical) {
		this.artical = artical;
		notifyObservers();
	}
	
	@Override
	public void addObserver(Observer sub) {
		subscriberMap.put(sub.getClass(), sub);
		
	}

	@Override
	public void removeObserver(Observer sub) {
		subscriberMap.remove(sub.getClass());
		
	}	

	@Override
	public void notifyObservers() {
		subscriberMap.forEach((key, value) -> value.update(artical));
		
	}

}
