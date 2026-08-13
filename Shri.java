//Example of parametrized constructor
class Demo{
    String Name ;
    int Roll_no ;
    String dept;
    
    Demo(String Name, int Roll_no, String dept)
    {
      this.Name=Name;
      this.Roll_no=Roll_no;
      this.dept=dept;

    }
    void printInfo()
    {
        System.out.println(this.Name);
        System.out.println(this.Roll_no);
        System.out.println(this.dept);
        
    }

}



public class Shri {
    public static void main(String[] args) {
        Demo d1= new Demo("Rohan", 149,"MCA" );
        d1.printInfo();
    }
}
