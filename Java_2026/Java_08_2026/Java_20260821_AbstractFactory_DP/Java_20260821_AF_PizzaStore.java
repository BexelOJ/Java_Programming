public abstract class Java_20260821_AF_PizzaStore {

    protected abstract Java_20260821_AF_Pizza createPizza(String item);

    public Java_20260821_AF_Pizza orderPizza(String type) {

        Java_20260821_AF_Pizza pizza = createPizza(type);

        System.out.println();
        System.out.println("--- Making a " + pizza.getName() + " ---");

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}

