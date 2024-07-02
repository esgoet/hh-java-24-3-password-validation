import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidationTest {

    //Tests for Password Length Validation Method
    @Test
    public void has8CharsPlusTest_whenPasswor_thenReturnFalse() {
        //GIVEN
        String password = "Passwor";
        //WHEN
        boolean actual = PasswordValidation.has8CharsPlus(password);
        //THEN
        assertFalse(actual);
    }

    @Test
    public void has8CharsPlusTest_whenPassword_thenReturnTrue() {
        //GIVEN
        String password = "Password";
        //WHEN
        boolean actual = PasswordValidation.has8CharsPlus(password);
        //THEN
        assertTrue(actual);
    }

    @Test
    public void has8CharsPlusTest_whenPassword1234_thenReturnTrue() {
        //GIVEN
        String password = "Password1234";
        //WHEN
        boolean actual = PasswordValidation.has8CharsPlus(password);
        //THEN
        assertTrue(actual);
    }

    //Tests for Password Digit Validation Method
    @Test
    public void hasDigitsTest_whenPassword_thenReturnFalse() {
        //GIVEN
        String password = "Password";
        //WHEN
        boolean actual = PasswordValidation.hasDigits(password);
        //THEN
        assertFalse(actual);
    }

    @Test
    public void hasDigitsTest_whenPassword1234_thenReturnTrue() {
        //GIVEN
        String password = "Password1234";
        //WHEN
        boolean actual = PasswordValidation.hasDigits(password);
        //THEN
        assertTrue(actual);
    }

    @Test
    public void hasDigitsTest_when1234_thenReturnTrue() {
        //GIVEN
        String password = "1234";
        //WHEN
        boolean actual = PasswordValidation.hasDigits(password);
        //THEN
        assertTrue(actual);
    }

    //Tests for Password Letter Case Validation Method
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
