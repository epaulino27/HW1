package One_a;

public class Cafe {
    //attributes
    MenuItem menuItem1;
    MenuItem menuItem2;
    MenuItem menuItem3;
    Order currentOrder;

    //setters
    public void addMenuItem1(MenuItem item){
        this.menuItem1 = item;
    }
    public void addMenuItem2(MenuItem item){
        this.menuItem2 = item;
    }
    public void addMenuItem3(MenuItem item){
        this.menuItem3 = item;
    }

    //getters
    public void GetMenuItem1(){
        menuItem1.displayItemInfo();
    }
    public void GetMenuItem2(){
        menuItem2.displayItemInfo();
    }
    public void GetMenuItem3(){
        menuItem3.displayItemInfo();
    }

    //get order and order balance
    public double placeOrder(Order order){
        this.currentOrder = order;
        return currentOrder.calculateTotal();
    }

    //display cafe menu
    public void displayMenu(){
        System.out.println("Cafe Menu");
        menuItem1.displayItemInfo();
        menuItem2.displayItemInfo();
        menuItem3.displayItemInfo();
    }
}
