package interview_program_practice;

public class NumberOfDigitsInNumber {
    public static void main(String[] args){
        int num = 1234589076;
        int lastdigit;
        int count = 0;


        while(num !=0){
            lastdigit = num%10;
            count ++;
            num= num/10;

        }
        System.out.println(count);
    }
}
