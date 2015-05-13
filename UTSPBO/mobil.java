class mobil extends kendaraan {
	private int kecepatanMaks;
	private int jumlahRoda;

	kendaraan mob = new kendaraan();

	public mobil(int kecepatanMaksInput, int beratInput, int kapasitasInput, int jumlahRodaInput){
		kecepatanMaks = kecepatanMaksInput;
		berat = beratInput;
		kapasitas = kapasitasInput;
		jumlahRoda = jumlahRodaInput;
	}

	public void CetakSpesifikasi(){
		System.out.println("Kecepatan Maks Kendaraan : "+mob.kendaraan());
		System.out.println("Kecepatan Maks Mobil : "+kecepatanMaks);
		System.out.println("Berat Mobil : "+berat);
		System.out.println("Jumlah Roda Mobil : "+jumlahRoda);

	}
	
	public void Jalankan(int Kecepatan){
		System.out.println("Mobil dijalankan dengan kecepatan: "+Kecepatan);
	}
}