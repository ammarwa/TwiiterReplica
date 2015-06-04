package eg.edu.guc.edumsg.Model;

public class Tweet {

	private String id;
	private String tweet_text;
    private String created_at;
    private String image_url;
    Creator creator;

    public Tweet(String id, String tweet_text, String created_at, String image_url) {
        this.id = id;
        this.tweet_text = tweet_text;
        this.created_at = created_at;
        this.image_url = image_url;
    }

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTweet_text() {
        return tweet_text;
    }

    public void setTweet_text(String tweet_text) {
        this.tweet_text = tweet_text;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "id='" + id + '\'' +
                ", tweet_text='" + tweet_text + '\'' +
                ", created_at='" + created_at + '\'' +
                ", image_url='" + image_url + '\'' +
                ", creator=" + creator.getName() +
                '}';
    }
}
