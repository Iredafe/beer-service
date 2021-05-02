package dafe.springframework.beerservice.PizzaApp;

public abstract class PizzaFactory {



 public Pizza orderPizza(String type){
     Pizza pizza;

     pizza = createPizza(type);
     pizza.prepare();
     pizza.bake();
     pizza.cut();
     pizza.box();

     return pizza;
 }

 protected abstract Pizza createPizza(String type);



}
