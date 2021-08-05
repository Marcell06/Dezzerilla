package ac.id.atmaluhur.dezzerilla;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface MenuJSONPlaceHolderAPI {
    @GET("menu.php")
    Call<List<MenuPost>> getPosts(

    );
    @GET("menu.php")
    Call<List<MenuPost>> getPosts(@QueryMap Map<String, String> parameters);
}
