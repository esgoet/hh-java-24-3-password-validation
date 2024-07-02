import java.util.Arrays;

public class PasswordValidation {
    public static void main(String[] args) {
        System.out.println(generateStrongPassword());
    }

    public static String generateStrongPassword() {
        String password = "";

        // if it does not meet requirements for strong password, regenerate
        while (!isStrongPassword(password)) {
            // get a random Length for the password between 8 and 16 letters
            int randLength = (int)(Math.random()*(16-8)) + 8;
            char[] passwordChars = new char[randLength];

            // for randLength times
            // generate random Char from char set including uppercase, lowercase, digits and symbols
            for (int i = 0; i < randLength; i++) {
                char randomChar = (char)((Math.random()*(126-33))+33);
                passwordChars[i] = randomChar;
            }
            password = new String(passwordChars);
        }
        return password;
    }

    public static boolean isStrongPassword(String pw) {
        return has8CharsPlus(pw) && hasDigits(pw) && hasUpperAndLowerCaseChars(pw) && isNotCommon(pw) && hasSpecialChars(pw);
    }

    // Password Length (8 or more letters) Validation
    public static boolean has8CharsPlus(String pw) {
        return pw.length() >= 8;
    }

    // Password Digit Validation
    public static boolean hasDigits(String pw) {
        return pw.matches(".*[0-9].*");
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

    //Password Non-Simplicity Validation
    public static boolean isNotCommon(String pw) {
        //check if pw contains an ascending or descending digit sequence, or just one number
        //get all Digits
        boolean hasSequence = false;
        boolean hasOneDigit = false;

        // extract only digits from the string
        String noCharString = pw.replaceAll("[^0-9]", ",");
        String[] sequenceStrings = noCharString.split("[,]");

        //  if there is more than 1 sequence, the password is not common
        String digitString = "";
        int sequenceCount = 0;
        for (String digits : sequenceStrings) {
            if (!digits.isEmpty()) {
                sequenceCount++;
                if (sequenceCount > 1) {
                    return true;
                } else {
                    digitString = digits;
                }
            }
        }

        // turn string into an int array
        int[] digits = new int[digitString.length()];
        for (int i = 0; i < digitString.length(); i++) {
            digits[i] = Integer.parseInt(String.valueOf(digitString.charAt(i)));
        }

        //check how many digits there are
        if (digits.length == 1) {
            hasOneDigit = true;
        } else {
            // check for ascending sequence
            int[] sortedDigits = Arrays.copyOf(digits, digits.length);
            Arrays.sort(sortedDigits);
            int[] reversedDigits = Arrays.copyOf(sortedDigits, sortedDigits.length);
            // check for descending sequence
            for (int i = 0; i < reversedDigits.length / 2; i++) {
                int temp = reversedDigits[i];
                reversedDigits[i] = reversedDigits[reversedDigits.length - 1 - i];
                reversedDigits[reversedDigits.length - 1 - i] = temp;
            }
            if (Arrays.equals(digits, sortedDigits) || Arrays.equals(digits, reversedDigits)) {
                hasSequence = true;
            }
        }

        //check whether a common word is used
        String[] commonWords = {"password", "aa", "hello"};
        boolean isCommonWord = false;
        String noDigitString = pw.replaceAll("[0-9]", ",");
        //make sure that if a common word is used, it was not prior interrupted by a number
        String[] wordStrings = noDigitString.split("[,]");
        for (String wordString : wordStrings) {
            for (String word : commonWords) {
                if (wordString.toLowerCase().equals(word)) {
                    isCommonWord = true;
                    break;
                }
            }
        }
        //check if common words are used in combination with digit sequence or just one number
        return !(isCommonWord && hasOneDigit || isCommonWord && hasSequence);
    }

    //Password Special Characters Validation
    public static boolean hasSpecialChars(String pw) {
        //remove all alphabetical letters and digits from the string
        String specialCharString = pw.replaceAll("[a-zA-Z0-9]", "");

        return !specialCharString.isEmpty();
    }
}
