package ReviewJava;

import java.util.ArrayList;

class Buku {
    private String ISBN;
    private String judul;
    private String tahunTerbit;
    private int harga;
    private float rating;

    public Buku(String ISBN, String judul, String tahunTerbit, int harga, float rating) {
        this.ISBN = ISBN;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
        this.rating = rating;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getJudul() {
        return judul;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    public void setTahunTerbit(String tahunTerbit){
        this.tahunTerbit = tahunTerbit;
    }

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }

    public void setRating(float rating){
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Buku{" +
                "ISBN='" + ISBN + '\'' +
                ", judul='" + judul + '\'' +
                ", tahunTerbit='" + tahunTerbit + '\'' +
                ", harga=" + harga +
                ", rating=" + rating +
                '}';
    }

    public void searchISBN(String ISBN) {
        if (this.ISBN.equalsIgnoreCase(ISBN)){
            System.out.println(ISBN+"-"+judul+"-"+tahunTerbit+"-"+harga+"-"+rating);
        }
    }
}

class Bagian1 {
    public static void main(String[] args) {
        ArrayList<Buku> Buku = new ArrayList<Buku>();

        //memasukkan data buku secara manual
        Buku.add(new Buku("97865", "Malin Kundang", "1988", 150000, 4));
        Buku.add(new Buku("97966", "Raden Kian Santang", "2000", 78000, 3));
        Buku.add(new Buku("97887", "Manusia Harimau", "1890", 60000, 4));

        //mengubah data kecuali isbn
        Buku.get(0).setJudul("Manusia Harimau");
        Buku.get(0).setTahunTerbit("1890");
        Buku.get(0).setHarga(60000);
        Buku.get(0).setRating(4);

        //menampilkan semua buku
        System.out.println("\nMenampilkan semua Buku:");
        for (Buku buku:Buku){
            buku.searchISBN("97865");
            buku.searchISBN("97966");
            buku.searchISBN("97887");
        }

        //menampilkan salah satu buku
        System.out.println("\nMenampilkan salah satu Buku:");
        for (Buku buku:Buku){
            buku.searchISBN("97865");
        }

        //menghapus salah satu data buku dan hasil setelahnya
        Buku.remove(0);
        System.out.println("\nData buku sesudah di hapus");
        for (Buku buku:Buku){
            System.out.println(buku);
        }
    }
}
