package RelasiAntarKelas;

import java.util.ArrayList;

public class Jurusan {
    private String kode, nama;
    private final ArrayList<Mahasiswa> Mhs = new ArrayList<>();

    public Jurusan(String kode, String nama){
        this.kode = kode;
        this.nama = nama;
    }

    public  void addMhs (Mahasiswa m) {
        Mhs.add(m);
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public ArrayList<Mahasiswa> getMhs() {
        return Mhs;
    }
}
