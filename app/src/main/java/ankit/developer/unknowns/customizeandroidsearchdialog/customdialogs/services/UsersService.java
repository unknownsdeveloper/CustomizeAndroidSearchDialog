package ankit.developer.unknowns.customizeandroidsearchdialog.customdialogs.services;

import java.util.ArrayList;

import ankit.developer.unknowns.customizeandroidsearchdialog.customdialogs.models.UserModel;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UsersService {
    @POST("api/users")
    Call<ArrayList<UserModel>> getFakeUsersBasedOnASearchTag(@Body String tag);
}
