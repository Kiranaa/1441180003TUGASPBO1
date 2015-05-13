class tesTabungan {
	public static void main(String[] args) {
		tabungan kirr = new tabungan();

		System.out.println("simpanan 			=" +kirr.setsimpanan());
		System.out.println("pemilikRekening 	=" +kirr.setpemilikRekening());
		System.out.println("noRekening 			=" +kirr.getnoRekening());
		System.out.println("bunga 				=" +kirr.getbunga());
		kirr.menabung();
		System.out.println(" ");




tabungan nevinta = new tabungan("nevinta","BRI");

		System.out.println("simpanan 	=" +nevinta.setsimpanan());
		System.out.println("pemilikRekening 	=" +nevinta.setpemilikRekening());
		nevinta.mengambil();
		System.out.println(" ");



tabungan tita = new tabungan("tita","BTN",144118003);
		
		System.out.println("simpanan 	=" +tita.setsimpanan());
		System.out.println("pemilikRekening 	=" +tita.setpemilikRekening());
		System.out.println("noRek 		=" +tita.getnoRekening());
		tita.transfer();
		System.out.println("");



tabungan ina = new tabungan("ina","Danamon",1441180011,105);

		System.out.println("simpanan 			=" +ina.setsimpanan());
		System.out.println("pemilikRekening 	=" +ina.setpemilikRekening());
		System.out.println("noRekening	 		=" +ina.getnoRekening());
		System.out.println("bunga 				=" +ina.getbunga());
		ina.menerimaTransfer();
		System.out.println(" ");

	}

}