//student grade calculator not for just one student object but for array of student object

class Student4 {
    int Student_id;
    String Student_name;
    int marks;

    public int getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(int student_id) {
        Student_id = student_id;
    }

    public String getStudent_name() {
        return Student_name;
    }

    public void setStudent_name(String student_name) {
        Student_name = student_name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Student4(int student_id, String student_name, int marks) {
        Student_id = student_id;
        Student_name = student_name;
        this.marks = marks;
    }

}

class StudentGradeCalUtil2 {


    public void grade(Student4[] std_obj) {
        for (int i = 0; i < std_obj.length; i++) {

            if (std_obj[i].getMarks() >= 90 && std_obj[i].getMarks()<=100) {
                System.out.println("Grade A");

            } else if (std_obj[i].getMarks() >= 80 && std_obj[i].getMarks() <= 90) {
                System.out.println("Grade B");

            } else if (std_obj[i].getMarks() >= 70 && std_obj[i].getMarks() <= 80) {
                System.out.println("Grade C");

            } else {
                System.out.println("Fail");
            }
        }
    }
}


public class StudentGradeArrayTest {
    public static void main(String[] args) {
        //Student4 s1 = new Student4(2, "jjj", 77);
       // Student4 s2 = new Student4(4, "Abc", 80);








        Student4[] std_obj = new Student4[2];
        std_obj[0] = new Student4(2, "jjj", 77);
        std_obj[1] = new Student4(3, "ABC", 90);

        StudentGradeCalUtil2 util2 = new StudentGradeCalUtil2();
        util2.grade(std_obj);






    }
}
