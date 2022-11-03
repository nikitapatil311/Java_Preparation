package interview_program_practice;
// I/p: int[ ]={1,6,7,9,5}
//O/p: 2,12,14,18,10
//Explanation: double of the number
public class Array4 {
    public static void main(String[] args){

        int[] arr1 = {1,6,7,9,5};
        for (int i=0; i< arr1.length; i++){
            arr1[i] = arr1[i]*2;

        }
        for (int j=0; j< arr1.length; j++)
        System.out.println(arr1[j]);


    }
}
