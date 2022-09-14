package com.mirea.lab.second_assignment.src;

public interface IShop {
    void add(int computerId);
    void remove(int computerId);
    int searchByIndex(int computerIndex);
}