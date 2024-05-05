public class User {
    public static boolean doesDataMatch(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException{
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("incorrect login");
        }
        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException("incorrect password");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("password and password confirmation do not match");
        }
        return true;

    }
}
