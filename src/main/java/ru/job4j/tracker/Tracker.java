package ru.job4j.tracker;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] tmp = new Item[items.length];
        for (int i = 0, j = 0; i < tmp.length; i++) {
            if (this.items[i] != null) {
                tmp[j++] = items[i];
            }
        }
        return tmp;
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[0];
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getName().equals(key)) {
                Item[] temp = new Item[result.length + 1];
                System.arraycopy(result, 0, temp, 0, result.length);
                temp[temp.length - 1] = items[i];
                result = temp;
            }
        }
        return result;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}