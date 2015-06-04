package eg.edu.guc.edumsg.Tasks;

/**
 * Created by ammar on 6/4/15.
 */
public class GetMentionsTask {

    String method;
    String username;

    public GetMentionsTask(String method, String username) {
        this.method = method;
        this.username = username;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
