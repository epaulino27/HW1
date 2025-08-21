package One_a;

public class Cafe {
    //attributes
    MenuItem menuItem1;
    MenuItem menuItem2;
    MenuItem menuItem3;
    Order currentOrder;

    public void addMenuItem1(MenuItem item){
        this.menuItem1 = item;
    }
    public void addMenuItem2(MenuItem item){
        this.menuItem2 = item;
    }
    public void addMenuItem3(MenuItem item){
        this.menuItem3 = item;
    }

    public double placeOrder(Order order){
        this.currentOrder = order;
        return currentOrder.calculateTotal();
    }

    public void displayMenu(){
        menuItem1.displayItemInfo();
        menuItem2.displayItemInfo();
        menuItem3.displayItemInfo();
    }



    /*Define a One_a.Cafe class with the following attributes:
        One_a.MenuItem menuItem1, menuItem2, menuItem3 (three One_a.MenuItem objects representing the available menu items)
        One_a.Order currentOrder (an One_a.Order object representing the current order being placed)
    Add methods to the One_a.Cafe class:
        addMenuItem1(One_a.MenuItem item): Adds a One_a.MenuItem to the first slot of the café's menu.
        addMenuItem2(One_a.MenuItem item): Adds a One_a.MenuItem to the second slot of the café's menu.
        addMenuItem3(One_a.MenuItem item): Adds a One_a.MenuItem to the third slot of the café's menu.
        placeOrder(One_a.Order order): Sets the currentOrder to the given order and calculates the total.
    Create a method called displayMenu that prints out all available items in the café’s menu.
    */
}
