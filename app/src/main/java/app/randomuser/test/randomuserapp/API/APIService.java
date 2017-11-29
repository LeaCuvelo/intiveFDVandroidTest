package app.randomuser.test.randomuserapp.API;


import app.randomuser.test.randomuserapp.API.models.APIResultModel;
import app.randomuser.test.randomuserapp.utils.Constants;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Lea on 28/11/17.
 */

public interface APIService  {

    @GET(" ")
    Call<APIResultModel> getRandomUsersWithQuantity(@Query("results") int quantity);



    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Constants.BASE_URL_API)
            .addConverterFactory(GsonConverterFactory.create())
            .build();


}
