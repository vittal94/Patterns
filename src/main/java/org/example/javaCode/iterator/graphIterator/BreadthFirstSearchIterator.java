package org.example.javaCode.iterator.graphIterator;

import java.util.Deque;
import java.util.LinkedList;

public class BreadthFirstSearchIterator<T> implements Iterator{
    private Vertex<T> startVertex;
    private Deque<Vertex<T>> stack = new LinkedList<>();
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Vertex next() {
        return null;
    }

    @Override
    public void reset() {

    }
}
