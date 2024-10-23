import java.util.Scanner;

public class PizzaClass {
    private static String size = ""; // static because this is accessed by main and InputSize. Main must be static.
    private int numCheeseToppings;
    private int numHamToppings;
    private int numPepperoniToppings;
    private double cost;

    public PizzaClass() {
        size = "Large";
        numCheeseToppings = 1;
        numHamToppings = 0;
        numPepperoniToppings = 0;
        cost = 0;
    }

    public PizzaClass(String pizzaSize, int cheese, int ham, int pepperoni) {
        size = pizzaSize;
        numCheeseToppings = cheese;
        numHamToppings = ham;
        numPepperoniToppings = pepperoni;
        cost = 0;
    }

    static int IntegerInputValidation(Scanner scanner) {
        int intNum;
        while (true) {
            try {
                intNum = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter an integer: ");
            }
        }
        return intNum;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setNumCheeseToppings(int numCheeseToppings) {
        this.numCheeseToppings = numCheeseToppings;
    }

    public void setNumHamToppings(int numHamToppings) {
        this.numHamToppings = numHamToppings;
    }

    public void setNumPepperoniToppings(int numPepperoniToppings) {
        this.numPepperoniToppings = numPepperoniToppings;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getSize() {
        return size;
    }

    public int getNumCheeseToppings() {
        return numCheeseToppings;
    }

    public int getNumHamToppings() {
        return numHamToppings;
    }

    public int getNumPepperoniToppings() {
        return numPepperoniToppings;
    }

    public double calcCost() {
        double baseCost = 10;
        if (size.equals("Small")) {
            baseCost = 10;
        } else if (size.equals("Medium")) {
            baseCost = 12;
        } else if (size.equals("Large")) {
            baseCost = 14;
        } else {
            System.out.println("Invalid size entered.");
            return 0;
        }
        this.cost = baseCost + (numHamToppings + numCheeseToppings + numPepperoniToppings) * 2;
        return cost;
    }

    public double getCost() {
        return this.cost;
    }

    public String getDescription() {
        return "Size: " + size + ", Cheese Toppings: " + numCheeseToppings +
                ", Pepperoni Toppings: " + numPepperoniToppings +
                ", Ham Toppings: " + numHamToppings + ". Cost: " + calcCost();
    }

    public static void InputSize(Scanner scanner) {
        while (!size.equals("Small") && !size.equals("Medium") && !size.equals("Large")) {
            System.out.println("Please enter Small, Medium, or Large:");
            size = scanner.nextLine();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str_input;
        int num_of_pizzas, order;
        double total_cost = 0.0;
        int num_of_cheese, num_of_ham, num_of_pepperoni;

        // Get number of pizzas
        System.out.println("How many pizzas do you want?");
        num_of_pizzas = IntegerInputValidation(scanner);

        for (order = 0; order < num_of_pizzas; order++) {
            PizzaClass p;

            // Get pizza size
            System.out.println("What size do you want your pizza to be: Small, Medium, or Large?");
            size = scanner.nextLine();
            InputSize(scanner); // Input Validation

            // Get toppings
            System.out.println("How many cheese toppings do you want?");
            num_of_cheese = IntegerInputValidation(scanner);

            System.out.println("How many ham toppings do you want?");
            num_of_ham = IntegerInputValidation(scanner);

            System.out.println("How many pepperoni toppings do you want?");
            num_of_pepperoni = IntegerInputValidation(scanner);

            // Create pizza and display description
            p = new PizzaClass(size, num_of_cheese, num_of_ham, num_of_pepperoni);
            System.out.println(p.getDescription());

            // Add to total cost
            total_cost += p.getCost();
        }

        // Display total cost
        System.out.println("The total cost is: " + total_cost);
    }
}