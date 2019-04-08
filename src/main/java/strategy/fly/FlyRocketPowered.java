package strategy.fly;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public String fly() {
        return "I'm flying with a rocket!";
    }
}
