package bedu.java.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class AdvancedCalculatorService {
    // Para todo número "n" >= 0
    // n! = n * (n-1) * (n-2) * (n-3) * ... * 1
    // 5! = 5 * 4 * 3 * 2 * 1
    public int factorial(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
