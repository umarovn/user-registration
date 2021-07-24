import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

    private List<User> users = new ArrayList<>();

    public void run() {
        while(true) {
            register();

            printUsers();

        }
    }

    private void register() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Email: ");
        String email = scan.nextLine();

        System.out.print("Password");
        String password = scan.nextLine();

        User user = new User(email, password);
        users.add(user);
    }



    private void printUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }
}
