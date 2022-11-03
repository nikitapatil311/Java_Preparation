import java.util.Scanner;


class PizzaOrder{
    public static Scanner input_scanner = new Scanner(System.in);
    public static int quantity=1;
    public static String repeat;
    public static double pay, total=0;

    public static void menu(){
        System.out.println("\t\t\t\t\t\t\t\t+================================+");
        System.out.println("\t\t\t\t\t\t\t\t1. onion Pizza               Rs.200/-");
        System.out.println("\t\t\t\t\t\t\t\t2. corn Pizza                Rs.300/-");
        System.out.println("\t\t\t\t\t\t\t\t3. cheese Pizza              Rs.400/-");
        System.out.println("\t\t\t\t\t\t\t\t4. veg Pizza                 Rs.500/-");
        System.out.println("\t\t\t\t\t\t\t\t5. Cancel                            ");
        System.out.println("\t\t\t\t\t\t\t\t+================================+");
    }
    public static void order(){
        System.out.println("press 1 to onion Pizza, press 2 to corn Pizza, press 3 to cheese pizza, press 4 to veg pizza, press 5 to cancel");
        System.out.println("Please select what you want to buy??");
        int entered_num = input_scanner.nextInt();

        if(entered_num == 1){
            System.out.println("Onion Pizza is selected");
            System.out.println("please enter the quantity of Onion Pizza");
            quantity = input_scanner.nextInt();
            total = total+(quantity*200);


            System.out.println("do you want to select another pizza from the menu??");
            System.out.println("Select y for yes and Select N for no");
            repeat = input_scanner.next();
            if(repeat.equalsIgnoreCase("y")){
                order();
            }else{
                System.out.println("Enter the payment");
                pay = input_scanner.nextDouble();
                if(pay <= total){
                    System.out.println("not enough payment");
                }else{
                    System.out.println("The total price is"+total);
                total = pay-total;
                System.out.println("Please collect your remaining amount "+ total);
                }

            }


        } else if (entered_num == 2) {
            System.out.println("Corn Pizza is selected");
            System.out.println("please enter the quantity of Corn Pizza");
            quantity = input_scanner.nextInt();
            total = total+(quantity*300);


            System.out.println("do you want to select another pizza from the menu??");
            System.out.println("Select y for yes and Select N for no");
            repeat = input_scanner.next();
            if(repeat.equalsIgnoreCase("y")){
                order();
            }else{
                System.out.println("Enter the payment");
                pay = input_scanner.nextDouble();
                if(pay <= total){
                    System.out.println("not enough payment");
                }else{ System.out.println("The total price is"+total);
                    total = pay-total;
                    System.out.println("Please collect your remaining amount "+ total);
                }

            }

        } else if (entered_num == 3) {
            System.out.println("Cheese Pizza is selected");
            System.out.println("please enter the quantity of Cheese Pizza");
            quantity = input_scanner.nextInt();
            total = total+(quantity*400);


            System.out.println("do you want to select another pizza from the menu??");
            System.out.println("Select y for yes and Select N for no");
            repeat = input_scanner.next();
            if(repeat.equalsIgnoreCase("y")){
                order();
            }else{
                System.out.println("Enter the payment");
                pay = input_scanner.nextDouble();
                if(pay <= total){
                    System.out.println("not enough payment");
                }else{
                    System.out.println("The total price is"+total);
                    total = pay-total;
                    System.out.println("Please collect your remaining amount "+ total);
                }

            }

        } else if (entered_num == 4) {

            System.out.println("veg Pizza is selected");
            System.out.println("please enter the quantity of veg Pizza");
            quantity = input_scanner.nextInt();
            total = total+(quantity*500);


            System.out.println("do you want to select another pizza from the menu??");
            System.out.println("Select y for yes and Select N for no");
            repeat = input_scanner.next();
            if(repeat.equalsIgnoreCase("y")){
                order();
            }else{
                System.out.println("Enter the payment");
                pay = input_scanner.nextDouble();
                if(pay <= total){
                    System.out.println("not enough payment");
                }else{
                    System.out.println("The total price is"+total);
                    total = pay-total;
                    System.out.println("Please collect your remaining amount "+ total);
                }

            }

        } else if (entered_num == 5) {
            System.exit(0);

        }else {
            System.out.println("Please choose options from 1 to 5 only!!");
            order();
        }

    }
    public static void main(String[] args){
        menu();
        order();

    }




}







