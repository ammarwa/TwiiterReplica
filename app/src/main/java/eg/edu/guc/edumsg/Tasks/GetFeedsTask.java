package eg.edu.guc.edumsg.Tasks;

/**
 * Created by ammar on 6/4/15.
 */
public class GetFeedsTask {

    String method;
    String user_id;

    public GetFeedsTask(String method, String user_id) {
        this.method = method;
        this.user_id = user_id;
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
