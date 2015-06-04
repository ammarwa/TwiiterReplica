package eg.edu.guc.edumsg.Tasks;

/**
 * Created by ammar on 6/2/15.
 */
public class NewTweetTask {

    String method;
    String tweet_text;
    String creator_id;
    String image_url;
    String queue;

    public NewTweetTask(String method, String tweet_text, String creator_id, String image_url, String queue) {
        this.method = method;
        this.tweet_text = tweet_text;
        this.creator_id = creator_id;
        this.image_url = image_url;
        this.queue = queue;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getTweet_text() {
        return tweet_text;
    }

    public void setTweet_text(String tweet_text) {
        this.tweet_text = tweet_text;
    }

    public String getCreator_id() {
        return creator_id;
    }

    public void setCreator_id(String creator_id) {
        this.creator_id = creator_id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }
}
