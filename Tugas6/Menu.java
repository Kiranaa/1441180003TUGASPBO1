import java.util.Scanner;  
  
public class Menu  
  
{  
  
    public static void main(String args[])  
  
    {  int bil1;
        int bil2;
        int input;
        for (int f=1; f<999;f++){
  
                System.out.println("Menu :");  
  
                System.out.println("1. Penjumlahan");  
                System.out.println("2. Pengurangan");  
                System.out.println("3. Perkalian");  
                System.out.println("4. Pembagian");    
                System.out.println("5. Keluar");  
            
                System.out.println("Masukkan Angka Pertama :");
                Scanner b1 = new Scanner(System.in);
                bil1 = b1.nextInt();

                System.out.println("Masukkan Angka Kedua :");
                Scanner b2 = new Scanner(System.in);
                bil2 = b2.nextInt();
  
                System.out.print("Masukkan Pilihan anda : ");  
                Scanner in = new Scanner(System.in);
                input = in.nextInt();
               
    
                System.out.println("====================");  
                  
                switch(input)  
  
                {   
  
                    case 1 : System.out.println("Penjumlahan");
                            System.out.print("Hasil penjumlahan dari :"+bil1+"+"+bil2+"=");
                            System.out.println(bil1+bil2);
  
                    break;  
  
                    case 2 : System.out.println("Pengurangan");
                            System.out.print("Hasil pengurangan dari :"+bil1+"-"+bil2+"=");
                            System.out.println(bil1-bil2);
                    break;  
  
                    case 3 : System.out.println("Perkalian");
                            System.out.print("Hasil perkalian dari :"+bil1+"*"+bil2+"=");
                            System.out.println(bil1*bil2);
  
                    break;  
  
                    case 4 : System.out.println("Pembagian");
                            System.out.print("Hasil pembagian dari :"+bil1+"/"+bil2+"=");
                            System.out.println(bil1/bil2);;  
  
                    break;  
  
                    case 5 : System.out.println("Anda memilih keluar");  
  
                             System.exit(0);  
  
                    break;  
  
                    default: System.out.println("Maaf pilihan anda tidak ada");  
  
                    break;  
  
                }  
                
                System.out.println("=======================");  
                  }
              }
  
    }  
  