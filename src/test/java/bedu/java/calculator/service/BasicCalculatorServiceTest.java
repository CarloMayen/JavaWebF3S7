package bedu.java.calculator.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BasicCalculatorServiceTest {

    @InjectMocks
    private BasicCalculatorService service;

    @Test
    public void testSum() {
        int result = service.sum(90, 10);
        assertEquals(100, result);
    }

    @Test
    public void testSumZeros() {
        int result = service.sum(0, 0);
        assertEquals(0, result);
    }

    @Test
    public void testSumRZero() {
        int result = service.sum(100, 0);
        assertEquals(100, result);
    }

    @Test
    public void testSumLZero() {
        int result = service.sum(0, 80);
        assertEquals(80, result);
    }


// Resta
    @Test
    public void testSub() {
        int result = service.sub(10, 5);
        assertEquals(5, result);
    }

    @Test
    public void testSubZeros() {
        int result = service.sub(0, 0);
        assertEquals(0, result);
    }

    @Test
    public void testSubRZero() {
        int result = service.sub(100, 0);
        assertEquals(100, result);
    }

    @Test
    public void testSubLZero() {
        int result = service.sub(0, 80);
        assertEquals(-80, result);
    }
}
