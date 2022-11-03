//10,30,20,40 - 10, 20, 30 ,40
import java.util.Arrays;
import java.util.Collections;
public class SortingArrayNum {
    public static void main(String[] args) {

        int[] arr = {10, 30, 20, 40};

        for(int i = 0; i<arr.length ; i++) {
            System.out.print(  arr[i]+", ");
        }

            for(int j=0; j<arr.length-1 ; j++) {


                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;


                }

            }
            System.out.println(" ");

            System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2] + ", " + arr[3]);







       //System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2] + ", " + arr[3]);

        /*Arrays.sort(arr);
        System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2] + ", " + arr[3]);*/


    }
}
