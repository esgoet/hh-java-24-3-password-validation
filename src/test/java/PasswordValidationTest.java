import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidationTest {

    //Tests for Password Length Validation Method
    @Test
    public void has8CharsPlusTest_whenEmpty_thenReturnFalse() {
        //GIVEN
        String password = "";
        //WHEN
        boolean actual = PasswordValidation.has8CharsPlus(password);
        //THEN
        assertFalse(actual);
    }
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
    public void hasDigitsTest_when9_thenReturnTrue() {
        //GIVEN
        String password = "9";
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

    //Tests for Not Common Password Method
    @Test
    public void isNotCommonTest_whenPassword1_thenReturnFalse() {
        //GIVEN
        String password = "Password1";
        //WHEN
        boolean actual = PasswordValidation.isNotCommon(password);
        //THEN
        assertFalse(actual);
    }
    @Test
    public void isNotCommonTest_whenAa345678_thenReturnFalse() {
        //GIVEN
        String password = "Aa345678";
        //WHEN
        boolean actual = PasswordValidation.isNotCommon(password);
        //THEN
        assertFalse(actual);
    }
    @Test
    public void isNotCommonTest_whenHello9876_thenReturnFalse() {
        //GIVEN
        String password = "Hello9876";
        //WHEN
        boolean actual = PasswordValidation.isNotCommon(password);
        //THEN
        assertFalse(actual);
    }
    @Test
    public void isNotCommonTest_when12Hello34_thenReturnTrue() {
        //GIVEN
        String password = "12Hello34";
        //WHEN
        boolean actual = PasswordValidation.isNotCommon(password);
        //THEN
        assertTrue(actual);
    }
    @Test
    public void isNotCommonTest_whenNotC0mm0nPW_thenReturnTrue() {
        //GIVEN
        String password = "NotC0mm0nPW";
        //WHEN
        boolean actual = PasswordValidation.isNotCommon(password);
        //THEN
        assertTrue(actual);
    }

    // Tests for Password Special Character Validation Method
    @Test
    public void hasSpecialChars_whenPassword1_thenReturnFalse() {
        //GIVEN
        String password = "Password1";
        //WHEN
        boolean actual = PasswordValidation.hasSpecialChars(password);
        //THEN
        assertFalse(actual);
    }
    @Test
    public void hasSpecialChars_whenPassword1$_thenReturnTrue() {
        //GIVEN
        String password = "Password1$";
        //WHEN
        boolean actual = PasswordValidation.hasSpecialChars(password);
        //THEN
        assertTrue(actual);
    }

    // Tests for Strong Password Generator
    @Test
    public void generateStrongPassword_whenDoneTwice_thenReturnDifferentPasswords() {
        //GIVEN
        //WHEN
        String pw1 = PasswordValidation.generateStrongPassword();
        String pw2 = PasswordValidation.generateStrongPassword();
        //THEN
        assertNotEquals(pw1, pw2);
    }

}
