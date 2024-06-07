package org.example.javaCode.iterator.graphIterator;

import java.util.Deque;
import java.util.LinkedList;

public class DepthFirstSearchIterator<T> implements Iterator<T>{
    private final Vertex<T> startVertex;
    private Deque<Vertex<T>> stack = new LinkedList<>();

    public DepthFirstSearchIterator(Vertex<T> startVertex) {
        this.startVertex = startVertex;
        stack.push(startVertex);
    }
    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Vertex<T> next() {
        if(!hasNext()) return null;

        Vertex<T> current = stack.pop();
        if(!current.isVisited()) {
            current.setVisited(true);
            current.getNeighbors().forEach(stack::push);
            return current;
        }
        return next();
    }

    @Override
    public void reset() {
       stack.clear();
       stack.push(startVertex);
    }
}
