import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InfixToPostfixTest {
    @Test
    @DisplayName("Checking for correctly convert infix to postfix!")
    void convert_InfixGiven_ShouldShowPostfix() {
        String exp = "2 * 13 / 3";
        assertEquals("2  13 * 3/", InfixToPostfix.convert(exp));
    }

    @Test
    @DisplayName("Checking for correctly caught exception!")
    void convert_WrongInfixGiven_ShouldThrowAndCatchException() {
        String exp = "2 13 3 * ,";
        assertThrows(IllegalArgumentException.class, () -> InfixToPostfix.convert(exp));
    }

}
