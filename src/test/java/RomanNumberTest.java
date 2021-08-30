import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberTest {
    @Test
    void convertNumberOneToI() {
        assertEquals("I", toRoman(1));
    }

    @Test
    void convertNumberTwoToII() {
        assertEquals("II", toRoman(2));
    }

    @Test
    void convertNumberThreeToIII() {
        assertEquals("III", toRoman(3));
    }

    @Test
    void convertNumberFourToIV() {
        assertEquals("IV", toRoman(4));
    }

    private String toRoman(int i) {
        String result = "";

        if (i == 1) {
            result = "I";
        }
        else if (i == 2) {
            result = "II";
        } else {
            result = "III";
        }

        return  result;

    }
}
