import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    private final CalculatorService service = new CalculatorService();

    @Test
    void testAdd() {
        int result = service.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    void testDivideSuccess() {
        int result = service.divide(10, 2);
        assertEquals(5, result);
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            service.divide(10, 0);
        });
    }
}