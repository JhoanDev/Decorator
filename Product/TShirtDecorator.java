package Product;

// Classe abstrata Decorator 
public abstract class TShirtDecorator implements IProduct {
    protected IProduct tShirt;

    public TShirtDecorator(IProduct tShirt) {
        this.tShirt = tShirt;
    }

    @Override
    public String getName() {
        return tShirt.getName();
    }

    @Override
    public double getPrice() {
        return tShirt.getPrice();
    }
}
