import java.util.Scanner;
import Product.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Deseja comprar uma camiseta? (1-sim) (2-não):\t");
        boolean desejaComprar = Integer.parseInt(scan.nextLine()) == 1;

        while (desejaComprar) {
            IProduct camiseta = new TShirt();

            System.out.print("Deseja uma camisa com estampa? (1-sim) (2-não):\t");
            int opc = Integer.parseInt(scan.nextLine());
            if (opc == 1) {
                camiseta = new PrintedTShirtDecorator(camiseta);
            }

            System.out.print("Deseja uma camisa com bordado? (1-sim) (2-não):\t");
            opc = Integer.parseInt(scan.nextLine());
            if (opc == 1) {
                camiseta = new EmbroideredTShirtDecorator(camiseta);
            }

            System.out.println("\nVocê comprou: " + camiseta.getName());
            System.out.printf("Preço total: %.2f\n", camiseta.getPrice());

            System.out.print("\nDeseja comprar outra camiseta? (1-sim) (2-não):\t");
            desejaComprar = Integer.parseInt(scan.nextLine()) == 1;
        }

        scan.close();
        System.out.println("Obrigado por comprar conosco!");
    }
}
