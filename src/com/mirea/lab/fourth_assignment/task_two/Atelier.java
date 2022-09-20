package com.mirea.lab.fourth_assignment.task_two;

import java.util.Arrays;
import java.util.List;

public class Atelier {

    public static void dressWoman(WomenClothing[] clothes) {
        Arrays.stream(clothes).forEach(WomenClothing::dressWoman);
    }

    public static void dressMan(MenClothing[] clothes) {
        Arrays.stream(clothes).forEach(MenClothing::dressMan);
    }

    public static void dressWoman(List<Clothes> clothes) {
        clothes.stream().filter(WomenClothing.class::isInstance)
                .map(WomenClothing.class::cast).forEach(WomenClothing::dressWoman);
    }

    public static void dressMan(List<Clothes> clothes) {
        clothes.stream().filter(MenClothing.class::isInstance)
                .map(MenClothing.class::cast).forEach(MenClothing::dressMan);
    }
}
