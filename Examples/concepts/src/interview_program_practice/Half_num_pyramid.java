package interview_program_practice;

public class Half_num_pyramid {
    public static void main(String[] args){
        int i, j, row=4;
        for(i=1; i<=row; i++){
            for(j=1;j<=i; j++){
                System.out.print(i+j+" " );
            }
            System.out.println("  ");
        }
    }
}
