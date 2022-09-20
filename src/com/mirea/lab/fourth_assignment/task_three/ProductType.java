package com.mirea.lab.fourth_assignment.task_three;

public enum ProductType {
    APP,
    BOOK,
    MOVIE,
    GAME;

    @Override
    public String toString() {
        switch (this) {
            case APP:
                return "App";

            case BOOK:
                return "Book";

            case MOVIE:
                return "Movie";

            case GAME:
                return "Game";
        }
        return "";
    }
}
