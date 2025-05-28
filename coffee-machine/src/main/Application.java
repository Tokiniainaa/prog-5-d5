import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Map<String, Coffee> coffeeMap = new HashMap<>();
        coffeeMap.put("espresso", new Coffee("espresso", 2.0, 5));
        coffeeMap.put("latte", new Coffee("latte", 3.0, 3));
        coffeeMap.put("cappuccino", new Coffee("cappuccino", 2.5, 0));
        CoffeeMachine machine = new CoffeeMachine(coffeeMap);

        try {
            machine.pay(5.0);
            System.out.println("Vous avez inséré 5.0 €");
            machine.choose("latte");
            System.out.println("Vous avez choisi un latte.");
            Coffee served = machine.serve();
            System.out.println("Votre café est prêt : " + served.getName());
            double change = machine.giveChange();
            System.out.println("Voici votre monnaie : " + change + " €");

        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Erreur : " + e.getMessage());
            double refund = machine.cancel();
            System.out.println("Opération annulée. Voici votre remboursement : " + refund + " €");
        }
    }
}
