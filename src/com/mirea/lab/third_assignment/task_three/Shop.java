package com.mirea.lab.third_assignment.task_three;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop() {
        products = new ArrayList<>();
    }

    public void add(Product product) {
        products.add(product);
    }

    public void remove(Product product) {
        products.remove(product);
    }

    public void buyProduct(Product product, Rates rate) {
        System.out.println("Product " + product.getName() +
                " has been purchased for " + String.format("%.2f", product.getPriceInRate(rate)) + " " + rate.getName());
    }

    public void getProductList() {
        for (int i = 0; i < products.size(); i++)
            System.out.println("Product #" + (i + 1) + "\n" + products.get(i) + "\n");
    }
}
