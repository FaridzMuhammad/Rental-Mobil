package rentalmobil;

public class Kategori extends Mobil{
    private String kategori;
    private String deskripsi;

    public Kategori(Object nama, Object noPlat, Object warna, Object harga, Object statusSewa, String kategori, String deskripsi) {
        super(nama, noPlat, warna, harga, statusSewa);
        this.kategori = kategori;
        this.deskripsi = deskripsi;
        //TODO Auto-generated constructor stub
    }

    public String getKategori(){
        return kategori;
    }

    public String getDeskripsi(){
        return deskripsi;
    }

    public void setKategori(String kategori){
        this.kategori = kategori;
    }

    public void setDeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }
    
}
