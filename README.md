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

- **Insufficient Funds**: Displayed if the user inserts less than the required amount.
- **Invalid Selection**: Triggered when the selected coffee is not on the menu.
- **Out of Quantity**: Notified if the chosen coffee is out of stock or Out of Water.
- **Technical Error**: Raised if the machine fails to prepare the coffee due to an internal issue.  


## Possible Optimizations
- **Dynamic Coffee Menu**: Allow adding or removing coffee types at runtime without changing the code.
- **User Interface Enhancement**: Develop a graphical user interface (GUI) for better usability.
- **Persistence**: Save transaction history or user preferences using files or a database.
- **Error Logging**: Implement detailed error logging for easier debugging and maintenance.
- **Automated Testing**: Add unit  tests to ensure code reliability.
- **Change Management**: Implement a system to return change to the user if they insert more money than required.

## Test

We can test the application by:

- Instantiating a `CoffeeMachine` with a sample menu ( Espresso, Latte, etc.).
- Calling `pay()` with various amounts (below and above coffee prices). 
- Using `choose()` to select valid and invalid coffee types. 
- Verifying `getCoffee()` returns the correct result. 
- Simulating edge cases ( insufficient funds, out-of-stock coffee).