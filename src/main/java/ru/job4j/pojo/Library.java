package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Гарри", 1);
        Book book1 = new Book("Clean code", 2);
        Book book2 = new Book("Джунгли", 3);
        Book book3 = new Book("Маугли", 4);
        Book[] books = new Book[4];
        books[0] = book;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " № " + bk.getCout());
        }
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " № " + bk.getCout());
        }
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (bk.getName() == "Clean code") {
                System.out.println(bk.getName() + " № " + bk.getCout());
            }
        }
    }

}
