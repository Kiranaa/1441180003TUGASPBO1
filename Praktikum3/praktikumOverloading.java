// Example to illustrate Method Overloading
public class praktikumOverloading {
   public static int average(int n1, int n2) {          // A
      return (n1+n2)/2;
   }
 
   public static double average(double n1, double n2) { // B
      return (n1+n2)/2;
   }
 
   public static int average(int n1, int n2, int n3) {  // C
      return (n1+n2+n3)/3;
   }

   public static int average(int n1, int n2, int n3, int n4) {  // C
      return (n1+n2+n3+n4)/4;
   }

   public static void main(String[] args) {
      System.out.println(average(1, 3));     // Use A
      System.out.println(average(1.0, 3.0)); // Use B
      System.out.println(average(1, 3, 2));  // Use C
      System.out.println(average(1.0, 3));   // Use B - int 2 implicitly casted to double 2.0
      // average(1, 2, 3, 4); // Compilation Error - No matching method
      System.out.println(average(1, 2, 3, 4));
   }
}