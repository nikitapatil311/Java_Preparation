//I/P  int[]arr={1,2,3};
//O/P 1,8,27


package interview_program_practice;

public class Array2 {
    public static void main(String[] args){
        int[] arr1 = {1,2,3};
        for(int i=0; i<arr1.length; i++){

            arr1[i] = arr1[i]*arr1[i]*arr1[i];

        }
        System.out.println(arr1[0]+" "+arr1[1]+" "+arr1[2]);


    }
}
