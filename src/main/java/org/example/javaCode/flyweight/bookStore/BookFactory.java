package org.example.javaCode.flyweight.bookStore;

import java.util.HashMap;
import java.util.Map;

public class BookFactory {
    private static final Map<String, BookType> bookTypes = new HashMap<>();
    public static BookType getBooktype(String type, String distributor, String otherData) {
        return bookTypes.computeIfAbsent(type, s -> new BookType(type,distributor,otherData));
    }
}
