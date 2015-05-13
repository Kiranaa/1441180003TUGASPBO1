class tesMobil {
	public static void main(String[] args) {
		mobil kirana = new mobil();

		System.out.println("merk		=" +kirana.getmerk());
		System.out.println("platNomor	=" +kirana.getplatNomor());
		System.out.println("warna 		=" +kirana.getwarna());
		System.out.println("mesin		=" +kirana.getmesin() +"cc");
		System.out.println("kecepatan	=" +kirana.getkecepatan() +"km");
		kirana.maju();
		System.out.println(" ");	

	 mobil melinda = new mobil("Lamborgini","DK5686ZK");

		System.out.println("merk		=" +melinda.getmerk());
		System.out.println("platNomor	=" +melinda.getplatNomor());
		melinda.mundur();
		System.out.println(" ");


	mobil vinta = new mobil("vw","M2579UK","Kuning");

		System.out.println("merk		=" +vinta.getmerk());
		System.out.println("platNomor 	=" +vinta.getplatNomor());
		System.out.println("warna  		=" +vinta.getwarna());
		vinta.berhenti();
		System.out.println(" ");


	mobil nina = new mobil("HondaJazz","S6843HJ","Putih",1450);

		System.out.println("merk		=" +nina.getmerk());
		System.out.println("platNomor 	=" +nina.getplatNomor());
		System.out.println("warna  		=" +nina.getwarna());
		System.out.println("mesin   	=" +nina.getmesin() +"cc");
		nina.belok();
		System.out.println(" ");

	mobil dyah = new mobil("Brio","L3573ZY","Pink",1879,150);

		System.out.println("merk		=" +dyah.getmerk());
		System.out.println("platNomor 	=" +dyah.getplatNomor());
		System.out.println("warna  		=" +dyah.getwarna());
		System.out.println("mesin   	=" +dyah.getmesin() +"cc");
		System.out.println("kecepatan	=" +dyah.getkecepatan() +"km"); 
		dyah.ngebut();
		System.out.println(" ");
	

	
}
}