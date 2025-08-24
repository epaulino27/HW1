package One_a;

public class Test{
    //test everything then call from Main
    public static void main(String[] args) {
        //Test MenuItem
        System.out.println("MenuItem Test");
        System.out.println();
        System.out.println("Original: ");
        MenuItem red = new MenuItem("Strawberries", 2.50, "Breakfast(In Season Fruit)"); //make object
        red.displayItemInfo(); //display
        System.out.println("Original using getters: ");
        System.out.println(red.GetName()); //getters
        System.out.println(red.GetPrice());
        System.out.println(red.GetCategory());
        red.SetName("Raspberries"); //setters
        red.SetPrice(3.50);
        red.SetCategory("Breakfast(Out of Season Fruit)");
        System.out.println();
        System.out.println("Updated using setters: ");
        red.displayItemInfo();

        //Order Test
        System.out.println();
        System.out.println("Order Test");
        System.out.println();
        Order order1 = new Order(); //make Order object
        MenuItem plain = new MenuItem("Plain Lettuce", 8.00, "Salad"); //more Menu objects to add variety to tests
        MenuItem caesar = new MenuItem("Caesar Salad", 10.00, "Salad");
        MenuItem garden = new MenuItem("Garden Salad", 9.00, "Salad");
        order1.addItem1(plain);
        order1.addItem2(caesar);
        order1.addItem3(garden);
        order1.displayOrderDetails();
        order1.addItem1(red);
        System.out.println();
        order1.displayOrderDetails();

        //Cafe Test
        System.out.println();
        System.out.println("Cafe Test");
        System.out.println();
        Cafe cafe1 = new Cafe(); //make Cafe object
        MenuItem coffee = new MenuItem("Plain Coffee", 5.00, "Beverages"); //more Menu objects to add variety to tests
        MenuItem iced = new MenuItem("Iced Coffee", 6.00, "Beverages");
        MenuItem hot = new MenuItem("Hot Chocolate", 4.00, "Beverages");
        cafe1.addMenuItem1(coffee);
        cafe1.addMenuItem2(iced);
        cafe1.addMenuItem3(hot);
        cafe1.displayMenu();
        cafe1.addMenuItem1(red);
        System.out.println();
        cafe1.displayMenu();
    }
}
