package bedu.java.calculator.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AdvancedCalculatorServiceTest {

    @InjectMocks
    private AdvancedCalculatorService service;

    @Test
    @DisplayName("Factorial of 0")
    void testFactorialZero() {
        int result = service.factorial(0);
        assertEquals(1, result);
    }

    @Test
    @DisplayName("Factorial of negative number")
    void testFactorialNegative() {
        int result = service.factorial(-5);
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Factorial of positive number")
    void testFactorialPositive() {
        int result = service.factorial(5);
        assertEquals(120, result);
    }
}
