import java.util.Scanner;
import java.util.ArrayList;

public class MenuTest
{ public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your fav pizza");
    String input_pizza = sc.nextLine();

    String[] pizzaoptions = {"1. onion Pizza -- 250/-", "2. Cheese Pizza -- 300/-", "3. veg pizza -- 400/-", "4. paneer Pizza -- 500/-"};
    System.out.println("select one from list");
    for(int i=0;i<=pizzaoptions.length-1;i++)
    {

        System.out.println(pizzaoptions[i]);
    }

}
}
