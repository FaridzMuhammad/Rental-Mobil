package rentalmobil;

import java.util.ArrayList;

public class ArraylistKategori {
    static ArrayList<Kategori> listKategori = new ArrayList<Kategori>();

    public static void addKategori(Object nama, Object noPlat, Object warna, Object harga, Object statusSewa,
            String kategori, String deskripsi) {
        listKategori.add(new Kategori(nama, noPlat, warna, harga, statusSewa, kategori, deskripsi));
    }

    // Getter
    public static Object getNama(int index) {
        return listKategori.get(index).getNama();
    }

    public static Object getNoPlat(int index) {
        return listKategori.get(index).getNoPlat();
    }

    public static Object getWarna(int index) {
        return listKategori.get(index).getWarna();
    }

    public static Object getHarga(int index) {
        return listKategori.get(index).getHarga();
    }

    public static Object getStatusSewa(int index) {
        return listKategori.get(index).getStatusSewa();
    }

    public static String getKategori(int index) {
        return listKategori.get(index).getKategori();
    }

    public static String getDeskripsi(int index) {
        return listKategori.get(index).getDeskripsi();
    }

    // Setter
    public void setNama(int index, String nama) {
        listKategori.get(index).setNama(nama);
    }

    public void setNoPlat(int index, String noPlat) {
        listKategori.get(index).setNoPlat(noPlat);
    }

    public void setWarna(int index, String warna) {
        listKategori.get(index).setWarna(warna);
    }

    public void setHarga(int index, int harga) {
        listKategori.get(index).setHarga(harga);
    }

    public void setStatusSewa(int index, Boolean statusSewa) {
        listKategori.get(index).setStatusSewa(statusSewa);
    }

    public void setKategori(int index, String kategori) {
        listKategori.get(index).setKategori(kategori);
    }

    public void setDeskripsi(int index, String deskripsi) {
        listKategori.get(index).setDeskripsi(deskripsi);
    }

    // Size
    public static int getSize() {
        return listKategori.size();
    }

    // Remove
    public static void removeKategori(int index) {
        listKategori.remove(index);
    }

    public static void updateStatus(int index, Boolean statusSewa) {
        listKategori.get(index).setStatusSewa(statusSewa);
    }

    public static void displayListMobil() {

        // System.out.println("List Mobil");
        // System.out.println("No. Nama No. Plat Warna Harga Status Sewa Kategori
        // Deskripsi");

        // for (int i = 0; i < listKategori.size(); i++) {
        // System.out.println((i + 1) + ". " + listKategori.get(i).getNama() + " " +
        // listKategori.get(i).getNoPlat()
        // + " " + listKategori.get(i).getWarna() + " " + listKategori.get(i).getHarga()
        // + " "
        // + listKategori.get(i).getStatusSewa() + " " +
        // listKategori.get(i).getKategori() + " "
        // + listKategori.get(i).getDeskripsi());
        // }

        System.out.println("List Mobil");

        //memakai format String
        System.out.printf("%-8s", "No.");
        System.out.printf("%-15s", "Nama");
        System.out.printf("%-15s", "No. Plat");
        System.out.printf("%-10s", "Warna");
        System.out.printf("%-10s", "Harga");
        System.out.printf("%-15s", "Status Sewa");
        System.out.printf("%-10s", "Kategori");
        System.out.printf("%s", "Deskripsi");
        System.out.println();

        for (int i = 0; i < listKategori.size(); i++) {
            System.out.printf("%-8s", (i + 1) + ".");
            System.out.printf("%-15s", listKategori.get(i).getNama());
            System.out.printf("%-15s", listKategori.get(i).getNoPlat());
            System.out.printf("%-10s", listKategori.get(i).getWarna());
            System.out.printf("%-10s", listKategori.get(i).getHarga());
            System.out.printf("%-15s", listKategori.get(i).getStatusSewa());
            System.out.printf("%-10s", listKategori.get(i).getKategori());
            System.out.printf("%s", listKategori.get(i).getDeskripsi());
            System.out.println();
        }
    }
}
