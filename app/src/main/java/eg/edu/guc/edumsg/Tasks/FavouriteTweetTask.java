package eg.edu.guc.edumsg.Tasks;

public class FavouriteTweetTask {

	String method = "favorite";
	String queue = "tweet";
	String tweet_id;
	String user_id;

	public FavouriteTweetTask(String tweet_id, String user_id) {
		this.tweet_id = tweet_id;
		this.user_id = user_id;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getQueue() {
		return queue;
	}

	public void setQueue(String queue) {
		this.queue = queue;
	}

	public String getTweet_id() {
		return tweet_id;
	}

	public void setTweet_id(String tweet_id) {
		this.tweet_id = tweet_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

}
