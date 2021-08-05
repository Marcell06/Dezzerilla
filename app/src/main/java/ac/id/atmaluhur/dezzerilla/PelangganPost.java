package ac.id.atmaluhur.dezzerilla;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PelangganPost {
    @SerializedName("id_pelanggan")
    @Expose
    private String id_pelanggan;
    @SerializedName("nama_pelanggan")
    @Expose
    private String nama_pelanggan;
    @SerializedName("jenis_kelamin")
    @Expose
    private String jenis_kelamin;
    @SerializedName("alamat_pelanggan")
    @Expose
    private String alamat_pelanggan;

    public String getId_pelanggan() {
        return id_pelanggan;
    }

    public void setId_pelanggan(String id) {
        this.id_pelanggan = id_pelanggan;
    }

    public String getNama_pelanggan() {
        return nama_pelanggan;
    }

    public void setNama_pelanggan(String nama_pelanggan) {
        this.nama_pelanggan = nama_pelanggan;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getAlamat_pelanggan() {
        return alamat_pelanggan;
    }

    public void setAlamat_pelanggan(String alamat_pelanggan) {
        this.alamat_pelanggan = alamat_pelanggan;
    }
}
