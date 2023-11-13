package ValidatePassword;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {


    /*
    Password has at least 8 characters
    Password has at least 1 cap
    Password has at least one lower case
    Password has at least one number
     */
    public static boolean valPassword(String password) {
        if (password.length() > 7) {
            if (checkPassword(password)) {
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println("Not Strong");
            return false;
        }
    }

    public static boolean checkPassword(String password) {
        boolean hasNum = false;
        boolean hasCap = false;
        boolean hasLow = false;
        char c;
        for (int i = 0; i < password.length(); i++) {

            c = password.charAt(i);
            if (Character.isDigit(c)) {
                hasNum = true;
            } else if (Character.isUpperCase(c)) {
                hasCap = true;
            } else if (Character.isLowerCase(c)) {
                hasLow = true;
            }
            if (hasNum && hasCap && hasLow) {
                return true;
            }
        }
        return false;
    }

    // Convert the password to a character Array
    public static boolean isSpace(String password) {
        for (char currentChar : password.toCharArray()) {
            if (Character.isWhitespace(currentChar)) {
                return true;
            }
        }
        return false;
    }

    // Has Special Character
    public static boolean hasSpecialCharacter(String password) {

        // to detect if a string has no special character
        Pattern sPattern = Pattern.compile("(a-zA-ZO-9)*");
        Matcher sMartcher = sPattern.matcher(password);

        if (!sMartcher.matches()) {
            return true;
        }
        return false;
    }

    // Checking Strenght of the Password
    public static int passwordStrenght(String password){

        int score = 0;
        int lenght = password.length();
        if(lenght >= 8 && lenght <= 10){
            score += 1;
        }
    else if (lenght >= 11 && lenght <= 15) {
        score += 2;
        } else if(lenght >= 16){
        score += 3;
        }
    if (password.matches("(?=.*[a-z]).*"));{
        score++;
        } if (password.matches("(?=.*[A-Z]).*"));{
            score++;
        } if (password.matches("(?=.*[0-9]).*"));{
            score++;
        } if (password.matches("(?=.*[!@#$%^&*]).*")){
            score++;
        }
        return score;
    }

    }
