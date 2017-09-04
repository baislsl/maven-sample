import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sub1PrinterTest {
    public final static Logger LOGGER = LoggerFactory.getLogger(Sub1PrinterTest.class);

    @Test
    public void test(){
        LOGGER.info("");
        Sub1Printer.info();
    }
}
