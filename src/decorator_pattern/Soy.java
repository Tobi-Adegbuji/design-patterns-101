package decorator_pattern;

public class Soy extends CondimentDecorator{

    private final Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .50;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
