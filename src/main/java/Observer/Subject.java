package Observer;

public interface Subject {

	void addObserver(Observer sub);
	
	void removeObserver(Observer sub);

	void notifyObservers();
}