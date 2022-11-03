import java.util.Scanner;

class Pizza{
    //size, type of pizza, price
    private String size;
    private double price;
    private String pizza_type;

    public Pizza(String size, double price, String pizza_type) {
        this.size = size;
        this.price = price;
        this.pizza_type = pizza_type;
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPizza_type() {
        return pizza_type;
    }

    public void setPizza_type(String pizza_type) {
        this.pizza_type = pizza_type;
    }



}

/*class Bill{
    public double bill(Pizza p1){
    double total;
    int quantity=1;
    total = quantity* p1.getPrice();
    return total;
}
}*/

class Pizzamenu{
    public void menu(){
        System.out.println("\t\t\t\t==============================\t\t\t\t");
        System.out.println("\t\t\t\t 1. Tomato Pizza            Rs.200/-   \t\t\t\t");
        System.out.println("\t\t\t\t 2. Cheese Pizza            Rs.300/-    \t\t\t\t");
        System.out.println("\t\t\t\t 3. Veg Loaded Pizza         Rs.500/-   \t\t\t\t");
        System.out.println("\t\t\t\t 4. Corn Pizza               Rs.200/-   \t\t\t\t");
        System.out.println("\t\t\t\t 5. Cancel                              \t\t\t\t");
        System.out.println("\t\t\t\t==============================\t\t\t\t");

    }
}


public class OrderingSystem {
    public static void main(String[] args){
        String y=null, n=null;

        Pizza p1 = new Pizza("small", 300, "cheese");

        //System.out.println("Pizza size is - "+p1.getSize()+", Pizza price is -, "+p1.getPrice()+",Pizza type is - "+p1.getPizza_type());
        Pizzamenu pm = new Pizzamenu();
        pm.menu();
        Scanner user_input = new Scanner(System.in);
        System.out.println("Press 1 for Tomato Pizza press 2 for Cheese Pizza press 3 for Veg Loaded Pizza press 4 for Corn Pizza press 5 to exit");
        int menu_input = user_input.nextInt();
        //String enter = user_input.next();

        if(menu_input == 1){
            System.out.println("Tomato Pizza is selected");
            System.out.println("Enter the quantity of Tomato Pizza");
            int quantity = user_input.nextInt();
            double total  = quantity*p1.getPrice();
            System.out.println("the total Bill is"+total);
            System.out.println ("Do you want to select another Pizza from menu??");
            System.out.println("Press Y for Yes and N for No");
            String enter = user_input.next();
            if(enter.equalsIgnoreCase(y)) {
                pm.menu();
            }
            else{
                System.out.println("See you again");
            }



        } else if (menu_input == 2){
            System.out.println("Cheese Pizza is selected");
            System.out.println("Enter the quantity of Cheese Pizza");
            int quantity = user_input.nextInt();
            double total  = quantity*p1.getPrice();
            System.out.println("the total Bill is"+total);
            System.out.println ("Do you want to select another Pizza from menu??");
            System.out.println("Press Y for Yes and N for No");
            String enter = user_input.next();
            if(enter.equalsIgnoreCase(y)) {
                pm.menu();
            }
            else{
                System.out.println("See you again");
            }


        } else if (menu_input == 3) {
            System.out.println("Veg Loaded Pizza is selected");
            System.out.println("Enter the quantity of Tomato Pizza");
            int quantity = user_input.nextInt();
            double total  = quantity*p1.getPrice();
            System.out.println("the total Bill is"+total);
            System.out.println ("Do you want to select another Pizza from menu??");
            System.out.println("Press Y for Yes and N for No");
            String enter = user_input.next();
            if(enter.equalsIgnoreCase(y)) {
                pm.menu();
            }
            else{
                System.out.println("See you again");
            }




        } else if (menu_input == 4) {
            System.out.println("Corn Pizza is selected");
            System.out.println("Enter the quantity of Corn Pizza");
            int quantity = user_input.nextInt();
            double total  = quantity*p1.getPrice();
            System.out.println("the total Bill is"+total);
            System.out.println ("Do you want to select another Pizza from menu??");
            System.out.println("Press Y for Yes and N for No");
            String enter = user_input.next();
            if(enter.equalsIgnoreCase(y)) {
                pm.menu();
            }
            else{
                System.out.println("See you again");
            }

        } else{
            System.exit(0);
        }



       /* Bill b1 = new Bill();
        System.out.println("Total bill is - "+b1.bill(p1));*/


    }
}
