import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathExpressionTest {
    @Test
    @DisplayName("Checking for correctly usage of the library-exp4j!")
    public void givenSimpleMathExpression_whenCallEvaluateMethod_thenSuccess() {
        Expression expression = new ExpressionBuilder("14 * 6 / 12").build();
        double result = expression.evaluate();
        assertEquals(7, result);
    }

    @Test
    @DisplayName("Checking for correctly evaluate method!")
    public void givenInfixExpression_whenCallEvaluateMethod_thenSuccess() {
        String str = "14 * 6 - 13";
        double result = MathExpression.evaluate(str);
        assertEquals(71, result);
    }

    @Test
    @DisplayName("Checking for correctly caught exception!")
    public void givenWrongInfixExpression_whenCallEvaluateMethod_thenThrowAndCatchException() {
        String str = "14 6 / - 13";
        Assertions.assertThrows(IllegalArgumentException.class, () -> MathExpression.evaluate(str));
    }

}
