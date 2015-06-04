package eg.edu.guc.edumsg.Model;

/**
 * Created by ammar on 6/2/15.
 */
public class LoginResponse {

    String app;
    String method;
    String status;
    String code;
    String session_id;
    SimpleUser user;

    public LoginResponse(String app, String method, String status, String code, String session_id, SimpleUser user) {
        this.app = app;
        this.method = method;
        this.status = status;
        this.code = code;
        this.session_id = session_id;
        this.user = user;
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

    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }

    public SimpleUser getSimpleUser() {
        return user;
    }

    public void setSimpleUser(SimpleUser user) {
        this.user = user;
    }
}
