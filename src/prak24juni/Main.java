package prak24juni;

/**
 * Created by User on 24/06/2015.
 */
public class Main {

    public static void main(String[] args) {

        Liga inggris = new Liga("Inggris");
        Divisi LeagueA = new Divisi("League A");
        Divisi LeagueB = new Divisi("League B");

        Klub a1 = new Klub("namaKlub1",LeagueA,inggris);
        Klub a2 = new Klub("namaKlub2",LeagueA,inggris);
        Klub b1 = new Klub("namaKlub3",LeagueB,inggris);
        Klub b2 = new Klub("namaKlub4",LeagueB,inggris);

        inggris.setDaftarDivisi(LeagueA);
        inggris.setDaftarDivisi(LeagueB);

        inggris.setDaftarKlub(a1);
        inggris.setDaftarKlub(a2);
        inggris.setDaftarKlub(b1);
        inggris.setDaftarKlub(b2);

        LeagueA.setDaftarKlub(a1);
        LeagueA.setDaftarKlub(a2);
        LeagueB.setDaftarKlub(b1);
        LeagueB.setDaftarKlub(b2);

        System.out.println("1. Get daftar divisi by nama liga");
        System.out.println("Daftar Divisi dari League : " + inggris.getDaftarDivisi());
        System.out.println("");

        System.out.println("2. Get daftar klub by nama liga");
        System.out.println("Daftar Klub dari League : " + inggris.getDaftarKlub());
        System.out.println("");

        System.out.println("3. Get daftar klub by nama divisi");
        System.out.println("Daftar Klub dari Divisi League A : " +LeagueA.getDaftarKlub());
        System.out.println("Daftar Klub dari Divisi League B : " +LeagueB.getDaftarKlub());
        System.out.println("");

        System.out.println("4. Get klub ini berada di divisi mana by nama Klub");

        System.out.println("Klub                : " + a1.getNamaKlub());
        System.out.println("Berada pada divisi  : " + a1.getDivisi());
        System.out.println("");

        System.out.println("5. Get klub ini berada di liga apa by nama klub");
        b1.setLiga(inggris);
        System.out.println("Klub                : " + b1.getNamaKlub());
        System.out.println("Liga                : "+ b1.getLiga());
        System.out.println("");


    }
}

