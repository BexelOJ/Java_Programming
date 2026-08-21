public class Java_20260821_AF_NYPizzaStore  extends Java_20260821_AF_PizzaStore {

    @Override
    protected Java_20260821_AF_Pizza createPizza(String item) {

        Java_20260821_AF_Pizza pizza = null;

        Java_20260821_AF_PizzaIngredientFactory ingredientFactory =
                new Java_20260821_AF_NYPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new Java_20260821_AF_CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new Java_20260821_AF_VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");

        } else if (item.equals("clam")) {

            pizza = new Java_20260821_AF_ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");

        } else if (item.equals("pepperoni")) {

            pizza = new Java_20260821_AF_PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }

        return pizza;
    }
}

