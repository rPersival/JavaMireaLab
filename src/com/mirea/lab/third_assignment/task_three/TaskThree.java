package com.mirea.lab.third_assignment.task_three;

import com.mirea.lab.Selector;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TaskThree {

    public static void start(Scanner scanner) {
        Selector.selectTask(scanner, "Convert tasks (0 to exit)\nConvert - 1\nGenerate reports - 2",
                () -> taskOne(scanner), TaskThree::taskTwo);
    }

    public static void taskOne(Scanner scanner) {
        Rates rate;
        List<Product> products = Arrays.asList(
                new Product("Coffee", 3),
                new Product("Tea", 2),
                new Product("Keyboard", 15)
        );

        rate = Selector.selectOrDefault(scanner, Rates.USD,"RUB - 1\nEUR - 2\nUSD - 3", "Select rate",
                Rates.RUB, Rates.EUR, Rates.USD);
        Shop shop = new Shop();
        for (Product product : products)
            shop.add(product);
        shop.getProductList();
        Product product = Selector.select(scanner, null, "Select product", products.toArray(new Product[0]));
        if (product != null)
            shop.buyProduct(product, rate);
    }

    public static void taskTwo() {
        List<Employee> employees = Arrays.asList(
                new Employee("Employee #1", 85000),
                new Employee("Employee #2", 240000),
                new Employee("Employee #3", 112500)
        );
        Report.generateReport(employees);
    }
}
