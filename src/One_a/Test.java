package One_a;
import java.util.Scanner;

public class Test{
    //test everything then call from Main
    public static void main(String[] args) {
        //Test MenuItem
        System.out.println("MenuItem Test");
        System.out.println();
        //set up
        System.out.println("Original");
        MenuItem red = new MenuItem("Strawberries", 2.50, "Breakfast(In Season Fruit)");
        red.displayItemInfo();
        //getters test
        System.out.println("Original using getters: ");
        System.out.println(red.GetName());
        System.out.println(red.GetPrice());
        System.out.println(red.GetCategory());
        red.SetName("Raspberries");
        //setters test
        red.SetPrice(3.50);
        red.SetCategory("Breakfast(Out of Season Fruit)");
        System.out.println("Updated using setters: ");
        red.displayItemInfo();

        //Order Test
        System.out.println();
        System.out.println("Order Test");
        System.out.println();
        //set up
        Order order1 = new Order();
        MenuItem caesar = new MenuItem("Caesar Salad", 10.00, "Salad");
        MenuItem hot = new MenuItem("Hot Chocolate", 4.00, "Beverages");
        //setters test
        order1.addItem1(red);
        order1.addItem2(caesar);
        order1.addItem3(hot);
        //getters test
        System.out.println("With getters: ");
        order1.GetItem1();
        order1.GetItem2();
        order1.GetItem3();
        //display test
        System.out.println("With display method: ");
        order1.displayOrderDetails();

        //Cafe Test
        System.out.println();
        System.out.println("Cafe Test");
        System.out.println();
        //set up
        Cafe cafe1 = new Cafe();
        //setters test
        cafe1.addMenuItem1(red);
        cafe1.addMenuItem2(caesar);
        cafe1.addMenuItem3(hot);
        //getters test
        System.out.println("With getters: ");
        cafe1.GetMenuItem1();
        cafe1.GetMenuItem2();
        cafe1.GetMenuItem3();
        //display test
        System.out.println("With display method: ");
        cafe1.displayMenu();

        //User Input + test
        System.out.println();
        System.out.println("Input via Order Test");
        System.out.println();
        //display choices
        cafe1.displayMenu();
        //set up to get input
        int counter = 1;
        Scanner sc = new Scanner(System.in);
        while(counter < 4) {
            //get order
            System.out.println("What would you like to order as your #" + counter + " item? Please give the menu number.");
            int input = sc.nextInt();

            //put in order
            String order_num = counter + "_" + input;
            switch(order_num){
                case "1_1":
                    order1.addItem1(cafe1.menuItem1);
                    break;
                case "1_2":
                    order1.addItem1(cafe1.menuItem2);
                    break;
                case "1_3":
                    order1.addItem1(cafe1.menuItem3);
                    break;
                case "2_1":
                    order1.addItem2(cafe1.menuItem1);
                    break;
                case "2_2":
                    order1.addItem2(cafe1.menuItem2);
                    break;
                case "2_3":
                    order1.addItem2(cafe1.menuItem3);
                    break;
                case "3_1":
                    order1.addItem3(cafe1.menuItem1);
                    break;
                case "3_2":
                    order1.addItem3(cafe1.menuItem2);
                    break;
                case "3_3":
                    order1.addItem3(cafe1.menuItem3);
                    break;
                default:
                    System.out.println("I'm sorry I don't recognize that order.");
                    counter -= 1;
                    break;
            }
            counter += 1;
        }
        //display order
        System.out.println("Thank you for your order! The details are down below.");
        cafe1.placeOrder(order1);
        order1.displayOrderDetails();
    }
}
