package AssessmentNo2;

import java.util.ArrayList;

public class ShowroomJaya {
    static ArrayList<Mobil> arrMobil = new ArrayList<>();

    public static void main(String[] args) {

        Mobil mobil = new Mobil("Avanza", "2018",  150000000.0, 5);

        tambahMobil(mobil);

        System.out.println("Informasi Mobil");
        viewStok();
        System.out.println();

        beliMobil("Avanza","2018",2);

    }

    public static void tambahMobil(Mobil mobil){
        arrMobil.add(mobil);
    }

    public static void beliMobil(String merk, String tahun, int jumlahBeli){

        System.out.println("Merk : " + merk);
        System.out.println("Tahun Keluaran : " + tahun);
        System.out.println("Jumlah : " + jumlahBeli + "\n");

        for (Mobil mobil : arrMobil) {
            if(merk.equalsIgnoreCase(mobil.getMerk())
                    && tahun.equalsIgnoreCase(mobil.getTahunKeluaran())
                    && jumlahBeli < mobil.getStok()){

                mobil.setStok(mobil.getStok()-jumlahBeli);
                double diskon = 0.0;
                double hargaDiskon = 0.0;

                System.out.println("Merk : " + mobil.getMerk());
                System.out.println("Harga Satuan : " + mobil.getHarga());
                System.out.println("Tahun Keluaran : " + mobil.getTahunKeluaran());
                System.out.println("Jumlah Beli : " + jumlahBeli);
                System.out.println("Total Harga : " + mobil.getHarga() * jumlahBeli);

                double hargaTotal = mobil.getHarga() *jumlahBeli;

                if (jumlahBeli == 1){
                    diskon = 0.0;
                    hargaDiskon = diskon;
                }
                if (jumlahBeli == 2){
                    diskon = 10.0;
                    hargaDiskon = hargaTotal * 10/100;
                    mobil.setHarga(hargaDiskon);
                }
                if (jumlahBeli > 2){
                    diskon = 20.0;
                    hargaDiskon = hargaTotal * 20/100;
                    mobil.setHarga(hargaDiskon);
                }

                System.out.println("Diskon : " + diskon + " persen");
                System.out.println("Total Diskon : " + hargaDiskon);
                System.out.println("Total Bayar : " + (hargaTotal - hargaDiskon));
            }else {
                System.out.println("Maaf, Jumlah Stok Tidak Mencukupi\n");
            }
        }

    }

    public static void viewStok(){
        for ( Mobil mobil : arrMobil){
            mobil.displayInfo();

        }

    }

}