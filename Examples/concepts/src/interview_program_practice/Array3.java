package interview_program_practice;

//Int arr[] = {7,6,5,8,10}
//o/p - 25 , 36 , 49
//Explanation - square the number and print first 3 ascending squared number

public class Array3 {
    public static void main(String[] args) {

        int arr[] = {7, 6, 5, 8, 10};

        for (int i = 0; i < arr.length - 1; i++) {
            // arr[i] = arr[i]*arr[i];

            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                // arr[i] = arr[i]*arr[i];
            }
            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // arr[i] = arr[i]*arr[i];
                }
                //arr[i] = arr[i]*arr[i];
            }
            // arr[i] = arr[i]*arr[i];



        }
       // System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
        for (int i = 0; i < arr.length - 1; i++){
            arr[i] = arr[i]*arr[i];
            //System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
        }
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
    }
}
