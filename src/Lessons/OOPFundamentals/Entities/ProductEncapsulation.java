package Lessons.OOPFundamentals.Entities;

public class ProductEncapsulation {
    // Encapsulating attributes
    private String name;
    private double price;
    private int quantity; // attributes

    // Default constructor
    public ProductEncapsulation() {}

    // Custom constructor
    public ProductEncapsulation(String name, double price){
        this.name = name;
        this.price = price;
    }

    // Overloading
    public ProductEncapsulation(String name, double price, double quantity){
        this.name = name;
        this.price = price;
        this.quantity = (int) quantity;
    }

    // Setter - does not return anything -- it only performs update
    public void setName(String name){
        this.name = name;
    }

    // Getter - the return type must be the same type of the attribute
    public String getName(){
        return name;
    }

    // Setting the price
    public void setPrice(double price){
        this.price = price;
    }

    // Getting the price
    public double getPrice(){
        return price;
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
