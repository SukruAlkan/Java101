import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        String userName, password;
        String dUserName = "admin", dPassword = "password";
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("username:");
                userName = input.nextLine();

                System.out.print("password:");
                password = input.nextLine();

                if (userName.equals(dUserName) && password.equals(dPassword)) {
                    System.out.println("You're Welcome!");
                    break;
                } else {
                    System.out.println("This account doesn't have a password.\nPlease use the Reset Password link below.");
                    System.out.println("Reset -> R  && Quit ->Q");
                    System.out.print("Make your choice: ");
                    String choice = input.nextLine();
                    switch (choice) {
                        case "R":
                            System.out.print("New Password: ");
                            dPassword = input.nextLine();
                            break;
                        case "Q":
                            System.out.println("Goodbye");
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + choice);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
