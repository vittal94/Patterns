package org.example.javaCode.flyweight.bookStore;

import java.util.Random;
import java.util.stream.IntStream;

public class TestBookStore {
    public static void run() {
        Store store = new Store();

        for(int i = 0; i < 1000; i++) {
            store.storeBook(getRandomName(),getRandomPrice(),"Action","Follett", "Stuff");
            store.storeBook(getRandomName(),getRandomPrice(),"Fantasy","Ingram", "Extra");
        }

        store.displayBooks();

    }

    private static String getRandomName() {
        var result = new StringBuilder();
        var size = (int) (Math.random() * 5) + 3;

        for(int i = 0; i < size; i++) {
            var rand = (int) (Math.random() * 25) + 97;
            result.append((char) rand);
        }
        result.setCharAt(0,Character.toUpperCase(result.charAt(0)));
        return result.toString();
    }

    private static double getRandomPrice() {
       return (Math.random() * 200) + 20;
    }
}
