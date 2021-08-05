package ac.id.atmaluhur.dezzerilla;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterMenu extends RecyclerView.Adapter<AdapterMenu.AdapterHolder> {

    private Context context;
    private List<MenuPost> datalist;
    public AdapterMenu(Context context, List<MenuPost> datalist){
        this.context  = context;
        this.datalist = datalist;

    }

    @NonNull
    @Override
    public AdapterMenu.AdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_list_menu, parent,false);
        AdapterHolder holder = new AdapterHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterMenu.AdapterHolder holder, int position) {
        final MenuPost menuPost = datalist.get(position);
        String id = menuPost.getId();
        String nama = menuPost.getNama();
        String harga = menuPost.getHarga();
        String deskripsi = menuPost.getDeskripsi();

        holder.tvID.setText("ID : " + id);
        holder.tvNama.setText("Nama : " + nama);
        holder.tvHarga.setText("Harga : " + harga);
        holder.tvDeskripsi.setText("Deskripsi : " + deskripsi);
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public static class AdapterHolder extends RecyclerView.ViewHolder {

        TextView tvID, tvNama, tvHarga, tvDeskripsi;

        public AdapterHolder(@NonNull View itemView) {
            super(itemView);

            tvID = itemView.findViewById(R.id.tv_id_menu);
            tvNama = itemView.findViewById(R.id.tv_menu);
            tvHarga = itemView.findViewById(R.id.tv_harga);
            tvDeskripsi = itemView.findViewById(R.id.tv_deskripsi);

        }
    }
}
