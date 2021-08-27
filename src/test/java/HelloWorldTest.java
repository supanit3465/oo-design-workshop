import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void hello () {
        HelloWorld hello = new HelloWorld();

        String actualResult = HelloWorld.greeting("oil");

        assertEquals("oil", actualResult);
    }
}
