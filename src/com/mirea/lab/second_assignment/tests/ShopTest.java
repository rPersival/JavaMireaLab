package com.mirea.lab.second_assignment.tests;

import com.mirea.lab.second_assignment.src.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {
    private IShop shop;

    @BeforeEach
    void createShop() {
        shop = new Shop();
    }

    @Test
    void shouldCorrectlyAddComputers() {
        List<Integer> computers = Arrays.asList(5, 9, 4);
        computers.forEach(shop::add);
        for (int i = 0; i < computers.size(); i++)
            assertEquals(computers.get(i), shop.searchByIndex(i));
    }

    @Test
    void shouldCorrectlyRemoveComputers() {
        List<Integer> computers = Arrays.asList(5, 9, 4);
        computers.forEach(shop::add);
        shop.remove(9);
        assertEquals(5, shop.searchByIndex(0));
        assertEquals(4, shop.searchByIndex(1));
        assertEquals(-1, shop.searchByIndex(2));
    }

    @Test
    void shouldCorrectlySearchByIndex() {
        List<Integer> computers = Arrays.asList(5, 9, 4);
        computers.forEach(shop::add);
        assertEquals(4, shop.searchByIndex(2));
    }

}