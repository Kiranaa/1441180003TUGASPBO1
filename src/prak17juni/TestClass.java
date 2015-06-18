package prak17juni;

/**
 * Created by User on 17/06/2015.
 */
public class TestClass {
    public static void main(String[] args) {

        rekening kkk = new rekening(1000000.0);
        nasabah nnn = new nasabah("nnn",kkk);

        System.out.println(nnn.toString());
        nnn.setAkun(kkk);

        System.out.println(nnn.toString());

        //tarik saldo 450000
        kkk.tarik(450000);
        //tampilkan saldo
        System.out.println("Tarik Rp.450000");
        System.out.println("Tampilkan saldo sekarang = " + kkk.getSaldo());

        //setor 2000000
        kkk.setor(2000000);
        //tampilkan saldo
        System.out.println("Setor Rp.2000000");
        System.out.println("Tampilkan saldo sekarang = " + kkk.getSaldo());
    }
}
