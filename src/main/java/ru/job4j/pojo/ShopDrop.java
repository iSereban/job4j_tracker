package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                for (int y = i; y < products.length - 1; y++) {
                    if (products[y + 1] != null) {
                        products[i] = products[y + 1];
                        products[y + 1] = null;
                        break;
                    }
                }
            }
        }
        return products;
    }
}