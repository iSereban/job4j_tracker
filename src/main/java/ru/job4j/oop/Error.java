package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Много мониторов: " + active);
        System.out.println("SSD: " + status + " GB");
        System.out.println("Модель CPU: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error error1 = new Error(true, 10, "Hello!");
        error1.printInfo();
    }
}
