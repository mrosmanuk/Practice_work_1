package secondTest.model;

public class User {
    private static String userName;
    private static String userPassword;

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        User.userName = userName;
    }

    public static String getUserPassword() {
        return userPassword;
    }

    public static void setUserPassword(String userPassword) {
        User.userPassword = userPassword;
    }
}
