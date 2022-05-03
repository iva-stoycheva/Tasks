import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculationsTest {
    @Test
    @DisplayName("Checking for correctly RPN calculatio!")
    void calculateRPN_PostfixGiven_ShouldShowCalculationsResult() {
        String[] tokens = new String[] {"2", "3", "*", "1", "-"};
        assertEquals(5, CalculationsRPN.evaluateRPN(tokens));
    }

    @Test
    @DisplayName("Checking for correctly caught exception!")
    void calculateRPN_WrongPostfixGiven_ShouldThrowAndCatchException() {
        String[] tokens = new String[] {"2", "3", "^", "1", "-"};
        assertThrows(NumberFormatException.class, () -> CalculationsRPN.evaluateRPN(tokens));
    }

}
