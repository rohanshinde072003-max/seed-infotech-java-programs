//simple inheritance with method/function overriding 
class Vechicle{
    void start()
    {
        System.out.println("The vechicle is starting....");
    }

}
class Car extends Vechicle{
    @Override
    void start()
    {
        System.out.println("The car is starting with a key");
    }
}


public class Main {
    public static void main(String[] args) {
        Car c =new Car();
        c.start();
    }
}
