package ac.id.atmaluhur.dezzerilla;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface PengirimanJsonPlaceHolderAPI {
    @GET("pengiriman.php")
    Call<List<PengirimanPost>> getPosts(

    );
    @GET("pengiriman.php")
    Call<List<PengirimanPost>> getPosts(@QueryMap Map<String, String> parameters);
}
