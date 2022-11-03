

package interview_program_practice;
import java.util.Arrays;

public class MinMaxArray6 {
    public static void main(String[] args){
        int arr[]={1,3,5,7,9};
        int min = arr[0];
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] <  min){
                min = arr[i];

            }
            if(arr[i] > max){
                max = arr[i];
            }

        }

        System.out.println(min);

    }
}
