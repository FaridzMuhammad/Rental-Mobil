package rentalmobil;

public class Mobil<N, NP, W, H, S> {

    private N nama;
    private NP noPlat;
    private W warna;
    private H harga;
    private S statusSewa;

    public Mobil(N nama, NP noPlat, W warna, H harga, S statusSewa) {
        this.nama = nama;
        this.noPlat = noPlat;
        this.warna = warna;
        this.harga = harga;
        this.statusSewa = statusSewa;
    }

    public N getNama() {
        return nama;
    }

    public NP getNoPlat() {
        return noPlat;
    }

    public W getWarna() {
        return warna;
    }

    public H getHarga() {
        return harga;
    }

    public S getStatusSewa() {
        return statusSewa;
    }

    public void setNama(N nama) {
        this.nama = nama;
    }

    public void setNoPlat(NP noPlat) {
        this.noPlat = noPlat;
    }

    public void setWarna(W warna) {
        this.warna = warna;
    }

    public void setHarga(H harga) {
        this.harga = harga;
    }

    public void setStatusSewa(S statusSewa) {
        this.statusSewa = statusSewa;
    }
}