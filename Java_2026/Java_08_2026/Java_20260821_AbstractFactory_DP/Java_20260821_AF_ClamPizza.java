public class Java_20260821_AF_ClamPizza extends Java_20260821_AF_Pizza {

    Java_20260821_AF_PizzaIngredientFactory ingredientFactory;

    public Java_20260821_AF_ClamPizza(Java_20260821_AF_PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {

        System.out.println("Preparing " + name);

        dough = ingredientFactory.createDough();
        System.out.println("Dough: " + dough);

        sauce = ingredientFactory.createSauce();
        System.out.println("Sauce: " + sauce);

        cheese = ingredientFactory.createCheese();
        System.out.println("Cheese: " + cheese);

        clams = ingredientFactory.createClam();
        System.out.println("Clams: " + clams);
    }
}

