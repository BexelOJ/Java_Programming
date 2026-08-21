public class Java_20260821_AF_ChicagoPizzaStore extends Java_20260821_AF_PizzaStore {

    @Override
    protected Java_20260821_AF_Pizza createPizza(String item) {

        Java_20260821_AF_Pizza pizza = null;

        Java_20260821_AF_PizzaIngredientFactory ingredientFactory =
                new Java_20260821_AF_ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new Java_20260821_AF_CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new Java_20260821_AF_VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");

        } else if (item.equals("clam")) {

            pizza = new Java_20260821_AF_ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");

        } else if (item.equals("pepperoni")) {

            pizza = new Java_20260821_AF_PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }

        return pizza;
    }
}

