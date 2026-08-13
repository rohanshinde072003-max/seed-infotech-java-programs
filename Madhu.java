import java.util.Scanner;

class InnerMadhu {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Madhu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InnerMadhu b1 = new InnerMadhu();

        System.out.println("Enter two or three integers (separated by space):");

        // Check if the first two numbers exist
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            if (sc.hasNextInt()) {
                int b = sc.nextInt();
                
                // Check if there is a third number
                if (sc.hasNextInt()) {
                    int c = sc.nextInt();
                    int sum = b1.add(a, b, c);
                    System.out.println("Sum of three numbers: " + sum);
                } else {
                    int sum = b1.add(a, b);
                    System.out.println("Sum of two numbers: " + sum);
                }
            } else {
                System.out.println("You need to enter at least two numbers.");
            }
        } else {
            System.out.println("Invalid input! Please enter integers only.");
        }

        sc.close();
    }
}
