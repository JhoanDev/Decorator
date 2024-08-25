package src.Product;

public class TShirt implements IProduct {
    private String name;
    private double price;

    public TShirt() {
        this.name = "Camiseta";
        this.price = 50;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
