import java.util.Scanner;

/**
 * Controller Class
 * has an option to enter a username and a password
 * the password will be checked with PasswordCheck class/method
 * there is also a button below to sign up
 */

public class LoginPage {
    public String[] login() {
        String [] account = new String[2];
        Scanner scanner = new Scanner(System.in); // scanner
        System.out.println("Please enter your username.");
        account[0] = scanner.nextLine();
        System.out.println("Please enter your password.");
        account[1] = scanner.nextLine();
        return account;
        // add password check
    }
}
