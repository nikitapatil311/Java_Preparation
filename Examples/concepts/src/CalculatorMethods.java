public class CalculatorMethods

{
    static void add()
{
    int a=10, b=20;
    int res = a+b;
    System.out.println(res);

}
static void sub()
{
    int a=20, b=10;
    int c = a-b;
    System.out.println(c);

}
static void mul()
{
    int a=2, b=3;
    int mul_res= a*b;
    System.out.println(mul_res);


}
static void div()
{
    int a=30, b=10;
    int result = a/b;
    System.out.println(result);

}
public static void main(String[] args)
{
    add();
    sub();
    mul();
    div();
}
}
