import java.util.Map;

public class CoffeeMachine {
    private final Map<String, Coffee> coffees;
    private double balance;
    private Coffee selectedCoffee;

    public CoffeeMachine(Map<String, Coffee> coffees) {
        this.coffees = coffees;
        this.balance = 0.0;
        this.selectedCoffee = null;
    }

    public void pay(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void choose(String coffeeName) {
        Coffee coffee = coffees.get(coffeeName);
        if (coffee == null) {
            throw new IllegalArgumentException("Invalid selection");
        }
        selectedCoffee = coffee;
    }

    public Coffee serve() {
        if (selectedCoffee == null) {
            throw new IllegalStateException("No coffee selected");
        }
        if (selectedCoffee.getStock() <= 0) {
            throw new IllegalStateException("Out of stock");
        }
        if (balance < selectedCoffee.getPrice()) {
            throw new IllegalStateException("Insufficient payment");
        }

        balance -= selectedCoffee.getPrice();
        Coffee served = selectedCoffee;
        selectedCoffee = null;  // reset selection après service
        return served;
    }

    public double cancel() {
        double refund = balance;
        balance = 0;
        selectedCoffee = null;
        return refund;
    }

    public double giveChange() {
        double change = balance;
        balance = 0;
        return change;
    }
}
