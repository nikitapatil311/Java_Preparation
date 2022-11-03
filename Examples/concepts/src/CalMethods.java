public class CalMethods
{ void add(int a, int b)
{
    int c = a+b;

    System.out.println(c);
}
void mul (int a, int b)
{
    int c = a*b;
    System.out.println(c);
}
void sub (int a, int b)
{
    int c = a-b;
    System.out.println(c);
}
void div (int a, int b)
{
    int c = a/b;
    System.out.println(c);
}
public static void main (String[] args)

{
    CalMethods c = new CalMethods();
    c.add (2,3);
    c.sub (4,2);
    c.mul (2,3);
    c.div (10,2);

}
}
