public class Java_20260821_AF_NYPizzaIngredientFactory implements Java_20260821_AF_PizzaIngredientFactory {

    @Override
    public Java_20260821_AF_Dough createDough() {
        return new Java_20260821_AF_ThinCrustDough();
    }

    @Override
    public Java_20260821_AF_Sauce createSauce() {
        return new Java_20260821_AF_MarinaraSauce();
    }

    @Override
    public Java_20260821_AF_Cheese createCheese() {
        return new Java_20260821_AF_ReggianoCheese();
    }

    @Override
    public Java_20260821_AF_Veggies[] createVeggies() {
        Java_20260821_AF_Veggies veggies[] = {
                new Java_20260821_AF_Garlic(),
                new Java_20260821_AF_Onion(),
                new Java_20260821_AF_Mushroom(),
                new Java_20260821_AF_RedPepper()
        };

        return veggies;
    }

    @Override
    public Java_20260821_AF_Pepperoni createPepperoni() {
        return new Java_20260821_AF_SlicedPepperoni();
    }

    @Override
    public Java_20260821_AF_Clams createClam() {
        return new Java_20260821_AF_FreshClams();
    }
}

