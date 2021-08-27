import org.junit.Test;

import static org.junit.Assert.*;

public class RangeTest {
    @Test
    public void isStatrtInclusiveWithKampooBeTrue () {
        //Arrange
        Range range = new Range("[1,5]");

        //Act
        boolean actualResult = range.isStartWithInclusive();

        //Assert
        assertTrue(actualResult);
    }

    @Test
    public void isStatrtInclusiveWithKampooBeFalse () {
        //Arrange
        Range range = new Range("(1,5]");

        //Act
        boolean actualResult = range.isStartWithInclusive();

        //Assert
        assertFalse(actualResult);
    }

    @Test
    public void getStartInputShoulbe1 () {
        //Arrange
        Range range = new Range("(1,5]");

        //Act
        int actualResult = range.getStartInput();

        //Assert
        assertEquals(1, actualResult);
    }

    @Test
    public void isEndtInclusiveWithKampooBeTrue () {
        //Arrange
        Range range = new Range("[1,5]");

        //Act
        boolean actualResult = range.isEndWithInclusive();

        //Assert
        assertTrue(actualResult);
    }
}
