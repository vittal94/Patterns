package org.example.javaCode.flyweight.bookStore;

public record Book(
         String name,
         double price,
         BookType bookType
) {
}
