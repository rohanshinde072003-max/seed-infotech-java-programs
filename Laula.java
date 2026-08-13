//method overloading
import java.util.Scanner;

class Demo {
   void tanuja(String dj) {
      System.out.println(dj);
   }
   
   void tanuja(int kiti) {
       System.out.println(kiti);
   }
}

public class Laula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Demo b1 = new Demo();
        
        System.out.println("Enter an integer:");
        int kiti = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline
        
        System.out.println("Enter a string:");
        String Dj = sc.nextLine();
        
        b1.tanuja(kiti); // Print integer first
        b1.tanuja(Dj);   // Print string next
        
        sc.close();
    }
}
