public class PasswordValidation {
    public static void main(String[] args) {

    }

    public static boolean has8CharsPlus(String pw) {
        return pw.length() >= 8;
    }

    public static boolean hasDigits(String pw) {
        for (int i = 0; i < 9; i++) {
            if (pw.contains(String.valueOf(i))) { return true; }
        }
        return false;
    }


}
