package One_a;

public class MenuItem {
    //attribute creation
    String name;
    double price;
    String category;

    //constructor
    //used "this." so that the variable can be stored in the original attribute not a copy
    MenuItem(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
        return;
    }

    //setters
    //for individual attribute rewrites
    public void SetName(String name) {
        this.name = name;
        return;
    }

    public void SetPrice(double price) {
        this.price = price;
        return;
    }

    public void SetCategory(String category) {
        this.category = category;
        return;
    }

    //getters
    String GetName() {
        return name;
    }

    double GetPrice() {
        return price;
    }

    String GetCategory() {
        return category;
    }

    //way to display instances of this class
    void displayItemInfo() {
        System.out.println(category + ", " + name + "..............." + price);
        return;
    }
}
