package interview_program_practice;

//6)FIBONACCI SERIES 0,1,1,2,3,5,8

public class FibonacciSeries {
    public static void main(String[] args){
        int fib1 = 0, fib2=1;
        int fib3, num = 20;

        for(int i=0; i<=num; i++){
            System.out.println(fib1);

            fib3 = fib1+fib2;
            fib1 = fib2;
            fib2 = fib3;

        }
        //System.out.println(fib3);


    }
}
