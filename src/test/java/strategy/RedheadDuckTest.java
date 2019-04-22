package strategy;

import org.junit.Before;
import org.junit.Test;
import strategy.ducks.Duck;
import strategy.ducks.RedheadDuck;
import strategy.fly.FlyNoWay;
import strategy.fly.FlyRocketPowered;
import strategy.fly.FlyWithWings;
import strategy.quack.MuteQuack;
import strategy.quack.Quack;
import strategy.quack.Squeak;

import static org.fest.assertions.api.Assertions.assertThat;

public class RedheadDuckTest {

    private Duck duck;

    @Before
    public void setUp() {
        duck = new RedheadDuck();
        duck.setFlyBehavior(new FlyWithWings());
        duck.setQuackBehavior(new Quack());
    }

    @Test
    public void shouldPrintDisplayMessageWhenCallDisplayMethod() {
        assertThat(duck.display()).isEqualTo("I'm real Redhead duck");
    }

    @Test
    public void shouldFlyWithWingsWhenCallPerformFlyMethod() {
        assertThat(duck.performFly()).isEqualTo("I'm flying!!");
    }


    @Test
    public void shouldFlyNoWayAfterChangingFlyBehaviorToFlyNoWay() {
        duck.setFlyBehavior(new FlyNoWay());
        assertThat(duck.performFly()).isEqualTo("I can't fly");
    }

    @Test
    public void shouldFlyRocketPoweredAfterChangingFlyBehaviorToFlyRocketPowered() {
        duck.setFlyBehavior(new FlyRocketPowered());
        assertThat(duck.performFly()).isEqualTo("I'm flying with a rocket!");
    }

    @Test
    public void shouldQuackAsDuckWhenCallPerformQuackMethod() {
        assertThat(duck.performQuack()).isEqualTo("Quack");
    }

    @Test
    public void shouldSqueakAfterChangingQuackBehaviorToSqueak() {
        duck.setQuackBehavior(new Squeak());
        assertThat(duck.performQuack()).isEqualTo("Squeak");
    }

    @Test
    public void shouldMuteQuackAfterChangingQuackBehaviorToMuteQuack() {
        duck.setQuackBehavior(new MuteQuack());
        assertThat(duck.performQuack()).isEqualTo("I can't quack...");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenArgumentInSetFlyBehaviorIsNull() {
        duck.setFlyBehavior(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenArgumentInSetQuackBehaviorIsNull() {
        duck.setQuackBehavior(null);
    }
}
