package Topik10;

public class Customer extends Member {
    public Customer(
            String NIK,
            String nama,
            String noTelp,
            double saldo) {
        super(NIK, nama, noTelp, saldo);
    }

    @Override
    public void display() {
        System.out.println("\nData diri Customer: ");
        System.out.println("NIK: " + NIK);
        System.out.println("Nama Customer: " + nama);
        System.out.println("Nomor Telepon: " + noTelp);
        System.out.println("Saldo: " + saldo);
    }
}
