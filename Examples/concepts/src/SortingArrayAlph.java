import java.util.Arrays;
import java.util.Collections;


public class SortingArrayAlph {
    public static void main(String[] args) {
        char c1[] = {'d', 'a', 'c', 'b'};


        for (int i = 0; i < c1.length; i++) {
            System.out.print(c1[i] + ", ");
            //System.out.println(" ");


            for (int j = 0; j < c1.length - 1; j++) {


                if (c1[j] > c1[j + 1]) {

                    char temp = c1[j];
                    c1[j] = c1[j + 1];

                    c1[j + 1] = temp;


                }
            }

        }
        System.out.println(" ");
        for (int i = 0; i < c1.length; i++) {
            System.out.print(c1[i] + ", ");
        }
    }
    }

