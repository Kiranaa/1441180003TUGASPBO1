class Mahasiswa 
{
	//atribut
	private String nama;
	private int umur;

	//konstruktor
	public Mahasiswa(String namaInput, int umurInput)
	{
		nama = namaInput;
		umur = umurInput;
	}

	//method
	public void tampilkanBiodata(){
		System.out.println(": : : BIODATA : : :");
		System.out.println("nama    =" +getNama());
		System.out.println("umur    =" +getUmur());
	}
	//getter setter
	public String getNama(){

		return nama;
	}
	public void setNama(String nm){
		nama = nm;
	}
	public int getUmur(){

		return umur;
	}
	public void setUmur(int um){
		umur = um;
	}
}