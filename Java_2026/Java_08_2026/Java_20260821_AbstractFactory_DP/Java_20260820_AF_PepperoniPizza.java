public class Java_20260820_AF_PepperoniPizza extends Java_20260820_AF_Pizza {

    Java_20260820_AF_PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(Java_20260820_AF_PizzaIngredientFactory ingredientFactory) {
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

        pepperoni = ingredientFactory.createPepperoni();
        System.out.println("Pepperoni: " + pepperoni);
    }
}

