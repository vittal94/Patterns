package org.example.javaCode.iterator.graphIterator;

import java.util.ArrayList;
import java.util.List;

public class Vertex <T>{
    private List<Vertex<T>> neighbors;
    private T element;
    private boolean visited;

    public Vertex(T element) {
        this.element = element;
        neighbors = new ArrayList<>();
        visited = false;
    }

    public List<Vertex<T>> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Vertex<T>> neighbors) {
        this.neighbors = neighbors;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public String toString() {
        return " element=" + element ;
    }
}
