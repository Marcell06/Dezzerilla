package ac.id.atmaluhur.dezzerilla;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterPengiriman extends RecyclerView.Adapter<AdapterPengiriman.AdapterHolder> {

    private Context context;
    private List<PengirimanPost> datalist;
    public AdapterPengiriman(Context context, List<PengirimanPost> datalist) {
        this.context = context;
        this.datalist = datalist;
    }
    @NonNull
    @Override
    public AdapterPengiriman.AdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_list_pengiriman, parent,false);
            AdapterHolder holder = new AdapterHolder(view);
            return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterPengiriman.AdapterHolder holder, int position) {
        final PengirimanPost pengirimanPost = datalist.get(position);
        String id = pengirimanPost.getId_pengiriman();
        String nama = pengirimanPost.getNama_pelanggan();
        String alamat_pelanggan = pengirimanPost.getAlamat_pelanggan();
        String pesanan = pengirimanPost.getNama();
        String status = pengirimanPost.getStatus();

        holder.tvID.setText("ID : " + id);
        holder.tvNama.setText("Nama : " + nama);
        holder.tvAlamat.setText("Alamat : " + alamat_pelanggan);
        holder.tvPesanan.setText("Pesanan : " + pesanan);
        holder.tvStatus.setText("Status : " + status);
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class AdapterHolder extends RecyclerView.ViewHolder {

        TextView tvID, tvNama, tvAlamat, tvPesanan, tvStatus;

        public AdapterHolder(@NonNull View itemView) {
            super(itemView);

            tvID = itemView.findViewById(R.id.tv_id_pengiriman);
            tvNama = itemView.findViewById(R.id.tv_nama_pemesan);
            tvAlamat = itemView.findViewById(R.id.tv_alamat_pemesan);
            tvPesanan = itemView.findViewById(R.id.tv_pesanan);
            tvStatus = itemView.findViewById(R.id.tv_status);
        }
    }
}
