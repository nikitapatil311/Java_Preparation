
//1.I/P- int[ ]arr={1,5,8,9,6};
//O/P- 9,6

package interview_program_practice;

public class Array1 {
    public static void main(String[] args){
        int[] arr1 = {1,5,8,9,6};

        for (int i=0; i< arr1.length; i++){
            if (arr1[i]%3 == 0){
                System.out.print(arr1[i]+", ");
            }else {
               // System.out.println(" ");
            }
        }

        }
    }

