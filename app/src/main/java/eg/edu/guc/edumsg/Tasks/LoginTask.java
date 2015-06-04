package eg.edu.guc.edumsg.Tasks;

/**
 * Created by ammar on 6/2/15.
 */
public class LoginTask {

    String method = "login";
    String username;
    String password;
    String queue = "user";

    public LoginTask(String username, String password) {
        this.username = username;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }
}
