package eg.edu.guc.edumsg.util;

import java.util.Date;
import java.util.List;

import eg.edu.guc.edumsg.Model.Comment;
import eg.edu.guc.edumsg.Model.Group;
import eg.edu.guc.edumsg.Model.Message;
import eg.edu.guc.edumsg.Model.Notifications;
import eg.edu.guc.edumsg.Model.Tweet;
import eg.edu.guc.edumsg.Model.User;
import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;

public interface PrivateApiRoutes {

    @GET("/users/{user_id}")
    void getUserProfile(@Path("user_id") int user_id,
                        Callback<User> callback);


    @GET("/groups")
    void getUserGroups(Callback<List<Group>> callback);

    @GET("/users/{user_id}/friends")
    void getUserFriends(@Path("user_id") int i,
                        Callback<List<User>> callback);

    @GET("/users/{user_id}/suggfriends")
    void getUserSuggFriends(@Path("user_id") int i,
                            Callback<List<User>> callback);

    @GET("/posts")
    void getUserNewsFeeds(Callback<List<Tweet>> callback);

    @GET("/users")
    void getAllUsers(Callback<List<User>> callback);

    @POST("/users/{user_id}/add_friend")
    @FormUrlEncoded
    void addFriend(@Path("user_id") int i,
                   @Field("friend_id") int id1,
                   Callback<Response> callback);

    @GET("/users/{user_id}/friend_requests")
    void getFriendRequests(@Path("user_id") int i,
                           Callback<List<User>> callback);

    @POST("/users/{user_id}/accept_friend")
    @FormUrlEncoded
    void acceptFriendReq(@Path("user_id") int i,
                         @Field("id") int id1,
                         Callback<Response> callback);

    @POST("/users/{user_id}/unfriend")
    @FormUrlEncoded
    void unFriendReq(@Path("user_id") int i,
                     @Field("id") int i1,
                     Callback<Response> callback);

    @GET("/posts/{post_id}/comments")
    void getPostComments(@Path("post_id") int id,
                         Callback<List<Comment>> callback);


    @GET("/messages/inbox")
    void getInbox(Callback<List<Message>> callback);

    @POST("/posts")
    @FormUrlEncoded
    void post(@Field("content") String post,
              Callback<Response> callback);

    @POST("/posts/{post_id}/comments")
    @FormUrlEncoded
    void commentOnPost(@Path("post_id") int id,
                       @Field("comment") String c,
                       Callback<Response> callback);

    @GET("/events/{event_id}/posts")
    void getEventPosts(@Path("event_id") int event_id,
                       Callback<List<Tweet>> callback);

    @GET("/groups/{group_id}/posts")
    void getGroupPosts(@Path("group_id") int event_id,
                       Callback<List<Tweet>> callback);


    @GET("/users/{user_id}/notifications")
    void getNotifications(@Path("user_id") int user_id,
                          Callback<List<Notifications>> callback);

    @POST("/messages")
    @FormUrlEncoded
    void sendMessage(@Field("body") String body,
                     @Field("subject") String subject,
                     @Field("username") String username,
                     Callback<Response> callback);

    @POST("/events/{event_id}/posts")
    @FormUrlEncoded
    void postOnEvent(@Path("event_id") int event_id,
                     @Field("content") String content,
                     Callback<Response> callback);



    @POST("/events/{event_id}/add_member")
    @FormUrlEncoded
    void addMemberEvent(@Path("event_id") int event_id,
                        @Field("username") String username,
                        Callback<Response> callback);

    @GET("/events/{event_id}/members")
    void getAllEventMembers(@Path("event_id") int event_id,
                            Callback<List<User>> callback);

    @GET("/users/{user_id}/posts")
    void getUserPosts(@Path("user_id") int user_id,
                      Callback<List<Tweet>> callback);

    @POST("/users/{user_id}/posts")
    @FormUrlEncoded
    void postOnFriendWall(@Path("user_id") int friend_id,
                          @Field("content") String body,
                          Callback<Response> callback);



    @POST("/users/info")
    @FormUrlEncoded
    void editInfoR(@Field("first_name") String firstName,
                   @Field("last_name") String lastName,
                   @Field("gender") String gender,
                   @Field("date_of_birth") Date dateOfBirth,
                   Callback<Response> callback);

}
