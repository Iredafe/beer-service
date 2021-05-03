package dafe.springframework.beerservice.PizzaApp;

public class ChicagoPizzaFactory extends PizzaFactory{

    public Pizza createPizza(String type){

        if(type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }else if(type.equals("pepperoni")){
            return new ChicagoStylePepperoniPizza();
        }
        return null;
    }
}
