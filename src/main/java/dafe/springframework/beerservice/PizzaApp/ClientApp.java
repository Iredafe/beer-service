package dafe.springframework.beerservice.PizzaApp;

public class ClientApp {

    public static void main(String[] args) {
        PizzaFactory newYorkFactory = new NYStylePizzaFactory();

        PizzaFactory chicagoFactory = new ChicagoPizzaFactory();

        Pizza pizza = chicagoFactory.orderPizza("cheese");
        System.out.println("Dafe ordered a " + pizza.getName() + "\n");

        pizza=newYorkFactory.orderPizza("pepperoni");
        System.out.println("Precious ordered a " + pizza.getName() + "\n");

        pizza = chicagoFactory.orderPizza("pepperoni");
        System.out.println("Sammy ordered a " + pizza.getName() + "\n");


    }
}
