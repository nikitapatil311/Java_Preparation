import java.util.Random;

public class ArrayTest {
    public static void main(String[] args){
        String[] s1 = {"Niki", "Tina", "Bin", "Basket"};
        int x = s1.length;
        System.out.println(x);
        Random randomGenerator = new Random();
        int x1 = randomGenerator.nextInt(5);
        System.out.println(x);


    }
}
