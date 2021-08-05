package ac.id.atmaluhur.dezzerilla;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PengirimanPost {
    @SerializedName("id_pengiriman")
    @Expose
    private String id_pengiriman;
    @SerializedName("nama_pelanggan")
    @Expose
    private String nama_pelanggan;
    @SerializedName("alamat_pelanggan")
    @Expose
    private String alamat_pelanggan;
    @SerializedName("nama")
    @Expose
    private String nama;
    @SerializedName("status")
    @Expose
    private String status;

    public String getId_pengiriman() {
        return id_pengiriman;
    }

    public void setId_pengiriman(String id_pengiriman) {
        this.id_pengiriman = id_pengiriman;
    }

    public String getNama_pelanggan() {
        return nama_pelanggan;
    }

    public void setNama_pelanggan(String nama_pelanggan) {
        this.nama_pelanggan = nama_pelanggan;
    }

    public String getAlamat_pelanggan() {
        return alamat_pelanggan;
    }

    public void setAlamat_pelanggan(String alamat_pelanggan) {
        this.alamat_pelanggan = alamat_pelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
