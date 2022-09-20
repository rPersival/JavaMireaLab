package com.mirea.lab.fourth_assignment.task_three;

import java.util.HashMap;
import java.util.Map;

public class Authenticator {
    private final static Map<String, User> auth = new HashMap<>();
    private static User authorizedUser = null;

    public static User getAuthorizedUser() {
        return authorizedUser;
    }

    public static boolean register(String login, String password) {
        if (isAuthorized()) {
            System.out.println("You should logout before registering");
            return false;
        }
        if (auth.containsKey(login)) {
            System.out.println("This login is claimed by another user");
            return false;
        }
        auth.putIfAbsent(login, new User(login, password));
        return true;
    }

    public static boolean authorize(String login, String password) {
        if (isAuthorized()) {
            System.out.println("You should logout before authorizing");
            return false;
        }
        if (auth.containsKey(login)) {
            User user = auth.get(login);
            if (user.getPassword().equals(password)) {
                authorizedUser = user;
                return true;
            }
            System.out.println("Wrong password");
        }
        else
            System.out.println("Wrong login");
        return false;
    }

    public static void logOut() {
        authorizedUser = null;
    }

    public static boolean isAuthorized() {
        return authorizedUser != null;
    }
}
