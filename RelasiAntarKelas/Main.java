package RelasiAntarKelas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa("6701", "Rendi");
        Mahasiswa mhs2 = new Mahasiswa("6702", "Chaca");
        Mahasiswa mhs3 = new Mahasiswa("6703", "Agus");
        Mahasiswa mhs4 = new Mahasiswa("6301", "Ridwan");
        Mahasiswa mhs5 = new Mahasiswa("6302", "Siska");
        Mahasiswa mhs6 = new Mahasiswa("6303", "Zayn");
        Mahasiswa mhs7 = new Mahasiswa("6304", "Rahmat");

        Jurusan jrs1 = new Jurusan("D3IF", "Diploma 3 Rekayasa Perangkat Lunak Aplikasi");
        Jurusan jrs2 = new Jurusan("D3SI", "Diploma 3 Sistem Informasi");

        jrs1.addMhs(mhs1);
        jrs1.addMhs(mhs2);
        jrs1.addMhs(mhs3);
        jrs2.addMhs(mhs4);
        jrs2.addMhs(mhs5);
        jrs2.addMhs(mhs6);
        jrs2.addMhs(mhs7);

        System.out.println("Kode: " + jrs1.getKode());
        System.out.println("Nama: " + jrs1.getNama());
        ArrayList<Mahasiswa> al = jrs1.getMhs();
        for (Mahasiswa mhs:al){
            System.out.println(" - " + mhs.getNim() + " - " + mhs.getNama());
        }

        System.out.println();

        System.out.println("Kode: " + jrs2.getKode());
        System.out.println("Nama: " + jrs2.getNama());
        ArrayList<Mahasiswa> aL = jrs2.getMhs();
        for (Mahasiswa mhs:aL){
            System.out.println(" - " + mhs.getNim() + " - " + mhs.getNama());
        }
    }
}
