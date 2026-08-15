public class Java_20260815_decorator_StarbuzzCoffee {

    public static void main(String[] args) {

        Java_20260815_decorator_Beverage beverage = new Java_20260815_decorator_DarkRoast();

        beverage = new Java_20260815_decorator_Mocha(beverage);

        beverage = new Java_20260815_decorator_Whip(beverage);

        System.out.println(
            beverage.getDescription()
        );

        System.out.println(
            "$" + beverage.cost()
        );
    }

}


