public class Java_20260820_AF_ChicagoPizzaIngredientFactory implements Java_20260820_AF_PizzaIngredientFactory {

    @Override
    public Java_20260820_AF_Dough createDough() {
        return new Java_20260820_AF_ThickCrustDough();
    }

    @Override
    public Java_20260820_AF_Sauce createSauce() {
        return new Java_20260820_AF_PlumTomatoSauce();
    }

    @Override
    public Java_20260820_AF_Cheese createCheese() {
        return new Java_20260820_AF_MozzarellaCheese();
    }

    @Override
    public Java_20260820_AF_Veggies[] createVeggies() {
        Veggies veggies[] = {
                new Java_20260820_AF_Garlic(),
                new Java_20260820_AF_Onion(),
                new Java_20260820_AF_Mushroom(),
                new Java_20260820_AF_RedPepper()
        };

        return veggies;
    }

    @Override
    public Java_20260820_AF_Pepperoni createPepperoni() {
        return new Java_20260820_AF_SlicedPepperoni();
    }

    @Override
    public Java_20260820_AF_Clams createClam() {
        return new Java_20260820_AF_FrozenClams();
    }
}

