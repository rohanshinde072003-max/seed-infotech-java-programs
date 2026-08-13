//polymorphism-method overloading done at compile time.In this same function name but differrent parameter baseed on parameter compiler choose automatically.
class Demo {

    void printInfo(String name)
    {
        System.out.println(name);
    }
    void printInfo(int age)
    {
        System.out.println(age);
    }
    void printInfo(String name, int age)
    {
         System.out.println(name+" "+ age);
    }

    
}

public class poylye {

 public static void main(String[] args) {
    Demo d1 = new Demo();
    int age =20;
    String name="Monika My darling";
    d1.printInfo(age);
    d1.printInfo(name,age);
 }


    
}
