public class Java_20260815_decorator_Whip extends Java_20260815_decorator_CondimentDecorator {

    private Java_20260815_decorator_Beverage beverage;

    public Java_20260815_decorator_Whip(Java_20260815_decorator_Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }

}


