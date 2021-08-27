import org.junit.Test;

public class HelloWorldTest {
    @Test
    public void hello () {
        HelloWorld hello = new HelloWorld();

        String actualResult = HelloWorld.greeting("oil");

        assertEquals("Hello", actualResult);
    }
}
