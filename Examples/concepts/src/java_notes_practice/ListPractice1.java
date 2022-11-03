package java_notes_practice;
import java.util.ArrayList;

public class ListPractice1 {
    public static void main(String[] args){
        ArrayList l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        System.out.println(l1);

        ArrayList l2 = new ArrayList();
        l2.add(30);
        System.out.println(l2);
        l2.add("hello");
        l2.add(1,"hi");
        System.out.println(l1+" "+l2);
    }
}
