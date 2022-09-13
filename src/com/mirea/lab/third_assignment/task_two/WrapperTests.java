package com.mirea.lab.third_assignment.task_two;

public class WrapperTests {

    public static void taskOne() {
        Double num = Double.valueOf(1.2323);
        System.out.println(num);
    }

    public static void taskTwo() {
        Double num = Double.parseDouble("1.2323");
        System.out.println(num);
    }

    public static void taskThree() {
        Double num = 1.2323;
        int intNum = num.intValue();
        byte byteNum = num.byteValue();
        short shortNum = num.shortValue();
        long longNum = num.longValue();
        float floatNum = num.floatValue();
        double doubleNum = num.doubleValue();
        boolean boolNum = num > 0;
        char character = num.toString().charAt(0);
        Byte b = 0;
        Character c = 'e';
        Float fl = 1.02f;
        Integer ii = 15;
        Long l = 123L;
        Short sh = 9;
        System.out.println(intNum);
        System.out.println(byteNum);
        System.out.println(shortNum);
        System.out.println(longNum);
        System.out.println(floatNum);
        System.out.println(doubleNum);
        System.out.println(boolNum);
        System.out.println(character);
    }

    public static void taskFour() {
        String str = Double.toString(1.2323);
        System.out.println(str);
    }
}
