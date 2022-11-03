package interview_program_practice;

public class MedianArray {
    public static void main(String[] args) {
        int arr[] = {5, 3, 1, 2, 4};

            for (int i = 0; i < arr.length ; i++) {
                for(int j=i+1; j<arr.length; j++) {

                if (arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;


                }
               // System.out.println(arr[i]);
            }


        }
            for(int i=0; i<arr.length; i++){
                System.out.println(arr[i]);
            }
        }
    }


