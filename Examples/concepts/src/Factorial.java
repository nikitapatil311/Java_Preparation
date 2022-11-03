import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num=sc.nextInt();
        int factorial_number=1;
        for(int i=1;i<=num;i++){
            factorial_number = factorial_number*i;
            //System.out.println(factorial_number);
        }
        System.out.println("Factorial of the number is - "+factorial_number);
    }
}
