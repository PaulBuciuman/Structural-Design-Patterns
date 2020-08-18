package proxy;

public interface TwitterServiceInterface {

	
	public String getTimeline(String screenName);
	public void postToTimeline(String screeName, String message);
}


