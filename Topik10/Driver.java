package Topik10;

public class Driver extends Member {
    private final String noPlat, jenis;

    public Driver(
            String NIK,
            String nama,
            String noTelp,
            String noPlat,
            String jenis,
            double saldo) {
        super(NIK, nama, noTelp, saldo);
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    @Override
    public void display() {
        System.out.println("\nData diri Driver: ");
        System.out.println("NIK: " + NIK);
        System.out.println("Nama: " + nama);
        System.out.println("Nomor Telepon: " + noTelp);
        System.out.println("Plat Nomor: " + noPlat);
        System.out.println("Jenis: " + jenis);
        System.out.println("Saldo: " + saldo);
    }
}
