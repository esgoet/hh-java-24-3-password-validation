public class PasswordValidation {
    public static void main(String[] args) {

    }

    // Password Length (8 or more letters) Validation
    public static boolean has8CharsPlus(String pw) {
        return pw.length() >= 8;
    }

    // Password Digit Validation
    public static boolean hasDigits(String pw) {
        for (int i = 0; i <= 9; i++) {
            if (pw.contains(String.valueOf(i))) { return true; }
        }
        return false;
    }

    //Password Letter Case Validation
    public static boolean hasUpperAndLowerCaseChars(String pw) {
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        for (int i = 0; i < pw.length(); i++) {
           if (Character.isLowerCase(pw.charAt(i))) {
               hasLowerCase = true;
           } else if (Character.isUpperCase(pw.charAt(i))) {
               hasUpperCase = true;
           }
        }
        return hasUpperCase && hasLowerCase;
    }

}
