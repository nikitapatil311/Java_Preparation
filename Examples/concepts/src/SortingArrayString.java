import java.lang.String;

public class SortingArrayString {
    public static void main(String[] args){
        String s1[] = {"James", "is", "name",  "my"};
        String[] s2 = new String[5];




        for(int i = 0; i<= s1.length-1 ; i++){
            for(int j=0; j< s1.length-1; j++){

                if(s1[j].compareTo(s1[j+1]) < 0){

                    String temp = s1[j];
                    s1[j] = s1[j+1];
                    s1[j+1] = temp;

                    s2[4-i] = s1[i];
                    System.out.println(s1[0]+" "+s1[1]+" "+s1[2]+" "+s1[3]+" ");



                }

            }

        }

        //System.out.println(s1[0]+" "+s1[1]+" "+s1[2]+" "+s1[3]+" "+s1[4]);
        //String[] s2 = new String[5];

        for(int i=0; i<s2.length ; i++){
            System.out.println(s2[i]);
        }



       //s2[]



        //for(int i =0; i<s2.length; i++){

          //  System.out.println(s2[i]+" ");
        //}
    }
}
