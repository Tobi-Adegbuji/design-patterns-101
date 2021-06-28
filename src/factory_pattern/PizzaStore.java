package factory_pattern;

public class PizzaStore {

    public Pizza orderPizza(String type){

        Pizza pizza;

        pizza = SimplePizzaFactory.createPizza(type);


        //OTHER METHODS

        return pizza;
    }

}
