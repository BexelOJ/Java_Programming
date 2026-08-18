public class Java_20260815_decorator_Soy extends Java_20260815_decorator_CondimentDecorator {

    private Java_20260815_decorator_Beverage beverage;

    public Java_20260815_decorator_Soy(Java_20260815_decorator_Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }

}


