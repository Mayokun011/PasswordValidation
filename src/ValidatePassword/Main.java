package ValidatePassword;

public class Main {

    public static void main(String[] args) {


        String password = "omowunMI1234#";
        System.out.println(PasswordValidation.valPassword(password));
        System.out.println(PasswordValidation.hasSpecialCharacter(password));
       System.out.println(PasswordValidation.passwordStrenght(password));

    }

}
