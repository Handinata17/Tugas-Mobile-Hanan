package id.dbon.app.OnlineDB.retrofit;

import id.dbon.app.OnlineDB.model.ResponseMovie;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface ApiService {
    @GET("movie/popular")
    Call<ResponseMovie> ambilDataMovie(
        @Query("api_key") String apikey
    );
}
