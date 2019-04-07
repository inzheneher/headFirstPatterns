package strategy.ducks;

import strategy.fly.FlyRocketPowered;
import strategy.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyRocketPowered();
    }

    @Override
    public void display() {
        System.out.println("I'm real Rubber duck");
    }
}
