package eg.edu.guc.edumsg.Model;

import java.util.List;

/**
 * Created by ammar on 6/2/15.
 */
public class TimeLineResponse {

    String app;
    String method;
    String status;
    String code;
    List<Tweet> tweets;

    public TimeLineResponse(String app, String method, String status, String code, List<Tweet> tweets) {
        this.app = app;
        this.method = method;
        this.status = status;
        this.code = code;
        this.tweets = tweets;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(List<Tweet> tweets) {
        this.tweets = tweets;
    }

    @Override
    public String toString() {
        return "TimeLineResponse{" +
                "app='" + app + '\'' +
                ", method='" + method + '\'' +
                ", status='" + status + '\'' +
                ", code='" + code + '\'' +
                ", tweets=" + tweets +
                '}';
    }
}
