package interview_program_practice;

public class SwappingNumbersWithoutVariables
{public static void main (String[] args)
{
    int a=2, b=3;
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println(a);
    System.out.println(b);
}
}
