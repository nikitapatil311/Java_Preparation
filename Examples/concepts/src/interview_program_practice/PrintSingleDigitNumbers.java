package interview_program_practice;

//1)PRINT SINGLE DIGIT NUMBERS

//USER DATA IS SINGLE DIGIT OR NOT?

import java.util.Scanner;

public class PrintSingleDigitNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the data");
        int num = sc.nextInt();
        if(num < 10){
          System.out.println(num+"- The data entered is Single Digit");
        }else{
            System.out.println(num+" - The data entered is not Single Digit");
        }
      //for(int i=0; i<10; i++){
        //    System.out.println(i);
        //}

    }
}
