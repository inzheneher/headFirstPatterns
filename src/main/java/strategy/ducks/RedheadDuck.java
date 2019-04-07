package strategy.ducks;

import strategy.fly.FlyNoWay;
import strategy.quack.MuteQuack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm real Redhead duck");
    }
}
