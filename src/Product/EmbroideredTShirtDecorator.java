package src.Product;

// Decorador concreto para adicionar bordado
public class EmbroideredTShirtDecorator extends TShirtDecorator {
    public EmbroideredTShirtDecorator(IProduct tShirt) {
        super(tShirt);
    }

    @Override
    public String getName() {
        return super.getName() + " (Bordada)";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 15.75;
    }
}
