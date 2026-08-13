// Example copy constructor
class Demo {
    String Name;
    int Roll_no;
    String dept;

    // Copy constructor
    Demo(Demo d2) {
        this.Name  = d2.Name;
        this.Roll_no = d2.Roll_no;
        this.dept = d2.dept;
    }

    // Default constructor
    Demo() {}

    void printInfo() {
        System.out.println("Name: " + this.Name);
        System.out.println("Roll No: " + this.Roll_no);
        System.out.println("Department: " + this.dept);
        System.out.println();
    }
}

public class bewafa {
    public static void main(String[] args) {
        // Creating first object
        Demo d1 = new Demo();
        d1.Name = "Rohan";
        d1.Roll_no = 149;
        d1.dept = "MCA";
        d1.printInfo();

        // Creating second object using copy constructor
        Demo d2 = new Demo(d1);
        d2.printInfo();
    }
}
