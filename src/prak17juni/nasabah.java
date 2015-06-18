package prak17juni;

/**
 * Created by User on 17/06/2015.
 */
public class nasabah {
    private String nama;
    private rekening akun;

    public nasabah() {
    }

    public nasabah(String nama) {
        this.nama = nama;
    }

    public nasabah(String nama, rekening akun) {
        this.nama = nama;
        this.akun = akun;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public rekening getAkun() {
        return akun;
    }

    public void setAkun(rekening akun) {
        this.akun = akun;
    }

    @Override
    public String toString() {
        return "nasabah{" +
                "nama='" + nama + '\'' +
                ", akun=" + akun +
                '}';
    }
}
