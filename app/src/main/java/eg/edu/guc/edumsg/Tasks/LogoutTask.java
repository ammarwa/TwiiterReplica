package eg.edu.guc.edumsg.Tasks;

/**
 * Created by ammar on 6/2/15.
 */
public class LogoutTask {

    String method;
    String user_id;
    String queue;

    public LogoutTask(String method, String user_id, String queue) {
        this.method = method;
        this.user_id = user_id;
        this.queue = queue;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
