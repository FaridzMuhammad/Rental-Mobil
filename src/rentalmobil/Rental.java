package rentalmobil;

public class Rental {
    private int idCostumer;
    private int idMobil;
    private String tanggalAwal;
    private String tanggalAkhir;
    private int lamaSewa;
    private int harga;


    public Rental(int idCostumer, int idMobil, String tanggalAwal, String tanggalAkhir, int lamaSewa, int harga) {
        this.idCostumer = idCostumer;
        this.idMobil = idMobil;
        this.tanggalAwal = tanggalAwal;
        this.tanggalAkhir = tanggalAkhir;
        this.harga = harga;
        this.lamaSewa = lamaSewa;
    }

    public int getIdCostumer() {
        return idCostumer;
    }

    public int getIdMobil() {
        return idMobil;
    }

    public String getTanggalAwal() {
        return tanggalAwal;
    }

    public String getTanggalAkhir() {
        return tanggalAkhir;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public int getHarga() {
        return harga;
    }

    public void setIdCostumer(int idCostumer) {
        this.idCostumer = idCostumer;
    }

    public void setIdMobil(int idMobil) {
        this.idMobil= idMobil;
    }

    public void settanggalAwal(String tanggalAwal) {
        this.tanggalAwal = tanggalAwal;
    }

    public void settanggalAkhir(String tanggalAkhir) {
        this.tanggalAkhir = tanggalAkhir;
    }

    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
}
