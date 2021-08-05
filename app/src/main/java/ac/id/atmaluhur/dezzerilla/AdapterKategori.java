package ac.id.atmaluhur.dezzerilla;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterKategori extends RecyclerView.Adapter<AdapterKategori.AdapterHolder> {

    private Context context;
    private List<KategoriPost> datalist;
    public AdapterKategori(Context context, List<KategoriPost> datalist){
        this.context  = context;
        this.datalist = datalist;

    }

    @NonNull
    @Override
    public AdapterKategori.AdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_list_kategori, parent,false);
        AdapterHolder holder = new AdapterHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterKategori.AdapterHolder holder, int position) {
        final KategoriPost kategoriPost = datalist.get(position);
        String nama = kategoriPost.getNama_kategori();
        String deskripsi = kategoriPost.getKeterangan();

        holder.tvNama.setText("Nama : " + nama);
        holder.tvDeskripsi.setText("Deskripsi : " + deskripsi);
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class AdapterHolder extends RecyclerView.ViewHolder {

        TextView tvNama, tvDeskripsi;

        public AdapterHolder(@NonNull View itemView) {
            super(itemView);

            tvNama = itemView.findViewById(R.id.tv_nama);
            tvDeskripsi = itemView.findViewById(R.id.tv_deskripsi);
        }
    }
}
