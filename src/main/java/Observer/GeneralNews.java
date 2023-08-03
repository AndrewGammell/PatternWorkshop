package Observer;

import lombok.Getter;

public class GeneralNews {

	@Getter
	private String title;
	
	@Getter
	private String text;
	
	public GeneralNews(String title, String text) {
		this.title = title;
		this.text = text;
	}
	
	@Override
	public String toString() {
		return title + "\n " + text;
	}
}
