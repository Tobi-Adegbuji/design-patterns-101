package decorator_pattern;

public class Mocha extends CondimentDecorator{


    private final Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
