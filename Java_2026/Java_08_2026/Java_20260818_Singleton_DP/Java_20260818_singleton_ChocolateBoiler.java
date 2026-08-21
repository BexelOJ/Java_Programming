public class Java_20260818_singleton_ChocolateBoiler {

    //---------------------------------------------------
    // Singleton instance
    //---------------------------------------------------

    private static Java_20260818_singleton_ChocolateBoiler uniqueInstance;

    //---------------------------------------------------
    // Boiler state
    //---------------------------------------------------

    private boolean empty;
    private boolean boiled;

    //---------------------------------------------------
    // Private constructor
    //---------------------------------------------------

    private Java_20260818_singleton_ChocolateBoiler() {

        empty = true;
        boiled = false;
    }

    //---------------------------------------------------
    // Singleton access
    //---------------------------------------------------

    public static Java_20260818_singleton_ChocolateBoiler getInstance() {

        if (uniqueInstance == null) {

            uniqueInstance = new Java_20260818_singleton_ChocolateBoiler();
        }

        return uniqueInstance;
    }

    //---------------------------------------------------
    // Fill boiler
    //---------------------------------------------------

    public void fill() {

        if (isEmpty()) {

            empty = false;
            boiled = false;

            System.out.println("Filling the boiler with chocolate and milk.");
        }
        else {

            System.out.println("Boiler is already filled.");
        }
    }

    //---------------------------------------------------
    // Drain boiler
    //---------------------------------------------------

    public void drain() {

        if (!isEmpty() && isBoiled()) {

            empty = true;

            System.out.println("Draining boiled chocolate.");
        }
        else {

            System.out.println("Cannot drain.");
        }
    }

    //---------------------------------------------------
    // Boil chocolate
    //---------------------------------------------------

    public void boil() {

        if (!isEmpty() && !isBoiled()) {

            boiled = true;

            System.out.println("Boiling the chocolate.");
        }
        else {

            System.out.println("Cannot boil.");
        }
    }

    //---------------------------------------------------
    // Getters
    //---------------------------------------------------

    public boolean isEmpty() {

        return empty;
    }

    public boolean isBoiled() {

        return boiled;
    }
}

