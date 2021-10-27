package AssessmentNo1;

public class MarketPlace {
    private String namaPengirim = "Eiger",
            alamatPengirim = "Bandung Kopo",
            namaPenerima,
            alamatPenerima,
            namaEkspedisi,
            noResi,
            namaDropship,
            alamatDropship,
            statusAsuransi,
            jenisPemesanan,
            statusDropship;
    private int noTransaksi;
    private float ongkir, nominalAsuransi;

    // Konstruktor Utama
    public MarketPlace(
            int noTransaksi,
            String noResi,
            String namaEkspedisi,
            float ongkir,
            String namaPengirim,
            String alamatPengirim,
            String namaPenerima,
            String alamatPenerima,
            String jenisPemesanan) {

        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkir = ongkir;
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
        this.jenisPemesanan = jenisPemesanan;
    }

    //Konstruktor Utama + Asuransi
    public MarketPlace(
            int noTransaksi,
            String noResi,
            String namaEkspedisi,
            float ongkir,
            String namaPengirim,
            String alamatPengirim,
            String namaPenerima,
            String alamatPenerima,
            float nominalAsuransi,
            String statusAsuransi, String jenisPemesanan) {

        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkir = ongkir;
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
        this.nominalAsuransi = nominalAsuransi;
        this.statusAsuransi = statusAsuransi;
        this.jenisPemesanan = jenisPemesanan;
    }

    //Konstruktor Utama + Dropshipper
    public MarketPlace(
            int noTransaksi,
            String noResi,
            String namaEkspedisi,
            float ongkir,
            String namaPengirim,
            String alamatPengirim,
            String namaPenerima,
            String alamatPenerima,
            String namaDropship,
            String alamatDropship,
            String statusDropship, String jenisPemesanan) {

        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkir = ongkir;
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
        this.namaDropship = namaDropship;
        this.alamatDropship = alamatDropship;
        this.statusDropship = statusDropship;
        this.jenisPemesanan = jenisPemesanan;
    }

    //Konstruktor Utama + Asuransi + Dropshipper
    public MarketPlace(
            int noTransaksi,
            String noResi,
            String namaEkspedisi,
            float ongkir,
            String namaPengirim,
            String alamatPengirim,
            String namaPenerima,
            String alamatPenerima,
            float nominalAsuransi,
            String namaDropship,
            String alamatDropship,
            String statusAsuransi,
            String statusDropship, String jenisPemesanan) {

        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkir = ongkir;
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
        this.nominalAsuransi = nominalAsuransi;
        this.statusAsuransi = statusAsuransi;
        this.namaDropship = namaDropship;
        this.alamatDropship = alamatDropship;
        this.statusDropship = statusDropship;
        this.jenisPemesanan = jenisPemesanan;
    }


    public void cetakNormal() {
        System.out.println(jenisPemesanan);
        System.out.println("No Transaksi: " + noTransaksi);
        System.out.println("No Resi: " + noResi);
        System.out.println("Nama Ekspedisi " + namaEkspedisi);
        System.out.println("Ongkos Kirim: " + ongkir);
        System.out.println("Nama Pengirim: " + namaPengirim);
        System.out.println("Alamat Pengirim: " + alamatPengirim);
        System.out.println("Nama Penerima: " + namaPenerima);
        System.out.println("Alamat Penerima: " + alamatPenerima);
        System.out.println();
    }

    public void cetakAsuransi() {
        System.out.println(jenisPemesanan);
        System.out.println("No Transaksi: " + noTransaksi);
        System.out.println("No Resi: " + noResi);
        System.out.println("Nama Ekspedisi " + namaEkspedisi);
        System.out.println("Ongkos Kirim: " + ongkir);
        System.out.println("Nama Pengirim: " + namaPengirim);
        System.out.println("Alamat Pengirim: " + alamatPengirim);
        System.out.println("Nama Penerima: " + namaPenerima);
        System.out.println("Alamat Penerima: " + alamatPenerima);
        System.out.println("Nominal Asuransi: " + nominalAsuransi);
        System.out.println();
    }
        public void cetakDropship() {
            System.out.println(jenisPemesanan);
            System.out.println("No Transaksi: " + noTransaksi);
            System.out.println("No Resi: " + noResi);
            System.out.println("Nama Ekspedisi " + namaEkspedisi);
            System.out.println("Ongkos Kirim: " + ongkir);
            System.out.println("Nama Pengirim: " + namaDropship);
            System.out.println("Alamat Pengirim: " + alamatDropship);
            System.out.println("Nama Penerima: " + namaPenerima);
            System.out.println("Alamat Penerima: " + alamatPenerima);
            System.out.println();
        }

    public void cetakAsuransiDropship() {
        System.out.println(jenisPemesanan);
        System.out.println("No Transaksi: " + noTransaksi);
        System.out.println("No Resi: " + noResi);
        System.out.println("Nama Ekspedisi " + namaEkspedisi);
        System.out.println("Ongkos Kirim: " + ongkir);
        System.out.println("Nama Pengirim: " + namaDropship);
        System.out.println("Alamat Pengirim: " + alamatDropship);
        System.out.println("Nama Penerima: " + namaPenerima);
        System.out.println("Alamat Penerima: " + alamatPenerima);
        System.out.println("Nominal Asuransi: " + nominalAsuransi);
        System.out.println();
    }


}