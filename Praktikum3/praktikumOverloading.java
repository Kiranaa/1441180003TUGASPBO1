// Example to illustrate Method Overloading
public class praktikumOverloading {
   public static int average(int n1, int n2) {         
      return (n1+n2)/2;
   }
 
   public static double average(double n1, double n2) { 
      return (n1+n2)/2;
   }
 
   public static int average(int n1, int n2, int n3) {  
      return (n1+n2+n3)/3;
   }

   public static int average(int n1, int n2, int n3, int n4) {  
      return (n1+n2+n3+n4)/4;
   }

   public static void main(String[] args) {
      System.out.println(average(1, 3));     
      System.out.println(average(1.0, 3.0)); 
      System.out.println(average(1, 3, 2)); 
      System.out.println(average(1.0, 3));   
      System.out.println(average(1, 2, 3, 4));
   }
}