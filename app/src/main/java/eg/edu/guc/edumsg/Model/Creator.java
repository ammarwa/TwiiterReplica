package eg.edu.guc.edumsg.Model;

/**
 * Created by ammar on 6/2/15.
 */
public class Creator {

    String username;
    String name;

    public Creator(String username, String name) {
        this.username = username;
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
