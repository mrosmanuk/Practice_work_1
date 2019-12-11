package model;

public class UserT2 {
    private static String userName;
    private static String userPassword;

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        UserT2.userName = userName;
    }

    public static String getUserPassword() {
        return userPassword;
    }

    public static void setUserPassword(String userPassword) {
        UserT2.userPassword = userPassword;
    }
}
