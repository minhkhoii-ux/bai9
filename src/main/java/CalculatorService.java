import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculatorService {

    private static final Logger logger = LoggerFactory.getLogger(CalculatorService.class);

    // 1. INFO logging
    public int add(int a, int b) {
        logger.info("Thực hiện cộng: {} + {}", a, b);
        return a + b;
    }

    // 2. ERROR logging (exception)
    public int divide(int a, int b) {
        try {
            logger.info("Thực hiện chia: {} / {}", a, b);
            return a / b;
        } catch (ArithmeticException e) {
            logger.error("Lỗi chia cho 0: a={}, b={}", a, b, e);
            throw e; // ném lại để test bắt
        }
    }
}