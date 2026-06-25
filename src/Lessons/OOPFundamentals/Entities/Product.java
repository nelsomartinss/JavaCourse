package lessons.OOPFundamentals.Entities;

public class Product {
    public String name;
    public double price;
    public int quantity; // attributes

    // Constructor
    public Product(String name, double price, int quantity){ // does not have a return type
        // these will be the attribute values at the time of instantiation
        // referencing the object's attribute
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){ // the argument name is the same as the attribute name,
        // witch causes ambiguity
        this.quantity += quantity; // to refer to the class attribute, we use keyword "this".
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    // custom version of toString()
    public String toString(){ // overriding the default toString() method inherited from Object
        return String.format(
                "\nName: %s\nPrice: $%.2f\nQuantity: %d\nTotal: $%.2f\n",
                name, price, quantity, totalValueInStock()
        );
    }
}
