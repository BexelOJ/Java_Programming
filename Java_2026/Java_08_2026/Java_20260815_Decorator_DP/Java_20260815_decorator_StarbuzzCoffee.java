import java.util.Scanner;

public class Java_20260815_decorator_StarbuzzCoffee {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // -------------------------------------------
        // Select base beverage
        // -------------------------------------------

        System.out.println("Select beverage:");
        System.out.println("1. Dark Roast");
        System.out.println("2. Decaf");
        System.out.println("3. Espresso");
        System.out.println("4. House Blend");

        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();

        Java_20260815_decorator_Beverage beverage;

        switch (choice) {

            case 1:
                beverage = new Java_20260815_decorator_DarkRoast();
                break;

            case 2:
                beverage = new Java_20260815_decorator_Decaf();
                break;

            case 3:
                beverage = new Java_20260815_decorator_Espresso();
                break;

            case 4:
                beverage = new Java_20260815_decorator_HouseBlend();
                break;

            default:
                System.out.println("Invalid beverage selection.");
                scanner.close();
                return;
        }


        // -------------------------------------------
        // Select condiments
        // -------------------------------------------

        while (true) {

            System.out.println();
            System.out.println("Select condiment:");
            System.out.println("1. Mocha");
            System.out.println("2. Soy");
            System.out.println("3. Steamed Milk");
            System.out.println("4. Whip");
            System.out.println("0. Done");

            System.out.print("Enter choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    beverage =
                            new Java_20260815_decorator_Mocha(beverage);
                    break;

                case 2:
                    beverage =
                            new Java_20260815_decorator_Soy(beverage);
                    break;

                case 3:
                    beverage =
                            new Java_20260815_decorator_SteamedMilk(beverage);
                    break;

                case 4:
                    beverage =
                            new Java_20260815_decorator_Whip(beverage);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Invalid condiment selection.");
                    continue;
            }

            if (choice == 0) {
                break;
            }
        }


        // -------------------------------------------
        // Display final beverage
        // -------------------------------------------

        System.out.println();
        System.out.println("Order:");
        System.out.println(beverage.getDescription());

        System.out.println("Cost: $" + beverage.cost());


        scanner.close();
    }
}

