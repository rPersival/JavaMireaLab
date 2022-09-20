package com.mirea.lab.fourth_assignment.task_three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shop {

    private static final List<Product> productList  = new ArrayList<>(Arrays.asList(
            new Product(ProductType.APP, "Calculator", 3.00d),
            new Product(ProductType.BOOK, "1984", 5.00d),
            new Product(ProductType.MOVIE, "Breaking Bad", 10.00d),
            new Product(ProductType.GAME, "Escape From Tarkov", 30.00d)
    ));

    public static void addToCart(Product product) {
        if (!Authenticator.isAuthorized()) {
            System.out.println("Please authorize before buying products");
            return;
        }

        User user = Authenticator.getAuthorizedUser();
        user.addToCart(product);
        System.out.println("User with login \"" + user.getLogin() + "\" added to cart product \""
                + product.getName() + "\"");
    }

    public static void buyAllProductsInCart() {
        if (!Authenticator.isAuthorized()) {
            System.out.println("Please authorize before buying products");
            return;
        }

        User user = Authenticator.getAuthorizedUser();
        List<Product> cart = user.getCart();
        if (cart.size() == 0) {
            System.out.println("Cart is empty");
            return;
        }
        double price = cart.stream().mapToDouble(Product::getPrice).sum();
        System.out.print("User with login \"" + user.getLogin() + "\" bought products: ");
        cart.forEach(x -> System.out.print("\"" + x.getName() + "\", "));
        System.out.println("for " + price + "$");
    }

    public static List<Product> getProductList() {
        return productList;
    }
}
