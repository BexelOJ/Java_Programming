public abstract class Java_20260816_FM_PizzaStore {

    public Java_20260816_FM_Pizza orderPizza(String type) {

        Java_20260816_FM_Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Java_20260816_FM_Pizza createPizza(String type);
}


