//1. wap to create person,employee and student classes with thier respective properties as seen in real world.
//person --> super class (name, id, address, city)
//employee --> subclass
//student --> subclass
import java.util.Scanner;
class Person1{
    private String name;
    private int id;
     String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Person1(String name, int id, String city) {
        this.name = name;
        this.id = id;
        this.city = city;
    }

}

class Employee2 extends Person1{


    public Employee2(String name, int id, String city) {
        super(name, id, city);
    }

    public void sal(int salary){
        int annual_sal = salary*12;
       System.out.println(annual_sal);
    }

}

class Student extends Person1{

    public Student(String name, int id, String city) {
        super(name, id, city);
    }

    public void stu_grade(int marks){
        if (marks >= 90 && marks <=100){
            System.out.println("Grade A");

        } else if (marks >= 80 && marks <= 90) {
            System.out.println("Grade B");
        } else if (marks >= 70 && marks <=80) {
            System.out.println("Grade c");

        }
        else{
            System.out.println("fail");
        }
    }


}





public class HumanTest {
    public static void main(String[] args){
      Student s1 = new Student("Tina", 22, "Bangalore");
      System.out.println(s1.getName() +""+s1.getId()+""+s1.getCity());
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter the marks of student");
      int stu_marks = sc.nextInt();
      s1.stu_grade(stu_marks);
        Employee2 e1 = new Employee2("Raj", 2002, "Agra");
      System.out.println(e1.getName() +""+e1.getId()+""+e1.getCity());
      Scanner sc1 = new Scanner(System.in);
        System.out.println("Please enter the Employee salary");
      int emp_sal = sc1.nextInt();
      e1.sal(emp_sal);


    }
}
