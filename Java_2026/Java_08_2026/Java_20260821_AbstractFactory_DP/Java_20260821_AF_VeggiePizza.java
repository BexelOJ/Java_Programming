public class Java_20260821_AF_VeggiePizza extends Java_20260821_AF_Pizza {

    Java_20260821_AF_PizzaIngredientFactory ingredientFactory;

    public Java_20260821_AF_VeggiePizza(Java_20260821_AF_PizzaIngredientFactory ingredientFactory) {
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

        veggies = ingredientFactory.createVeggies();

        System.out.println("Veggies:");

        for (Java_20260821_AF_Veggies veggie : veggies) {
            System.out.println("  " + veggie);
        }
    }
}

