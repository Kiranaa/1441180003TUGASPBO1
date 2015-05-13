class tabungan{
	String simpanan;
	String pemilikRekening;
	int noRekening;
	int bunga;

	public tabungan(){

		simpanan		="BNI";
		pemilikRekening	="Ananda";
		noRekening		=67534896;
		bunga 			=35;
	}
	public tabungan(String pemilikRekeningInput, String simpananInput){
		pemilikRekening =pemilikRekeningInput;
		simpanan 		=simpananInput;
	}
	public tabungan(String pemilikRekeningInput, String simpananInput, int noRekeningInput){
	 	pemilikRekening =pemilikRekeningInput;
	 	simpanan 	    =simpananInput;
	 	noRekening  	=noRekeningInput;
	 } 
	 public tabungan(String pemilikRekeningInput, String simpananInput, int noRekeningInput, int bungainput){
	 	pemilikRekening	=pemilikRekeningInput;
	 	simpanan 	    =simpananInput;
	 	noRekening  	=noRekeningInput;
	 	bunga 			=bungainput;
	 	
	 }


	public void menabung(){

		System.out.println("Anda telah menabung");
	}
	public void mengambil(){

		System.out.println("Anda telah mengambil uang");
	}
	public void transfer(){

		System.out.println("Anda telah mentransfer uang");
	}
	public void menerimaTransfer()	{
		System.out.println("Anda telah menerima transfer");			
	}

	public String setpemilikRekening(){
		return pemilikRekening;
	}
	public String setsimpanan(){
		return simpanan;
	}
	public int getnoRekening(){
		return noRekening;
	}
	public int getbunga(){
		return bunga;
	}
	
}