package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    static LocalDateTime item = Item.getCreated();

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = item.format(formatter);
        System.out.println("Текущие дата и время: " + item);
        System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat);
    }
}
