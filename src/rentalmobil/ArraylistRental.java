package rentalmobil;

import java.util.ArrayList;

public class ArraylistRental {
    static ArrayList<Rental> listRental = new ArrayList<Rental>();

    public static void addRental(int idCostumer, int idMobil, String tanggalAwal, String tanggalAkhir, int lamaSewa,
            int harga) {
        listRental.add(new Rental(idCostumer, idMobil, tanggalAwal, tanggalAkhir, lamaSewa, harga));
    }

    public static int getIdCostumer(int index) {
        return listRental.get(index).getIdCostumer();
    }

    public static int getIdMobil(int index) {
        return listRental.get(index).getIdMobil();
    }

    public static String getTanggalAwal(int index) {
        return listRental.get(index).getTanggalAwal();
    }

    public static String getTanggalAkhir(int index) {
        return listRental.get(index).getTanggalAkhir();
    }

    public static int getLamaSewa(int index) {
        return listRental.get(index).getLamaSewa();
    }

    public static int getHarga(int index) {
        return listRental.get(index).getHarga();
    }

    public void setIdCostumer(int index, int idCostumer) {
        listRental.get(index).setIdCostumer(idCostumer);
    }

    public void setIdMobil(int index, int idMobil) {
        listRental.get(index).setIdMobil(idMobil);
    }

    public void setTanggalAwal(int index, String tanggalAwal) {
        listRental.get(index).settanggalAwal(tanggalAwal);
    }

    public void setTanggalAkhir(int index, String tanggalAkhir) {
        listRental.get(index).settanggalAkhir(tanggalAkhir);
    }

    public void setLamaSewa(int index, int lamaSewa) {
        listRental.get(index).setLamaSewa(lamaSewa);
    }

    public void setHarga(int index, int harga) {
        listRental.get(index).setHarga(harga);
    }

    public static int getSize() {
        return listRental.size();
    }

    public static void deleteRental(int index) {
        listRental.remove(index);
    }

    public static void displayRentalCostumer() {
        // for (int i = 0; i < listRental.size(); i++) {
        // System.out.println((i + 1) + " " +
        // ArraylistCostumer.getCostumer(getIdCostumer(i)) + " "
        // + ArraylistKategori.getNama(getIdMobil(i)) + " " +
        // ArraylistRental.getTanggalAwal(i) + " "
        // + ArraylistRental.getTanggalAkhir(i) + " " + ArraylistRental.getLamaSewa(i) +
        // " "
        // + ArraylistRental.getHarga(i));
        // }

        System.out.println("Daftar Rental");

        // memakai format String
        System.out.printf("%-8s", "No.");
        System.out.printf("%-20s", "Costumer");
        System.out.printf("%-20s", "Mobil");
        System.out.printf("%-20s", "Tanggal Awal");
        System.out.printf("%-20s", "Tanggal Akhir");
        System.out.printf("%-20s", "Lama Sewa");
        System.out.printf("%-20s", "Harga");
        System.out.println();

        for (int i = 0; i < listRental.size(); i++) {
            System.out.printf("%-8s", (i + 1));
            System.out.printf("%-20s", ArraylistCostumer.getCostumer(getIdCostumer(i)));
            System.out.printf("%-20s", ArraylistKategori.getNama(getIdMobil(i)));
            System.out.printf("%-20s", ArraylistRental.getTanggalAwal(i));
            System.out.printf("%-20s", ArraylistRental.getTanggalAkhir(i));
            System.out.printf("%-20s", ArraylistRental.getLamaSewa(i));
            System.out.printf("%-20s", ArraylistRental.getHarga(i));
            System.out.println();
        }
    }
}
