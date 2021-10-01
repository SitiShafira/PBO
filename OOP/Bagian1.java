package OOP;

class Barang {
    String idProduk;
    String nama;
    double harga;

    Barang(String idProduk, String nama, double harga) {
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
    }

    Barang(String idProduk, String nama) {
        this.idProduk = idProduk;
        this.nama = nama;
    }

    public void setNama(String nama) {

        this.nama = nama;
    }

    public String getNama() {

        return nama;
    }

    public void setHarga( double harga) {

        this.harga = harga;
    }

    public double getHarga() {

        return harga;
    }

    public String getIdProduk() {

        return idProduk;
    }

    public void cetak() {

        System.out.println(getIdProduk()+ " / "+ getNama() + " / " + getHarga());
    }
}

class Bagian1{
    public static void main(String[] args) {
        Barang Tas = new Barang("BRG-001", "Tas Gucci");
        Tas.setHarga(1200);
        Tas.cetak();

        Barang Printer = new Barang("BRG-002", "Printer Epson L355");
        Printer.setHarga(200);
        Printer.cetak();

        Barang Koper = new Barang("BRG-003", "Koper", 150);
        Koper.cetak();

        Barang Helm = new Barang("BRG-004", "Helm", 20);
        Helm.cetak();

        System.out.println("\nTotal harga dari BRG-001, BRG-003, BRG-004");
        System.out.println(Tas.getHarga() + Koper.getHarga() + Helm.getHarga());
    }
}
