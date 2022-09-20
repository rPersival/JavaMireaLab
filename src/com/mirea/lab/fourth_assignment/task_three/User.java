package com.mirea.lab.fourth_assignment.task_three;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String login;
    private String password;
    private final List<Product> cart;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        cart = new ArrayList<>();
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }

    public void addToCart(Product product) {
        cart.add(product);
    }

    public void removeFromCart(Product product) {
        cart.remove(product);
    }

    public List<Product> getCart() {
        return cart;
    }
}
