package com.mirea.lab.second_assignment.src;

import java.util.ArrayList;
import java.util.List;

public class Shop implements IShop {
    private List<Integer> computers;

    public Shop() {
        this.computers = new ArrayList<Integer>();
    }

    @Override
    public void add(int computerId) {
        computers.add(computerId);
    }

    @Override
    public void remove(int computerId) {
        computers.remove(Integer.valueOf(computerId));
    }

    @Override
    public int searchByIndex(int computerIndex) {
        if (computerIndex > -1 && computerIndex < computers.size())
            return computers.get(computerIndex);
        return -1;
    }
}
