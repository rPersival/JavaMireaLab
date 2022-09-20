package com.mirea.lab.fourth_assignment;

import com.mirea.lab.fourth_assignment.task_one.Season;
import com.mirea.lab.fourth_assignment.task_three.Authenticator;
import com.mirea.lab.fourth_assignment.task_three.Product;
import com.mirea.lab.fourth_assignment.task_three.Shop;
import com.mirea.lab.fourth_assignment.task_two.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Season task - 1");
            System.out.println("Atelier tasks - 2");
            System.out.println("Shop tasks - 3");
            System.out.print("Choose task set [1,2,3]: ");

            switch (scanner.nextInt()) {
                case 1:
                    Season.getInfo();
                    System.out.println("Summer - 1");
                    System.out.println("Autumn - 2");
                    System.out.println("Winter - 3");
                    System.out.println("Spring - 4");
                    System.out.println("Select your favourite season [1,2,3,4]: ");
                    Season season;
                    switch (scanner.nextInt()) {
                        case 1:
                            season = Season.SUMMER;
                            break;

                        case 2:
                            season = Season.AUTUMN;
                            break;

                        case 3:
                            season = Season.WINTER;
                            break;

                        default:
                        case 4:
                            season = Season.SPRING;
                            break;
                    }
                    Season.whatSeasonDoILove(season);
                    break;

                case 2:
                    System.out.print("Select your gender [M/W]: ");
                    scanner.nextLine();
                    boolean gender = scanner.nextLine().charAt(0) == 'M';
                    List<Clothes> clothes = selectClothes(gender, scanner);
                    System.out.print("\n");
                    if (gender) Atelier.dressMan(clothes);
                    else Atelier.dressWoman(clothes);
                    System.out.print("\n");
                    break;

                case 3:
                    taskThree(scanner);
                    break;

                default:
                    return;
            }
        }
    }

    private static ClothingSize getSize(Scanner scanner) {
        ClothingSize.getInfo();
        System.out.print("Select your size: ");
        ClothingSize size;
        scanner.nextLine();
        switch (scanner.nextLine()) {
            case "XXS":
                size = ClothingSize.XXS;
                break;

            case "XS":
                size = ClothingSize.XS;
                break;

            case "S":
                size = ClothingSize.S;
                break;

            case "M":
                size = ClothingSize.M;
                break;

            default:
            case "L":
                size = ClothingSize.L;
                break;
        }
        return size;
    }

    private static Clothes getClothesByNum(boolean gender, int num, Scanner scanner) {
        switch (num) {
            case 1:
                return new TShirt(getSize(scanner), 15.0d, "White");
            case 2:
                return new Pants(getSize(scanner), 25.0d, "Brown");
            case 3:
                return gender ? new Tie(getSize(scanner), 17.5d, "Blue") : new Skirt(getSize(scanner),
                        20.0d, "Black");
            default:
                return null;
        }
    }

    private static List<Clothes> selectClothes(boolean gender, Scanner scanner) {
        List<Clothes> clothes = new ArrayList<>();
        boolean[] selectedOptions = { false, false, false };
        while (true) {
            System.out.println("TShirt - 1");
            System.out.println("Pants - 2");
            System.out.println((gender ? "Tie" : "Skirt") + " - 3");
            System.out.print("Select your clothing (0 to stop selecting): ");
            int num = scanner.nextInt();
            if (num > 0 && num < 4) {
                if (selectedOptions[num - 1]) {
                    System.out.println("This clothing is already selected.");
                    continue;
                }
                selectedOptions[num - 1] = true;
            }
            Clothes clothing = getClothesByNum(gender, num, scanner);
            if (clothing == null) return clothes;
            clothes.add(clothing);
            System.out.println("Clothing has been added successfully!");
        }
    }

    private static void taskThree(Scanner scanner) {
        System.out.println("Registering new user. Please create a new login and password.");
        while (true) {
            scanner.nextLine();
            System.out.print("Login: ");
            String login = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();
            System.out.print("\n");
            if (Authenticator.register(login, password) && Authenticator.authorize(login, password)) break;
        }
        while (true) {
            List<Product> productList = Shop.getProductList();
            for (int i = 0; i < productList.size(); i++)
                System.out.println("Product #" + (i + 1) + "\n" + productList.get(i) + "\n");
            System.out.print("Choose product [1,2,3,4]: ");
            int selected = scanner.nextInt();
            if (selected > 0 && selected <= productList.size())
                Shop.addToCart(productList.get(selected - 1));
            else {
                Shop.buyAllProductsInCart();
                return;
            }
        }
    }
}
