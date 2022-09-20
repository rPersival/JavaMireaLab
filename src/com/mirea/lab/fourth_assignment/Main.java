package com.mirea.lab.fourth_assignment;

import com.mirea.lab.Selector;
import com.mirea.lab.fourth_assignment.task_four.Computer;
import com.mirea.lab.fourth_assignment.task_four.ComputerBuilder;
import com.mirea.lab.fourth_assignment.task_four.components.*;
import com.mirea.lab.fourth_assignment.task_four.manufacturers.*;
import com.mirea.lab.fourth_assignment.task_one.Season;
import com.mirea.lab.fourth_assignment.task_three.Authenticator;
import com.mirea.lab.fourth_assignment.task_three.Product;
import com.mirea.lab.fourth_assignment.task_three.Shop;
import com.mirea.lab.fourth_assignment.task_two.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Selector.selectTaskScanner(scanner,
                "Season task - 1\nAtelier tasks - 2\nShop tasks - 3\nBuild PC of your dreams (not quite tho) - 4",
                Main::taskOne,
                Main::taskTwo,
                Main::taskThree,
                Main::taskFour);
    }

    private static ClothingSize getSize(Scanner scanner) {
        ClothingSize.getInfo();
        System.out.print("Choose clothing size: ");
        return ClothingSize.getByName(scanner.nextLine());
    }

    private static List<Clothes> selectClothes(boolean gender, Scanner scanner) {

        List<String> info = new ArrayList<>(Arrays.asList(
               "TShirt",
               "Pants",
               gender ? "Tie" : "Skirt"
        ));

        ClothingSize size = getSize(scanner);

        return Selector.multiSelect(scanner, info,
                x -> System.out.println("Clothing has been added successfully!"), "Select your clothing",
                new TShirt(size, 15.0d, "White"),
                new Pants(size, 25.0d, "Brown"),
                gender ? new Tie(size, 17.5d, "Blue") :
                        new Skirt(size, 20.0d, "Black"));

    }

    private static void taskOne(Scanner scanner) {
        Season.getInfo();
        System.out.println("Summer - 1");
        System.out.println("Autumn - 2");
        System.out.println("Winter - 3");
        System.out.println("Spring - 4");
        System.out.print("Select your favourite season [1,2,3,4]: ");
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
    }

    private static void taskTwo(Scanner scanner) {
        System.out.print("Select your gender [M/W]: ");
        boolean gender = scanner.nextLine().charAt(0) == 'M';
        List<Clothes> clothes = selectClothes(gender, scanner);
        System.out.print("\n");
        if (gender) Atelier.dressMan(clothes);
        else Atelier.dressWoman(clothes);
        System.out.print("\n");
    }

    private static void taskThree(Scanner scanner) {
        System.out.println("Registering new user. Please create a new login and password.");
        while (true) {
            System.out.print("Login: ");
            String login = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();
            System.out.print("\n");
            if (Authenticator.register(login, password) && Authenticator.authorize(login, password)) break;
        }

        Selector.multiSelect(scanner, "Select product", Shop::addToCart,
                Shop.getProductList().toArray(new Product[0]));
        Shop.buyAllProductsInCart();
    }

    private static void taskFour(Scanner scanner) {
        System.out.println("Here, I build a PC for you: ");
        Computer gamingPC = Computer.createBuilder()
                .setCPU(new CPU(CPUManufacturer.AMD,
                4.7d, 105, 8, "AM4", "AMD Ryzen 7 5800x"))
                .setGPU(new GPU(GPUManufacturer.MSI, "PCI x16 3.0", 6144, "MSI GAMING X 1660 ti"))
                .setMemory(new ArrayList<>(Arrays.asList(
                        new RAM(RAMManufacturer.Kingston, 3200, 8192,
                                "Kingston FURY Beast Black"),
                        new RAM(RAMManufacturer.Kingston, 3200, 8192,
                                "Kingston FURY Beast Black"))))
                .setStorageDevices(new ArrayList<>(Arrays.asList(
                        new HDD(2048, 180, HDDManufacturer.WesternDigital,
                                "WD Red IntelliPower 2 TB"),
                        new SSD(480, 500, SSDManufacturer.Kingston,
                                "Kingston A400 480 GB")
                )))
                .setMotherboard(new Motherboard(MotherboardManufacturer.MSI, "AM4", "Standard-ATX",
                        "B550", "MSI MAG B550 TOMAHAWK")).build();
        gamingPC.getInfo();
    }
}
