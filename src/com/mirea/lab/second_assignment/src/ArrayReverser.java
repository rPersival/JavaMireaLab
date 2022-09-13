package com.mirea.lab.second_assignment.src;

import java.util.Arrays;
import java.util.Collections;

public class ArrayReverser {
    public static <T> void reverse(T[] array) {
        Collections.reverse(Arrays.asList(array));
    }
}
