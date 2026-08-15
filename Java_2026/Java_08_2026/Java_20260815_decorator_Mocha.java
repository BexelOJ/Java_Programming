public class Java_20260815_decorator_Mocha extends Java_20260815_decorator_CondimentDecorator {

    private Java_20260815_decorator_Beverage beverage;

    public Java_20260815_decorator_Mocha(Java_20260815_decorator_Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }

}

