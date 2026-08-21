public class Java_20260818_singleton_Main {

    public static void main(String[] args) {

        //---------------------------------------------------
        // Get Singleton instance
        //---------------------------------------------------

        Java_20260818_singleton_ChocolateBoiler boiler1 =
                Java_20260818_singleton_ChocolateBoiler.getInstance();

        Java_20260818_singleton_ChocolateBoiler boiler2 =
                Java_20260818_singleton_ChocolateBoiler.getInstance();

        //---------------------------------------------------
        // Check whether both are the same object
        //---------------------------------------------------

        System.out.println(
            "boiler1 == boiler2 : " + (boiler1 == boiler2)
        );

        //---------------------------------------------------
        // Use the boiler
        //---------------------------------------------------

        boiler1.fill();

        boiler1.boil();

        boiler1.drain();
    }
}

