package ac.id.atmaluhur.dezzerilla;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class KategoriPost {
    @SerializedName("id_kategori")
    @Expose
    private String id_kategori;
    @SerializedName("nama_kategori")
    @Expose
    private String nama_kategori;
    @SerializedName("keterangan")
    @Expose
    private String keterangan;

    public String getId() {
        return id_kategori;
    }

    public void setId(String id) {
        this.id_kategori = id_kategori;
    }

    public String getNama_kategori() {
        return nama_kategori;
    }

    public void setNama_kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

}
