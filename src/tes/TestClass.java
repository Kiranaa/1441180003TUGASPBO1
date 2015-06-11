package tes;

/**
 * Created by User on 11/06/2015.
 */
public class TestClass {
    public static void main(String[] args) {
        Penulis Kirana = new Penulis("Kirana","jalan jalan",'p',"jomblo",40);
        Penulis Nina = new Penulis("Nina","jalan buntu",'L',"Menikah",45);

        Buku ceritaRakyat = new Buku("ceritaRakyat",45000.0,"Erlangga",Kirana);
        System.out.println(ceritaRakyat.toString());
    }
}
