package dafe.springframework.beerservice.PizzaApp;

public class ClientApp {

    public static void main(String[] args) {
        PizzaFactory newYorkFactory = new NYStylePizzaFactory();
        System.out.println();
    }
}
