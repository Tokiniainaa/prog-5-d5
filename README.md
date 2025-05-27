# Coffee Machine

This Java project simulates a basic coffee vending machine. Users can pay, select a coffee type, and receive the prepared drink.

## Features

- Accept user payments
- Display available coffee options
- Allow coffee selection
- Dispense the selected coffee

## Use Cases

### 1. Pay
The user inserts an amount. If the amount is sufficient, the machine displays the available coffee options.

### 2. Choose Coffee
The user selects a coffee type from the available menu. The machine begins preparing the selected coffee.

### 3. Get Coffee
Once the coffee is ready, the machine dispenses it and the user retrieves the drink.

## Modeling

### CoffeeMachine
- Attributes:
    - `balance`: double — the amount inserted by the user
    - `menu`: List\<Coffee\> — list of available coffees

- Methods:
    - `pay(amount: double): void` — adds the amount to the balance
    - `choose(type: String): void` — selects a coffee type from the menu
    - `getCoffee(): Coffee` — returns the prepared coffee to be dispensed

### Coffee
- Attributes:
    - `type`: String — coffee name
    - `price`: double — coffee price
    - `quantity`: int — available quantity of this coffee

- Method:
    - `prepare(): void` — prepares the coffee

#### Class Descriptions
- `CoffeeMachine`: Handles payment, coffee selection, and delivery
- `Coffee`: Represents a drink with a type, price,quantity and preparation method
## Error Handling

- **Insufficient Funds**: If the amount inserted is below the coffee price, an error is displayed.
- **Invalid Selection**: If the selected coffee is not on the menu, an error is triggered.
- **Technical Error**: If the machine cannot prepare the coffee, an exception is raised.
- **Out of Quantity**: If the selected coffee is out of stock, an error notifies the user.  
