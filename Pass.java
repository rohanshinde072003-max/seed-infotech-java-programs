
class one {
    void show()
    {
        System.out.println("This is parent class 1");
    }
}
class two extends one{
    void displayInfo()
    {
        System.out.println("This  is child class derived from parent class one");
    }
}
class three extends two{
    void display()
    {
        System.out.println("This child class ");
    }
}


public class Pass {
    public static void main(String[] args) {
        three t=new three();
        t.show();
        t.displayInfo();
        t.display();
    }
    
}
