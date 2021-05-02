package dafe.springframework.beerservice.simuduck;

public class MuteQuack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("SILENCE.. I don't quack");
    }
}
