package Observer;

public interface Observer {
	
	public void addSubject(Subject feed);
	
	public void removeSubject(Subject feed);
	
	void update(String artical);
	
	void sendUpdate();

}