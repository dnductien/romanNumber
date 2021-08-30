import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberTest {
    @Test
    void convertNumberOneToI() {
        assertEquals("I", toRoman(1));
    }

    @Test
    void convertNumberOneToII() {
        assertEquals("II", toRoman(2));
    }

    private String toRoman(int i) {
        return "I";
    }
}
