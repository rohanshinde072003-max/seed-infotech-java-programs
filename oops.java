
class Pen{
    String color;//instance variable 
    String type;

    public void write()
    {
        System.out.println("Writing something");
    }
    void printColor()
    {
        System.out.println(this.color);
    }
    void printType()
    {
        System.out.println(this.type);
    }
}
class Student{
    String name;
    int age;
    void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student()
    {
        System.out.println("Default constructor is called or non parametrized");
    }
}

public class oops {

    public static void main(String []args)
    {
        Pen pen1=new Pen();
        pen1.color="Blue";
        pen1.type="Gel";
        pen1.write();
        pen1.printColor();
        pen1.printType();
        Pen pen2=new Pen();
        pen2.color="Pink";
        pen2.type="ballpen";
        pen2.write();
        pen2.printColor();
        pen2.printType();
        Student s1=new Student();
        s1.name="Shri";
        s1.age=21;
        s1.printInfo();

    }
}