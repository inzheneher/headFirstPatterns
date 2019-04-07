package strategy.ducks;

import strategy.fly.FlyNoWay;
import strategy.quack.MuteQuack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public String display() {
        return "I'm real Redhead duck";
    }
}
