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

    @Test
    void convertNumberFiveToV() {
        assertEquals("V", toRoman(5));
    }

    private String toRoman(int number) {
        String result = "";
        if (number == 4) {
            result = "IV";
            number -= 4;
        }
        for (int i = 0; i < number; i++) {
            result += "I";
        }


        return  result;

    }
}
