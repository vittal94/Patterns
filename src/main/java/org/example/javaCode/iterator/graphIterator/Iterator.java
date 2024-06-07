package org.example.javaCode.iterator.graphIterator;

public interface Iterator<T> {
    boolean hasNext();
    Vertex<T> next();
    void reset();
}
