
         //cal class - parent class (add(), sub(), mul(), div())
         // sci_cal - child class (fact())
   import java.util.Scanner;
class Cal{
    public void add_cal(int n1, int n2){
        int add_result = n1+n2;
        System.out.println(add_result);

    }

    public void sub_cal(int n1,int n2){
        int sub_result = n2-n1;
        System.out.println(sub_result);

    }

    public void mul_cal(int n1,int n2){
        int mul_result = n1*n2;
        System.out.println(mul_result);
    }
    public void div_cal(int n1, int n2){
        int div_result = n2/n1;
        System.out.println(div_result);
    }


}

class SCICal extends Cal{
    public void fact(int num){

        int fact_num = 1;
        for (int i = 1;i<=num;i++){
            fact_num = fact_num*i;

        }
        System.out.println(fact_num);


    }
}







public class TestInheritance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the factorial number");
        int num = sc.nextInt();
        SCICal sc1 = new SCICal();
        sc1.fact(num);
        sc1.add_cal(2,3);
        sc1.sub_cal(2,3);
        sc1.mul_cal(2,3);
        sc1.div_cal(2,3);
        //Cal c1 = new Cal();
        //c1.add_cal(2,3);



    }
}
