package com.example.codepath_wishlist;

public class recyclerJoin{
String name;
String price;
String store;


    public recyclerJoin(String name, String price, String store) {
        this.name = name;
        this.price = price;
        this.store = store;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getStore() {
        return store;
    }
}
