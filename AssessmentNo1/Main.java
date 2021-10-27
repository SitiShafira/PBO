package AssessmentNo1;

public class Main {
    public static void main(String[] args) {
        MarketPlace asuransiDropshipper = new MarketPlace(
                1,
                "N0001",
                "JNE",
                21000.0f,
                "Tara",
                "Surabaya",
                "Bejo",
                "Dayeuhkolot",
                40000.0f,
                "Tara",
                "Surabaya",
                "Pakai",
                "Dropshipper" ,
                "Asuransi dan Dropship");
        asuransiDropshipper.cetakAsuransiDropship();

        MarketPlace asuransi = new MarketPlace(
                2,
                "N0003",
                "J&T",
                16000.0f,
                "Eiger",
                "Bandung Kopo",
                "Tini",
                "DayeuhKolot",
                40000.0f,
                "Pakai",
                "Asuransi");
        asuransi.cetakAsuransi();

        MarketPlace normal = new MarketPlace (
                3,
                "N0004",
                "Pos Indonesia",
                23000.0f,
                "Eiger",
                "Bandung Kopo",
                "Bambang",
                "DayeuhKolot",
                "Normal");
        normal.cetakNormal();

        MarketPlace dropshipper = new MarketPlace(
                4,
                "N0002",
                "SiCepat",
                24000.0f,
                "Eiger",
                "Bandung Kopo",
                "Joko",
                "Dayeuhkolot",
                "Fira",
                "Pontianak",
                "pakai",
                "Dropshipper");
        dropshipper.cetakDropship();





    }
}
