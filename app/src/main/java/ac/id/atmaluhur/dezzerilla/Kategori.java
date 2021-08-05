package ac.id.atmaluhur.dezzerilla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Kategori extends AppCompatActivity {
    private TextView textViewResult;
    private KategoriJsonPlaceHolderAPI jsonPlaceHolderAPI;
    RecyclerView recyclerView;
    AdapterKategori adapter;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);

        recyclerView = findViewById(R.id.rv_data);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.1.24/UASMPL/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        jsonPlaceHolderAPI = retrofit.create(KategoriJsonPlaceHolderAPI.class);
        getPosts();
    }

    private void getPosts() {
        Map<String, String> parameters = new HashMap<>();
        Call<List<KategoriPost>> call = jsonPlaceHolderAPI.getPosts();
        call.enqueue(new Callback<List<KategoriPost>>() {
            @Override
            public void onResponse(Call<List<KategoriPost>> call, Response<List<KategoriPost>> response) {
                if (response.isSuccessful()){
                    List<KategoriPost> posts = response.body();
                    adapter = new AdapterKategori(Kategori.this, posts);
                    recyclerView.setAdapter(adapter);

                    return;
                }
            }

            @Override
            public void onFailure(Call<List<KategoriPost>> call, Throwable t) {

            }
        });
    }
}