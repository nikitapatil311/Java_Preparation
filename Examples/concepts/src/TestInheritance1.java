// cal1 - add(),sub(), mul(), div()
//SciCal1 - fact()

import java.util.Scanner;
class Cal1{
    int n1;
    int n2;

    public Cal1(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void add(int num1, int num2){
      int  add_res = n1+n2;
      System.out.println(add_res);
    }
    public void sub(int num1, int num2){
        int sub_res = n1-n2;
        System.out.println(sub_res);
    }
    public void mul(int num1, int num2){
        int mul_res = n1*n2;
        System.out.println(mul_res);
    }
    public void div(int num1, int num2){
        int div_res = n1/n2;
        System.out.println(div_res);
    }

}

class SciCal1 extends Cal1{
    int fact = 1;

    public SciCal1(int n1, int n2) {
        super(n1, n2);
    }

    public void fact(int fact_num){
        for (int i=1;i<=fact_num;i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}

public class TestInheritance1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1 and number 2 ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("enter the fact number");
        int fact_num = sc.nextInt();
        SciCal1 sc1 = new SciCal1(num1,num2);
        sc1.add(num1,num2);
        sc1.sub(num1,num2);
        sc1.mul(num1,num2);
        sc1.div(num1,num2);
        sc1.fact(fact_num);


    }
}
