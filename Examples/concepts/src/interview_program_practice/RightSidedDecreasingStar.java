package interview_program_practice;

public class RightSidedDecreasingStar {
    public static void main(String[] args){
        int i,j, row=5;
        for (i=1; i <= row; i++){
            for(j=1; j<=i; j++){
                System.out.print("  ");
            }
            for (j=i; j<=row; j++){
                System.out.print("* ");
            }




            System.out.println("");
        }
    }
}
