package eg.edu.guc.edumsg.Model;

/**
 * Created by ammar on 12/18/14.
 */
public class Group {
    private Long user_id ;
    private Long id;
    private String img;
    private String name ;
    private String description ;
    private String privacy ;

    public Group(String img, String name, String description) {
        this.img = img;
        this.name = name;
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
