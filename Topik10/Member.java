package Topik10;

public abstract class Member {
    protected final String NIK, nama, noTelp;
    protected double saldo;

    public Member(
            String NIK,
            String nama,
            String noTelp,
            double saldo) {
        this.NIK = NIK;
        this.nama = nama;
        this.noTelp = noTelp;
        this.saldo = saldo;
    }

    public String getNIK() {
        return NIK;
    }

    public void transaksi(Member other, double biaya) {
        this.saldo = this.saldo + biaya;
        other.saldo = other.saldo - biaya;
    }

    public abstract void display();
}
