package dafe.springframework.beerservice.simuduck;

public abstract class Duck {


IFlyBehavior flyBehavior;
IQuackBehavior quackBehavior;

public Duck(){

}

public abstract void display();

public void swim(){
    System.out.println("All ducks float, even decoys");
}

    public void performFly(){
    flyBehavior.fly();
    }

    public void performQuack(){
    quackBehavior.quack();
    }

}
