package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        Item items = new Item();
        Item itemsSecond = new Item();
        LocalDateTime item = items.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = item.format(formatter);
        System.out.println("Текущие дата и время: " + item);
        System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat);
        System.out.println(itemsSecond);
    }
}
