
package psa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin {
 
   private String username;
    private String password;
    private static List<Admin> admins = new ArrayList<>();

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String enteredUsername, String enteredPassword) {
        return username.equals(enteredUsername) && password.equals(enteredPassword);
    }

    public void addAdmin(String newUsername, String newPassword) {
        Admin newAdmin = new Admin(newUsername, newPassword);
        admins.add(newAdmin);
        System.out.println("Admin added successfully.");
    }

    public static List<Admin> getAdmins() {
        return admins;
    }

    // Your other methods...

    public static void main(String[] args) {
        // Create an initial admin
        Admin initialAdmin = new Admin("admin1", "password1");
        admins.add(initialAdmin);

        // Simulate login
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String enteredUsername = scanner.next();
        System.out.print("Enter password: ");
        String enteredPassword = scanner.next();

        Admin loggedInAdmin = initialAdmin; // Default to initial admin

        for (Admin admin : admins) {
            if (admin.login(enteredUsername, enteredPassword)) {
                loggedInAdmin = admin;
                break;
            }
        }

        if (loggedInAdmin.equals(initialAdmin)) {
            System.out.println("Login failed. Incorrect username or password.");
        } else {
            System.out.println("Login successful. You are now logged in as admin.");

            // Allow the logged-in admin to add another admin
            System.out.print("Do you want to add another admin? (yes/no): ");
            String addAnotherAdmin = scanner.next();

            if ("yes".equalsIgnoreCase(addAnotherAdmin)) {
                System.out.print("Enter new admin username: ");
                String newUsername = scanner.next();
                System.out.print("Enter new admin password: ");
                String newPassword = scanner.next();

                loggedInAdmin.addAdmin(newUsername, newPassword);
            }
        }
    }

    String getUsername() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
