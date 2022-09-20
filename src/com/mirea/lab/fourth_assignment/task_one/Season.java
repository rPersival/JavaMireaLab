package com.mirea.lab.fourth_assignment.task_one;

public enum Season {
    SUMMER(71.9),
    AUTUMN(53.9),
    WINTER(33.2),
    SPRING(52.6);

    private final double averageTemperature;

    Season(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        if (this == Season.SUMMER)
            return "warm season";
        return "cold season";
    }

    public String getSeasonName() {
        switch (this) {
            case SUMMER:
                return "summer";

            case AUTUMN:
                return "autumn";

            case WINTER:
                return "winter";

            case SPRING:
                return "spring";
        }
        return "";
    }

    public static void whatSeasonDoILove(Season season) {
        System.out.println("I love " + season.getSeasonName() + "!\nThis is a " + season.getDescription());
    }

    public static void getInfo() {
        for (Season season : values())
            System.out.println("Season: " + season.getSeasonName() + "\nAverage temperature: " +
                    season.getAverageTemperature() + " °F\nThis is a " + season.getDescription() + ".\n");
    }
}
