package com.mirea.lab.third_assignment.task_three;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TaskThree {

    public static void start(Scanner scanner) {
        while (true) {
            System.out.println("Convert - 1");
            System.out.println("Generate reports - 2");
            System.out.print("Choose task [1,2]: ");
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    taskOne(scanner);
                    break;

                case 2:
                    taskTwo();
                    break;

                default:
                    return;
            }
        }
    }

    public static void taskOne(Scanner scanner) {
        Rates rate;
        List<Product> products = Arrays.asList(
                new Product("Coffee", 3),
                new Product("Tea", 2),
                new Product("Keyboard", 15)
        );
        System.out.println("RUB - 1");
        System.out.println("EUR - 2");
        System.out.println("USD - 3");
        System.out.println("Select rate: ");
        switch (scanner.nextInt()) {
            case 1:
                rate = Rates.RUB;
                break;
            case 2:
                rate = Rates.EUR;
                break;
            default:
                rate = Rates.USD;
                break;
        }
        Shop shop = new Shop();
        for (Product product : products)
            shop.add(product);
        shop.getProductList();
        System.out.println("Select product: ");
        int productNum = scanner.nextInt() - 1;
        if (productNum >= 0 && productNum < products.size())
            shop.buyProduct(products.get(productNum), rate);
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
