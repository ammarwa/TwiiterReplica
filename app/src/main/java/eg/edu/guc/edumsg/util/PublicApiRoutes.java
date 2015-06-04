package eg.edu.guc.edumsg.util;


import eg.edu.guc.edumsg.Model.LoginResponse;
import eg.edu.guc.edumsg.Model.TimeLineResponse;
import eg.edu.guc.edumsg.Tasks.DeleteTweetTask;
import eg.edu.guc.edumsg.Tasks.LoginTask;
import eg.edu.guc.edumsg.Tasks.LogoutTask;
import eg.edu.guc.edumsg.Tasks.NewTweetTask;
import eg.edu.guc.edumsg.Tasks.TimeLineCommandTask;
import eg.edu.guc.edumsg.Tasks.UserTask;
import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.POST;

public interface PublicApiRoutes {
	@POST("/")
	void login(@Body LoginTask loginTask, Callback<LoginResponse> callback);

    @POST("/")
    void register(@Body UserTask userTask, Callback<Response> callback);

    @POST("/")
    void logout(@Body LogoutTask logoutTask, Callback<Response> callback);

    @POST("/")
    void tweet(@Body NewTweetTask newTweetTask, Callback<Response> callback);

    @POST("/")
    void getProfile(@Body TimeLineCommandTask timeLineCommandTask, Callback<TimeLineResponse> callback);

    @POST("/")
    void deleteTweet(@Body DeleteTweetTask deleteTweetTask, Callback<Response> callback);
}

