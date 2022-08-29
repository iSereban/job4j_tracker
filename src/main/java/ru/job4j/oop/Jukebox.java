package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {

        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox jakebox1 = new Jukebox();
        jakebox1.music(1);
        Jukebox jakebox2 = new Jukebox();
        jakebox2.music(2);
        Jukebox jakebox3 = new Jukebox();
        jakebox3.music(3);

    }
}
