class mobill{
	//atribut
    String merk;
    String warna;
    int kecepatan;
    int mesin;
    //konstruktor
    public mobill(){
    	merk ="yamaha";
    	warna="pink";
    	kecepatan=300;
    	mesin=350;
    }

    public mobill(String merkInput){
    	merk=merkInput;
    }

    public mobill(String merkInput, String warnaInput){
    	merk=merkInput;
    	warna=warnaInput;
    }
    //method
    //maju
    public void maju(){
    	System.out.println("mobil maju");
    }
    //mundur
    public void mundur(){
    	System.out.println("mobil mundur");
    }

    public String getMerk(){
    	return merk;
    }

    public String getWarna(){
    	return warna;
    }

    public int getKecepatan(){
    	return kecepatan;
    }

    public int getMesin(){
    	return mesin;
    }
}

