

class Person {
 String name;
 int age;
Person(String name, int age){
    this.name=name;
    this.age=age;
}
void displayInfo()
{
    System.out.println("Name:"+name);
    System.out.println("Age:"+age);
}
  
    
}
class Student extends Person{
    int studentId;
    Student(String name,int age,int studentId)
    {
        super(name,age);
        this.studentId=studentId;
    }
    void displayInfo()
    {
       
        System.out.println("Student Id"+studentId);

    }
}



public class Mainn {
    public static void main(String[] args) {
        Student s = new Student("Rohan",20,101);
        s.displayInfo();
    }
}
