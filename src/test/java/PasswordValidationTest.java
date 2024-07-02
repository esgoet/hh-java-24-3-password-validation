import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidationTest {

    //Tests for Password Length Validation Method
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

    //Tests for Password Digit Validation Method
    @Test
    public void hasDigitsTest_whenNoDigits_thenReturnFalse() {
        //GIVEN
        String password = "password";
        //WHEN
        boolean actual = PasswordValidation.hasDigits(password);
        //THEN
        assertFalse(actual);
    }

    @Test
    public void hasDigitsTest_whenHasDigits_thenReturnTrue() {
        //GIVEN
        String password = "password1234";
        //WHEN
        boolean actual = PasswordValidation.hasDigits(password);
        //THEN
        assertTrue(actual);
    }

    //Tests for Password Lower- and Uppercase Validation Method
    @Test
    public void hasUpperAndLowerCaseCharsTest_whenpassword_thenReturnFalse() {
        //GIVEN
        String password = "password";
        //WHEN
        boolean actual = PasswordValidation.hasUpperAndLowerCaseChars(password);
        //THEN
        assertFalse(actual);
    }
    @Test
    public void hasUpperAndLowerCaseCharsTest_whenPASSWORD_thenReturnFalse() {
        //GIVEN
        String password = "PASSWORD";
        //WHEN
        boolean actual = PasswordValidation.hasUpperAndLowerCaseChars(password);
        //THEN
        assertFalse(actual);

    }

    @Test
    public void hasUpperAndLowerCaseCharsTest_whenPassword_thenReturnTrue() {
        //GIVEN
        String password = "Password";
        //WHEN
        boolean actual = PasswordValidation.hasUpperAndLowerCaseChars(password);
        //THEN
        assertTrue(actual);
    }

    @Test
    public void hasLowerAndUpperCaseCharsTest_when1234_thenReturnFalse() {
        //GIVEN
        String password = "1234";
        //WHEN
        boolean actual = PasswordValidation.hasUpperAndLowerCaseChars(password);
        //THEN
        assertFalse(actual);
    }
}
