package java_notes_practice;

import java.util.ArrayList;

public class ArrayListMagnet {
    public static void main(String[] args){
        //public static void printList(ArrayList<String> list){
           // for(String element : list){
            ArrayList<String> a = new ArrayList<String>();
            a.add(0,"zero");
            a.add(1,"one");
            a.add(2,"two");
            a.add(3,"Three");
            printList(a);

            a.remove(2);

            if(a.contains("Three")){
                a.add("four");
            }
        printList(a);


    }

    public static void printList(ArrayList<String> a) {
    }
}
