package lessons.OOPFundamentals.Entities;

public class ProductOverloading {
    public String name;
    public double price;
    public int quantity; // attributes

    // Default constructor
    public ProductOverloading() {}

    public ProductOverloading(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity; // 0 is default
    }

    // Constructor with the same name but different parameters -- Overloading
    public ProductOverloading(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return String.format(
                "\nName: %s\nPrice: $%.2f\nQuantity: %d\nTotal: $%.2f\n",
                name, price, quantity, totalValueInStock()
        );
    }
}
