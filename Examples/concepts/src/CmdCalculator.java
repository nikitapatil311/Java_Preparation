import java.util.Scanner;


class Calculator1 {
    private int num1, num2;

    Calculator1(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void add() {
        int add_result = this.num1 + this.num2;
        System.out.println(add_result);
    }

    public void subtract() {
        int subtract_result = this.num1 - this.num2;
        System.out.println(subtract_result);
    }

    public void multiply() {
        int multiply_result = this.num1 * this.num2;
        System.out.println(multiply_result);
    }

    public void divide() {
        int divide_result = this.num1 / this.num2;
        System.out.println(divide_result);
    }

}


public class CmdCalculator {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number");
        System.out.println("Enter second number");


        int integer1 = sc.nextInt();
        int integer2 = sc.nextInt();


        Calculator1 c1 = new Calculator1(integer1, integer2);
        c1.add();
        c1.subtract();
        c1.divide();
        c1.multiply();

    }


}
