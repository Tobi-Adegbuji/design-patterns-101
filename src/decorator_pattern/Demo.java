package decorator_pattern;

public class Demo {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        displayPrice(beverage);

        Beverage beverage2 = new HouseBlend();
        //Decorating the house blend with extra condiments
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        displayPrice(beverage2);

        Beverage beverage3 = new Espresso();
        beverage3 = new Mocha(beverage3);
        beverage3 = new Soy(beverage3);
        beverage3 = new Whip(beverage3);
        displayPrice(beverage3);
    }

    public static void displayPrice(Beverage beverage){
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }

}
