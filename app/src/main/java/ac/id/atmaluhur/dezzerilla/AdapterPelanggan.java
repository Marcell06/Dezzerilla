package ac.id.atmaluhur.dezzerilla;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterPelanggan extends RecyclerView.Adapter<AdapterPelanggan.AdapterHolder> {

    private Context context;
    private List<PelangganPost> datalist;
    public AdapterPelanggan(Context context, List<PelangganPost> datalist) {
        this.context = context;
        this.datalist = datalist;
    }
    @NonNull
    @Override
    public AdapterPelanggan.AdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_list_pelanggan, parent,false);
            AdapterHolder holder = new AdapterHolder(view);
            return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterPelanggan.AdapterHolder holder, int position) {
            final PelangganPost pelangganPost = datalist.get(position);
            String id = pelangganPost.getId_pelanggan();
            String nama = pelangganPost.getNama_pelanggan();
            String jenis_kelamin = pelangganPost.getJenis_kelamin();
            String alamat = pelangganPost.getAlamat_pelanggan();

            holder.tvID.setText("ID : " + id);
            holder.tvNama.setText("Nama : " + nama);
            holder.tvJenis.setText("Jenis Kelamin : " + jenis_kelamin);
            holder.tvAlamat.setText("Alamat : " + alamat);
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class AdapterHolder extends RecyclerView.ViewHolder {

        TextView tvID, tvNama, tvJenis, tvAlamat;

        public AdapterHolder(@NonNull View view) {
            super(view);
            tvID = itemView.findViewById(R.id.tv_id_pelanggan);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvJenis = itemView.findViewById(R.id.tv_jenis_kelamin);
            tvAlamat = itemView.findViewById(R.id.tv_alamat);
        }
    }
}
