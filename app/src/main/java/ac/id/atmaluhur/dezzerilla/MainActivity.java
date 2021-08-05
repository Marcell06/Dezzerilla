package ac.id.atmaluhur.dezzerilla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void menu(View View) {
        Intent i = new Intent(MainActivity.this, Menu.class);
        startActivity(i);
    }

    public void kategori(View View) {
        Intent i = new Intent(MainActivity.this, Kategori.class);
        startActivity(i);
    }

    public void pelanggan(View View) {
        Intent i = new Intent(MainActivity.this, Pelanggan.class);
        startActivity(i);
    }

    public void pengiriman(View View) {
        Intent i = new Intent(MainActivity.this, Pengiriman.class);
        startActivity(i);
    }
}