package ac.id.atmaluhur.dezzerilla;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface KategoriJsonPlaceHolderAPI {
    @GET("kategori.php")
    Call<List<KategoriPost>> getPosts(

    );
    @GET("kategori.php")
    Call<List<KategoriPost>> getPosts(@QueryMap Map<String, String> parameters);
}
