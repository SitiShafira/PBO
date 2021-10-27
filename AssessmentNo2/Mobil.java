package AssessmentNo2;

public class Mobil {
    private String merk, tahunKeluaran;
    private double harga;
    private int stok;

    public Mobil(String merk, String tahunKeluaran, double harga, int stok) {
        this.merk = merk;
        this.tahunKeluaran = tahunKeluaran;
        this.harga = harga;
        this.stok = stok;
    }

    public String getMerk(){
        return merk;
    }

    public String getTahunKeluaran(){
        return tahunKeluaran;
    }

    public double getHarga(){
        return harga;
    }

    public int getStok(){
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void displayInfo() {
        System.out.println("Merk : " + merk);
        System.out.println("Harga: " + harga);
        System.out.println("Tahun Keluaran: " + tahunKeluaran);
        System.out.println("Sisa Stok: " + stok);

    }

}
