import java.util.*;
import java.util.Arrays;
//arr1 - {2,3,5,6,8} - size 5
// o/p -> arr2{2,6,8} - size 3

public class ForLoop1 {
    public static void main(String[] args) {

        int arr1[] = {2, 3, 5, 6, 8,7,10,12};
        int size = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                size++;


            }
        }
       // System.out.println(size);

        int arr2[] = new int[size];
        int e = 0;
        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] % 2 == 0) {

               // System.out.println(e);

                //System.out.println(arr1[i]);
                arr2[e++] = arr1[i];

            }


        }
        for(int i=0; i<arr2.length;i++){

        }
        System.out.println(arr2[0] + " " + arr2[1] + " " + arr2[2]+" "+arr2[3]+" "+arr2[4]);


    }
}

