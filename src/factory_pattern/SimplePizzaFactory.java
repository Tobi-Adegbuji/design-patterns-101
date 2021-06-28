package factory_pattern;

public class SimplePizzaFactory {


    public static Pizza createPizza(String pizzaType){
        Pizza pizza = null;

        if(pizzaType.equalsIgnoreCase("cheese")){

        }
        else if(pizzaType.equalsIgnoreCase("pepperoni")){

        }
        else if(pizzaType.equalsIgnoreCase("clam")){

        }
        else if(pizzaType.equalsIgnoreCase("veggie")){

        }
        return pizza;
    }

}
