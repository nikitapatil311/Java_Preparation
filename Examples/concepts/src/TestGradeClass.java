//1. Student grade calculator
//90-100 --> A
//80-90 --> B
//70-80 --> C
//otherwise
//95-100 --> A
//Praveen 113:36 PM
//90-95 --> B
//highschool grade student
//junior school grade
//Praveen 113:37 PM
//Student --> highschool student
//primary student

//student class - super class - id, name and marks
//primary_student - subclass - pri_grade
//Highschool_student - subclass - High_grade

class Student1{
    private int stu_id;
    private String name;
    private int marks;

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }



    public Student1(int stu_id, String name, int marks) {
        this.stu_id = stu_id;
        this.name = name;
        this.marks = marks;
    }


}
class PriStudent1 extends Student1{


    public PriStudent1(int stu_id, String name, int marks) {
        super(stu_id, name, marks);
    }

}
class HighSchoolStudent1 extends Student1{


    public HighSchoolStudent1(int stu_id, String name, int marks) {
        super(stu_id, name, marks);
    }


}

class GradeCalculator{
   public void gradeCalculator(Student1 std1, int marks) {

       if (std1 instanceof PriStudent1) {


           if (marks >= 90 && marks <= 100) {
               System.out.println("Grade A");
           } else if (marks >= 80 && marks <= 90) {
               System.out.println("Grade B");

           } else if (marks >= 70 && marks <= 80) {
               System.out.println("Grade C");
           } else {
               System.out.println("fail");
           }
       } else if (std1 instanceof HighSchoolStudent1) {


           if (marks >= 95 && marks <= 100) {
               System.out.println("Grade A");
           } else if (marks >= 90 && marks <= 95) {
               System.out.println("Grade B");
           } else if (marks >= 85 && marks <= 90) {
               System.out.println("Grade c");
           } else {
               System.out.println("Fail");
           }
       }
   }
       public void gradeCalculator(Student1 std1){

           if (std1.getMarks() >= 95 && std1.getMarks() <= 100) {
               System.out.println("Grade A");
           } else if (std1.getMarks() >= 90 && std1.getMarks() <= 95) {
               System.out.println("Grade B");
           } else if (std1.getMarks() >= 85 && std1.getMarks() <= 90) {
               System.out.println("Grade c");
           } else {
               System.out.println("Fail");
           }


       }










}
public class TestGradeClass {
    public static void main(String[] args){
        Student1 ps1 = new PriStudent1(22,"Tina", 55);
        Student1 hs1 = new HighSchoolStudent1(44,"Raju", 88);

        GradeCalculator gc1 = new GradeCalculator();
        gc1.gradeCalculator(ps1, 55);
        gc1.gradeCalculator(hs1, 99);
        gc1.gradeCalculator(hs1);


        //gc1.gradeCalculator(hs1.getMarks());

        /*PriStudent1 ps1 = new PriStudent1(21, "Raj", 55);
        HighSchoolStudent1 hs1 = new HighSchoolStudent1(44, "Ragini", 99);
       GradeCalculator gc1 = new GradeCalculator();
       gc1.gradeCalculator(34);
        System.out.println(ps1.getName()+" "+ps1.getMarks()+""+ hs1.getMarks()+" "+ hs1.getName());
       /* gc1.gradeCalculator(55,ps1);
        System.out.println(ps1.getName()+" "+"result = ");
        gc1.gradeCalculator(66, hs1);
        System.out.println(hs1.getName()+" "+"result = ");*/

    }
}
