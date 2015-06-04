package eg.edu.guc.edumsg.Tasks;

public class DeleteTweetTask {

	String method = "delete_tweet";
	String queue = "tweet";
	String tweet_id;

	public DeleteTweetTask(String tweet_id) {
		this.tweet_id = tweet_id;
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

}
