package interview_program_practice;

//StrongNumber is sum of factorial of each number example 145
//CHECK WHETHER NUMBER IS STRONG OR NOT?
class Strong {
    int fact =1;
    int lastdigit =0;

    public  void strongNumber(int num) {
        while (num != 0) {
            lastdigit =

            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println(fact);
        }
    }
}


public class TestStrongNumber {
    public static void main(String[] args){
        Strong s1 = new Strong();
        s1.strongNumber(12);


    }
}
