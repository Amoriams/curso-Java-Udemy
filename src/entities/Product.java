package entities;

public class Product {
    public String name;
    public double price;
    public double discountPercentage;

    public  double finalPrice(){
        return price - (price * discountPercentage / 100);
    }

    public  String description(){
        return "product: " + name + "\noriginal price: $" + price + "\nFinal Price: $" + finalPrice() + "\ndiscount: " + discountPercentage + "% discount!";
    }
}
