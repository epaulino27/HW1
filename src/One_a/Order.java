package One_a;

public class Order {
    //attributes
    MenuItem item1;
    MenuItem item2;
    MenuItem item3;
    double totalAmount;

    //add order items, setters
    public void addItem1(MenuItem item){
        this.item1 = item;
        return;
    }
    public void addItem2(MenuItem item){
        this.item2 = item;
        return;
    }
    public void addItem3(MenuItem item){
        this.item3 = item;
        return;
    }

    //getters
    public void GetItem1(){
        item1.displayItemInfo();
    }
    public void GetItem2(){
        item2.displayItemInfo();
    }
    public void GetItem3(){
        item3.displayItemInfo();
    }

    //calculate order total
    public double calculateTotal(){
        return item1.price + item2.price + item3.price;
    }

    //display details to user
    public void displayOrderDetails(){
        System.out.println("Order Details: ");
        item1.displayItemInfo();
        item2.displayItemInfo();
        item3.displayItemInfo();
        System.out.println("Order Total: " + calculateTotal());
        return;
    }
}
