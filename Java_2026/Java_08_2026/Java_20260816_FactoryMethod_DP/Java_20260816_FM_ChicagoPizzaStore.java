public class Java_20260816_FM_ChicagoPizzaStore extends Java_20260816_FM_PizzaStore {

    @Override
    protected Java_20260816_FM_Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return new Java_20260816_FM_CheesePizza();
        }
        else if (type.equals("pepperoni")) {
            return new Java_20260816_FM_PepperoniPizza(type);
        }
        else if (type.equals("veggie")) {
            return new Java_20260816_FM_VeggiePizza();
        }

        return null;
    }
}

