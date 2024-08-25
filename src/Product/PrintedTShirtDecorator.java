package src.Product;

// Decorador concreto para adicionar estampa
public class PrintedTShirtDecorator extends TShirtDecorator {
    public PrintedTShirtDecorator(IProduct tShirt) {
        super(tShirt);
    }

    @Override
    public String getName() {
        return super.getName() + " (Estampada)";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 10.50;
    }
}
