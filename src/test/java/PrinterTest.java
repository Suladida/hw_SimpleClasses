import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 100);
    }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void canPrint_true(){
        assertEquals(true, printer.Print(1, 10));
    }

    @Test
    public void canPrint_false(){
        assertEquals(false, printer.Print(100, 10));
    }

    @Test
    public void canReduceToner(){
        assertEquals(10, printer.useToner(9, 10));
    }

    @Test
    public void canPrint(){
        assertEquals(true, printer.printIt(10, 8));
    }

}
