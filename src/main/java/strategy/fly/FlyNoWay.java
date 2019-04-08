package strategy.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public String fly() {
        return "I can't fly";
    }
}
