import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidationTest {

    @Test
    public void has8CharsPlusTest_when7Chars_thenReturnFalse() {
        //GIVEN
        String password = "passwor";
        //WHEN
        boolean actual = PasswordValidation.has8CharsPlus(password);
        //THEN
        assertFalse(actual);
    }

    @Test
    public void has8CharsPlusTest_when8Chars_thenReturnTrue() {
        //GIVEN
        String password = "password";
        //WHEN
        boolean actual = PasswordValidation.has8CharsPlus(password);
        //THEN
        assertTrue(actual);
    }

    @Test
    public void has8CharsPlusTest_when12Chars_thenReturnTrue() {
        //GIVEN
        String password = "password1234";
        //WHEN
        boolean actual = PasswordValidation.has8CharsPlus(password);
        //THEN
        assertTrue(actual);
    }
}
