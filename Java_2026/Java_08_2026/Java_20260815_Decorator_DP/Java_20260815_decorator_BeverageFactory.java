public class Java_20260815_decorator_BeverageFactory {

    public static Java_20260815_decorator_Beverage create(
            String base,
            String[] condiments) {

        Java_20260815_decorator_Beverage beverage;

        // -------------------------------------------
        // Create base beverage
        // -------------------------------------------

        beverage = switch (base.toLowerCase()) {

            case "darkroast" ->
                    new Java_20260815_decorator_DarkRoast();

            case "decaf" ->
                    new Java_20260815_decorator_Decaf();

            case "espresso" ->
                    new Java_20260815_decorator_Espresso();

            case "houseblend" ->
                    new Java_20260815_decorator_HouseBlend();

            default ->
                    throw new IllegalArgumentException(
                            "Unknown beverage: " + base);
        };


        // -------------------------------------------
        // Add condiments
        // -------------------------------------------

        for (String condiment : condiments) {

            beverage = switch (condiment.toLowerCase()) {

                case "mocha" ->
                        new Java_20260815_decorator_Mocha(beverage);

                case "soy" ->
                        new Java_20260815_decorator_Soy(beverage);

                case "steamedmilk" ->
                        new Java_20260815_decorator_SteamedMilk(beverage);

                case "whip" ->
                        new Java_20260815_decorator_Whip(beverage);

                default ->
                        throw new IllegalArgumentException(
                                "Unknown condiment: " + condiment);
            };
        }

        return beverage;
    }
}

