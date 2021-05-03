package dafe.springframework.beerservice.PizzaApp;

public class NYStylePizzaFactory extends PizzaFactory{

    public Pizza createPizza(String type){
        if(type.equals("cheese")){
            return  new NYStylePizza();
        }

        return null;
    }

}
