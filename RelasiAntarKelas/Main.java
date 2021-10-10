package RelasiAntarKelas;

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
        System.out.println("Daftar mahasiswa: ");
        System.out.println("1. " + mhs1.getNim() + " - " + mhs1.getNama());
        System.out.println("2. " + mhs2.getNim() + " - " + mhs2.getNama());
        System.out.println("3. " + mhs3.getNim() + " - " + mhs3.getNama());

        System.out.println();

        System.out.println("Kode: " + jrs2.getKode());
        System.out.println("Nama: " + jrs2.getNama());
        System.out.println("Daftar mahasiswa: ");
        System.out.println("1. " + mhs4.getNim() + " - " + mhs4.getNama());
        System.out.println("2. " + mhs5.getNim() + " - " + mhs5.getNama());
        System.out.println("3. " + mhs6.getNim() + " - " + mhs6.getNama());
        System.out.println("4. " + mhs7.getNim() + " - " + mhs7.getNama());
    }
}
