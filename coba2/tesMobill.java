class tesMobill{
   public static void main(String[] args) {
   	mobill kirana = new mobill();

   	System.out.println("merk =" +kirana.getmerk());
   	System.out.println("warna =" +kirana.getwarna());
   	System.out.println("kecepatan =" +kirana.getkecepatan() +"km");
   	System.out.println("mesin =" +kirana.getmesin() +"cc");
   	kirana.maju();
   	System.out.println(" ");

   	mobill nana = new mobill("suzuki");

   	System.out.println("merk =" +nana.getmerk());
   	nana.maju();
   	System.out.println(" ");

   	mobill kiki = new mobill("vw","merah");
   	System.out.println("merk =" +kiki.getmerk());
   	System.out.println("warna =" +kiki.getwarna());
   	kiki.mndur();
   	System.out.println(" ");


   }
}