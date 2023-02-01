package rentalmobil;

class Customer {

    // Atribut
    private String costumer;
    private String alamat;
    private String noKTP;
    private String noTelepon;

    // Konstruktor
    public Customer(String costumer, String alamat, String noKTP, String noTelepon) {
        this.costumer = costumer;
        this.alamat = alamat;
        this.noKTP = noKTP;
        this.noTelepon = noTelepon;
    }

    // Method
    
    public String getCostumer() {
        return costumer;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setCostumer(String costumer) {
        this.costumer = costumer;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }
    
}