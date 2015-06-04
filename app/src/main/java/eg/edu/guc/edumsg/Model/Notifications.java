package eg.edu.guc.edumsg.Model;

/**
 * Created by ammar on 12/26/14.
 */
public class Notifications {
    private int user_id;
    private String user_name;
    private String content;
    private int read;
    private String user_img;
    private String not_img;
    private String created_at;

    public Notifications(String user_name, String content, String created_at, String user_img, String not_img){
        this.user_name = user_name;
        this.content = content;
        this.created_at = created_at;
        this.user_img = user_img;
        this.not_img = not_img;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_img() {
        return user_img;
    }

    public void setUser_img(String user_img) {
        this.user_img = user_img;
    }

    public String getNot_img() {
        return not_img;
    }

    public void setNot_img(String not_img) {
        this.not_img = not_img;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getRead() {
        return read;
    }

    public void setRead(int read) {
        this.read = read;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

}
