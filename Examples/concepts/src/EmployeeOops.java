class EmployeeOops {
    String Emp_name;
    String designation;



    EmployeeOops(String Emp_name, String designation) {
        this.Emp_name = Emp_name;
        this.designation = designation;


    }


}
    class EmployeeCalculator
    {
        public static double employebonuscalaculator(EmployeeOops E1)
        {
            double salary = 100000;

            if (E1.designation == "manager")
            {
                double bonus = 0.15 * salary+ salary ;
                return bonus;

            }
            else if (E1.designation == "developer")
            {
                double bonus = 0.1 * salary +salary;
                return bonus;


            }
            else
            {
                return salary;

            }
        }
    }


