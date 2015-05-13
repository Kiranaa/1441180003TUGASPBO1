class mobil {
	String merk;
	String platNomor;
	String warna;
	int mesin;
	int kecepatan;

	public mobil(){

		merk		="Yamaha";
		platNomor	="N2354LL";
		warna 		="Putih";
		mesin		=3000;
		kecepatan	=160;
	}
	public mobil(String merkinput, String platNomorinput){
		merk 		=merkinput;
		platNomor 	=platNomorinput;
	}
	public mobil(String merkinput, String platNomorinput, String warnainput){
		merk 		=merkinput;
		platNomor 	=platNomorinput;
		warna 		=warnainput;
	}
	public mobil(String merkinput, String platNomorinput, String warnainput, int mesininput){
		merk 		=merkinput;
		platNomor 	=platNomorinput;
		warna 		=warnainput;
		mesin 		=mesininput;
	}
	public mobil(String merkinput, String platNomorinput, String warnainput, int mesininput, int kecepataninput){
		merk 		=merkinput;
		platNomor 	=platNomorinput;
		warna 		=warnainput;
		mesin 		=mesininput;
		kecepatan 	=kecepataninput;
	}

	public void mundur(){
		System.out.println("mobil mundur");
	}
	public void maju(){
		System.out.println("mobil maju");
	}
	public void berhenti(){
		System.out.println("mobil berhenti");
	}
	public void ngerem(){
		System.out.println("mobil ngerem");
	}
	public void ngebut(){
		System.out.println("mobil ngebut");
	}
	public void belok(){
		System.out.println("mobil belok");
	}
	
	public String getmerk(){

		return merk;
	}
	public String getplatNomor(){

		return platNomor;
	}
	public String getwarna(){
		
		return warna;
	}
	public int getmesin(){
		
		return mesin;
	}
	public int getkecepatan(){
		
		return kecepatan;
	}
}