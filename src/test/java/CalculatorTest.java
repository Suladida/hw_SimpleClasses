import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(0);
    }

    @Test
    public void canAdd(){
        assertEquals(10, calculator.Add(5,5));
    }

    @Test
    public void canSubtract(){
        assertEquals(5, calculator.Subtract(10, 5));
    }

    @Test
    public void canMultiply(){
        assertEquals(25, calculator.Multiply(5,5));
    }

    @Test
    public void canDivide(){
        assertEquals(2, calculator.Divide(20,10), 0.0);
    }



}
