import java.util.Scanner;

public class Java_20260816_state_Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //---------------------------------------------------
        // Create machine
        //---------------------------------------------------

        Java_20260816_state_GumballMachine machine = new Java_20260816_state_GumballMachine(2);

        //---------------------------------------------------
        // Menu
        //---------------------------------------------------

        while (true) {

            System.out.println("\n========================================");
            System.out.println("          GUMBALL MACHINE");
            System.out.println("========================================");

            System.out.println("1. Insert Quarter");
            System.out.println("2. Eject Quarter");
            System.out.println("3. Turn Crank");
            System.out.println("4. Exit");

            System.out.print("\nEnter your choice: ");

            int choice = scanner.nextInt();

            //---------------------------------------------------
            // Process choice
            //---------------------------------------------------

            switch (choice) {

                case 1:
                    machine.insertQuarter();
                    break;

                case 2:
                    machine.ejectQuarter();
                    break;

                case 3:
                    machine.turnCrank();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

