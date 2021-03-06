package eg.edu.guc.edumsg.Model;

/**
 * Created by ammar on 6/2/15.
 */
public class SimpleUser {

    String id;
    String username;
    String email;
    String name;
    String created_at;
    String overlay;
    String protected_tweets;
    String session_id;
    String language;
    String country;
    String bio;
    String website;
    String gender;
    String date_of_birth;

    public SimpleUser(String id, String username, String email, String name, String created_at, String overlay, String protected_tweets, String session_id, String language, String country, String bio, String website, String gender, String date_of_birth) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.name = name;
        this.created_at = created_at;
        this.overlay = overlay;
        this.protected_tweets = protected_tweets;
        this.session_id = session_id;
        this.language = language;
        this.country = country;
        this.bio = bio;
        this.website = website;
        this.gender = gender;
        this.date_of_birth = date_of_birth;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getOverlay() {
        return overlay;
    }

    public void setOverlay(String overlay) {
        this.overlay = overlay;
    }

    public String getProtected_tweets() {
        return protected_tweets;
    }

    public void setProtected_tweets(String protected_tweets) {
        this.protected_tweets = protected_tweets;
    }

    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    @Override
    public String toString() {
        return "SimpleUser{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", created_at='" + created_at + '\'' +
                ", overlay='" + overlay + '\'' +
                ", protected_tweets='" + protected_tweets + '\'' +
                ", session_id='" + session_id + '\'' +
                ", language='" + language + '\'' +
                ", country='" + country + '\'' +
                ", bio='" + bio + '\'' +
                ", website='" + website + '\'' +
                ", gender='" + gender + '\'' +
                ", date_of_birth='" + date_of_birth + '\'' +
                '}';
    }
}
