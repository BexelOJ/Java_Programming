import java.util.Scanner;

public class Java_20260816_FM_Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //---------------------------------------------------
        // Select Pizza Store
        //---------------------------------------------------

        System.out.println("========================================");
        System.out.println("           PIZZA STORE");
        System.out.println("========================================");

        System.out.println("1. New York Pizza Store");
        System.out.println("2. Chicago Pizza Store");

        System.out.print("\nEnter store type: ");

        int storeChoice = scanner.nextInt();
        String storeName;

        Java_20260816_FM_PizzaStore pizzaStore;

        if (storeChoice == 1) {
            pizzaStore = new Java_20260816_FM_NYPizzaStore();
            storeName = "NY";
        }
        else if (storeChoice == 2) {
            pizzaStore = new Java_20260816_FM_ChicagoPizzaStore();
            storeName = "Chicago";
        }
        else {
            System.out.println("Invalid store selection.");
            scanner.close();
            return;
        }

        //---------------------------------------------------
        // Select Pizza
        //---------------------------------------------------

        System.out.println("\n----------------------------------------");
        System.out.println("     " + storeName + " PIZZA MENU");
        System.out.println("----------------------------------------");

        System.out.println("1. Cheese Pizza");
        System.out.println("2. Pepperoni Pizza");
        System.out.println("3. Veggie Pizza");

        System.out.print("\nEnter pizza type: ");

        int pizzaChoice = scanner.nextInt();

        String pizzaType;

        if (pizzaChoice == 1) {
            pizzaType = "cheese";
        }
        else if (pizzaChoice == 2) {
            pizzaType = "pepperoni";
        }
        else if (pizzaChoice == 3) {
            pizzaType = "veggie";
        }
        else {
            System.out.println("Invalid pizza selection.");
            scanner.close();
            return;
        }

        //---------------------------------------------------
        // Order Pizza
        //---------------------------------------------------

        Java_20260816_FM_Pizza pizza = pizzaStore.orderPizza(pizzaType);

        //---------------------------------------------------
        // Display Result
        //---------------------------------------------------

        System.out.println("\nOrdered: " + pizza.getName());

        scanner.close();
    }
}