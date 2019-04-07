import org.junit.Test;
import strategy.ducks.MallardDuck;

import static org.fest.assertions.api.Assertions.assertThat;

public class MallardDuckTest {
    @Test
    public void shouldPrintMessageIfCallDisplayMethod() {
        assertThat(new MallardDuck().display()).isEqualTo("I'm real Mallard duck");
    }
}
