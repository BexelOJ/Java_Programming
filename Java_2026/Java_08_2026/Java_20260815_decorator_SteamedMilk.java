public class Java_20260815_decorator_SteamedMilk extends Java_20260815_decorator_CondimentDecorator {

    private Java_20260815_decorator_Beverage beverage;

    public Java_20260815_decorator_SteamedMilk(Java_20260815_decorator_Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }

}


