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

public class Pengiriman extends AppCompatActivity {
    private TextView textViewResult;
    private PengirimanJsonPlaceHolderAPI jsonPlaceHolderAPI;
    RecyclerView recyclerView;
    AdapterPengiriman adapter;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengiriman);

        recyclerView = findViewById(R.id.rv_data);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.1.24/UASMPL/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        jsonPlaceHolderAPI = retrofit.create(PengirimanJsonPlaceHolderAPI.class);
        getPosts();
    }

    private void getPosts() {
        Map<String, String> parameters = new HashMap<>();
        Call<List<PengirimanPost>> call = jsonPlaceHolderAPI.getPosts();
        call.enqueue(new Callback<List<PengirimanPost>>() {
            @Override
            public void onResponse(Call<List<PengirimanPost>> call, Response<List<PengirimanPost>> response) {
                if (response.isSuccessful()){
                    List<PengirimanPost> posts = response.body();
                    adapter = new AdapterPengiriman(Pengiriman.this, posts);
                    recyclerView.setAdapter(adapter);

                    return;
                }
            }

            @Override
            public void onFailure(Call<List<PengirimanPost>> call, Throwable t) {
                textViewResult.setText(t.getMessage());
            }
        });
    }
}