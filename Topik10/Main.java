package Topik10;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        new Main().main();
    }

    public void main() {
        int menu;
        do {
            System.out.println("MENU");
            System.out.println("1. Input Driver");
            System.out.println("2. Input Customer");
            System.out.println("3. Menampilkan Data");
            System.out.println("4. Top-up");
            System.out.println("5. Mengantar Penumpang");
            System.out.println("6. Selesai");
            System.out.print("Pilihan ke: ");
            menu = scan.nextInt();
            switch (menu) {
                case 1:
                    inputDriver();
                    break;
                case 2:
                    inputCustomer();
                    break;
                case 3:
                    displayAll();
                    break;
                case 4:
                    transaksi(0);
                    break;
                case 5:
                    transaksi(1);
                    break;
                case 6:
                    System.out.println("Berhenti");
                    break;
            }
        } while (menu != 6);
    }

    private void displayAll() {
        for (int i = 0; i < members.size(); i++) {
            Member memberView = members.get(i);
            memberView.display();
        }
    }

    private final ArrayList<Member> members = new ArrayList<>();
    private final Scanner scan = new Scanner(System.in);
    private final Scanner scanner = new Scanner(System.in);

    private void inputDriver() {
        System.out.println("\nMasukkan data Driver");
        System.out.print("NIK: ");
        String NIK = scan.next();
        System.out.print("Nama: ");
        String nama = scan.next();
        System.out.print("Nomor Telepon: ");
        String noTelp = scan.next();
        System.out.print("Plat Nomor: ");
        String noPlat = scan.next();
        System.out.print("Jenis: ");
        String jenis = scan.next();
        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();

        Member d = new Driver(NIK, nama, noTelp, noPlat, jenis, saldo);
        members.add(d);

    }

    private void inputCustomer() {
        System.out.println("\nMasukkan Data diri Customer");
        System.out.print("NIK: ");
        String NIK = scan.next();
        System.out.print("Nama Customer: ");
        String nama = scan.next();
        System.out.print("Nomor Telepon: ");
        String noTelp = scan.next();
        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();

        Member c = new Customer(NIK, nama, noTelp, saldo);
        members.add(c);
    }

    private Member searchById(String id) {
        Member m = null;
        for (Member x : members) {
            if (x.getNIK().equals(id)) {
                m = x;
                break;
            }
        }
        return m;
    }

    private void transaksi(int tipe) {
        System.out.println("\nDetail Transaksi");
        System.out.print("ID Customer: ");
        String idCust = scan.next();
        System.out.print("ID Driver: ");
        String idDriver = scan.next();
        System.out.print("Biaya: ");
        double biaya = scanner.nextDouble();

        Member c = searchById(idCust);
        Member d = searchById(idDriver);

        if ((c instanceof Customer) && (d instanceof Driver)) {
            if (tipe == 0) {
                c.transaksi(d, biaya);
            } else {
                d.transaksi(c, biaya);
                d.display();
            }
            c.display();
        }
    }
}
