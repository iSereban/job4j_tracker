package ru.job4j.pojo;

public class Book {
    private String name;
    private int cout;

    public Book(String name, int cout) {
        this.name = name;
        this.cout = cout;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCout() {
        return cout;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }
}
