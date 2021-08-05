package ac.id.atmaluhur.dezzerilla;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface PelangganJsonPlaceHolderAPI {
    @GET("pelanggan.php")
    Call<List<PelangganPost>> getPosts(

    );
    @GET("pelanggan.php")
    Call<List<PelangganPost>> getPosts(@QueryMap Map<String, String> parameters);
}
