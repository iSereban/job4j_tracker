package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        products[index] = null;
        products[index] = null;
        for (int i = index; i < products.length - 1; i++) {
            Product product = products[i + 1];
            if (product != null) {
                products[i] = products[i + 1];
            } else {
                System.out.println("null");
            }
        }
        products[products.length - 1] = null;
        return products;
    }
}