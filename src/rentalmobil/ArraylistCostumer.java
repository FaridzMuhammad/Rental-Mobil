package rentalmobil;

import java.util.ArrayList;

public class ArraylistCostumer {
    static ArrayList<Customer> listCostumer = new ArrayList<Customer>();

    public static void addCostumer(String costumer, String alamat, String noKTP, String noTelepon) {
        listCostumer.add(new Customer(costumer, alamat, noKTP, noTelepon));
    }

    // getter
    public static String getCostumer(int index) {
        return listCostumer.get(index).getCostumer();
    }

    public static String getAlamat(int index) {
        return listCostumer.get(index).getAlamat();
    }

    public static String getNoKTP(int index) {
        return listCostumer.get(index).getNoKTP();
    }

    public static String getNoTelepon(int index) {
        return listCostumer.get(index).getNoTelepon();
    }

    // setter
    public void setCostumer(int index, String costumer) {
        listCostumer.get(index).setCostumer(costumer);
    }

    public void setAlamat(int index, String alamat) {
        listCostumer.get(index).setAlamat(alamat);
    }

    public void setNoKTP(int index, String noKTP) {
        listCostumer.get(index).setNoKTP(noKTP);
    }

    public void setNoTelepon(int index, String noTelepon) {
        listCostumer.get(index).setNoTelepon(noTelepon);
    }

    public static int getSize() {
        return listCostumer.size();
    }

    public static void deleteCostumer(int index) {
        listCostumer.remove(index);
    }

    public static void displayCostumer() {
        // System.out.println("Daftar Costumer");
        // System.out.println("No. Costumer Alamat No.KTP No.Telepon");
        // for (int i = 0; i < listCostumer.size(); i++) {
        // System.out
        // .println((i + 1) + ". " + listCostumer.get(i).getCostumer() + " " +
        // listCostumer.get(i).getAlamat()
        // + " " + listCostumer.get(i).getNoKTP() + " " +
        // listCostumer.get(i).getNoTelepon());
        // }

        System.out.println("Daftar Costumer");

        // memakai fromat string
        System.out.printf("%-8s", "No.");
        System.out.printf("%-20s", "Costumer");
        System.out.printf("%-20s", "Alamat");
        System.out.printf("%-20s", "No.KTP");
        System.out.printf("%-20s", "No.Telepon");
        System.out.println();

        for (int i = 0; i < listCostumer.size(); i++) {
            System.out.printf("%-8s", (i + 1));
            System.out.printf("%-20s", listCostumer.get(i).getCostumer());
            System.out.printf("%-20s", listCostumer.get(i).getAlamat());
            System.out.printf("%-20s", listCostumer.get(i).getNoKTP());
            System.out.printf("%-20s", listCostumer.get(i).getNoTelepon());
            System.out.println();
        }

    }
}