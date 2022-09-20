package com.mirea.lab;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Selector {

    @SafeVarargs
    public static <T> T selectOrDefault(Scanner scanner, T def, String info, String selectorName, T... args) {
        int max = args.length;
        int selected = Selector.getInfo(scanner, info, selectorName, max);
        if (selected > 0 && selected < max + 1)
            return args[selected - 1];
        else return def;
    }

    @SafeVarargs
    public static <T> T select(Scanner scanner, String info, String selectorName, T... args) {
        return selectOrDefault(scanner, null, info, selectorName, args);
    }

    @SafeVarargs
    public static boolean selectScanner(Scanner scanner, String info, String selectorName,
                                        Consumer<Scanner>... args) {
        int max = args.length;
        int selected = Selector.getInfo(scanner, info, selectorName, max);
        if (selected > 0 && selected < max + 1) {
            args[selected - 1].accept(scanner);
            return true;
        }
        return false;
    }

    @SafeVarargs
    public static void selectTaskScanner(Scanner scanner, String info, Consumer<Scanner>... args) {
        while (selectScanner(scanner, info, "Choose task", args))
            System.out.print("\n");
    }

    @SafeVarargs
    public static <T> List<T> multiSelect(Scanner scanner, String selectorName, T... args) {
        return multiSelect(scanner, Arrays.stream(args).map(T::toString).collect(Collectors.toList()), null,
                selectorName, args);
    }

    @SafeVarargs
    public static <T> List<T> multiSelect(Scanner scanner, String selectorName, Consumer<T> func, T... args) {
        return multiSelect(scanner, Arrays.stream(args).map(T::toString).collect(Collectors.toList()), func,
                selectorName, args);
    }

    @SafeVarargs
    public static <T> List<T> multiSelect(Scanner scanner, List<String> info, Consumer<T> func, String selectorName,
                                          T... args) {
        int currentMax = args.length;
        if (info.size() != currentMax) return null;
        List<T> currentSelect = new ArrayList<>();
        List<T> list = Arrays.stream(args).collect(Collectors.toList());

        while (true) {
            if (currentMax < 1) return currentSelect;
            for (int i = 0; i < info.size(); i++)
                System.out.println(info.get(i) + " " + (i + 1));
            int selected = getShortInfo(scanner, selectorName, currentMax);
            if (selected < 1 || selected > currentMax) return currentSelect;
            T selectedT = list.remove(selected - 1);
            if (func != null)
                func.accept(selectedT);
            currentSelect.add(selectedT);
            info.remove(selected - 1);
            currentMax = list.size();
        }
    }

    public static void selectTask(Scanner scanner, String info, Runnable... args) {
        while (select(scanner, info, "Choose task", args))
            System.out.print("\n");
    }

    public static boolean select(Scanner scanner, String info, String selectorName,
                                 Runnable... args) {
        int max = args.length;
        int selected = Selector.getInfo(scanner, info, selectorName, max);
        if (selected > 0 && selected < max + 1) {
            args[selected - 1].run();
            return true;
        }
        return false;
    }

    private static int getInfo(Scanner scanner, String info, String selectorName, int max) {
        if (info != null)
            System.out.println(info);
        return getShortInfo(scanner, selectorName, max);
    }

    private static int getShortInfo(Scanner scanner, String selectorName, int max) {
        StringBuilder choosing = new StringBuilder(selectorName + " [");
        for (int i = 0; i < max; i++) {
            choosing.append(i + 1);
            if (i != max - 1)
                choosing.append(",");
        }
        choosing.append("]: ");
        System.out.print(choosing);
        int selected = scanner.nextInt();
        scanner.nextLine();
        return selected;
    }
}
