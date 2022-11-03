public class Employee1 {
    public static void main(String[] args) {
        EmployeeOops E1 = new EmployeeOops("Raju", "manager");
        EmployeeOops E2 = new EmployeeOops("tina","developer");

        EmployeeCalculator util = new EmployeeCalculator();
        System.out.println(E1.Emp_name+"salary and bonus is"+util.employebonuscalaculator(E1));
    }
}
