package bankaccount;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String email;
        String phonenum;
        Account user = null;

        OUTER:
        while (true) {
            System.out.println("Welcome to Bank Management");
            System.out.println("1-Create Account \n2-Deposit Money \n3-Withdraw Money \n4-Exit");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (option) {
                case 1:
                    System.out.println("Register An Account ");
                    System.out.println("Enter your name:");
                    name = scanner.nextLine();
                    System.out.println("Enter your Email:");
                    email = scanner.nextLine();
                    System.out.println("Enter your Phone Number:");
                    phonenum = scanner.nextLine();

                    user = new Account("1234", 0.0, name, email, phonenum);
                    System.out.println("Account Created Successfully");
                    continue; 
                case 2:
                    if (user != null) {
                        System.out.println("Enter amount you want to deposit:");
                        double amount = scanner.nextDouble();
                        user.depositmoney(amount);
                    } else {
                        System.out.println("No account found, please create one first.");
                    }
                    break;
                case 3:
                    if (user != null) {
                        System.out.println("Enter amount you want to withdraw:");
                        double amount2 = scanner.nextDouble();
                        user.withdraw(amount2);
                    } else {
                        System.out.println("No account found, please create one first.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break OUTER;
                default:
                    System.out.println("Invalid option! Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
