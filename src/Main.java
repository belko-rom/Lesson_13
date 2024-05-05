public class Main {
    public static void main(String[] args) {
       //
        try {
            User.doesDataMatch("username", "password123", "password123");
            System.out.println("Registration successful!");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }
    }
}