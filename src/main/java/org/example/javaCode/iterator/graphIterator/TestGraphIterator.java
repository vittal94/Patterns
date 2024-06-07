package org.example.javaCode.iterator.graphIterator;

import java.util.ArrayList;
import java.util.Arrays;

public class TestGraphIterator {
    public static void main(String[] args) {
        Vertex<Integer> v0 = new Vertex<>(0);
        Vertex<Integer> v1 = new Vertex<>(1);
        Vertex<Integer> v2 = new Vertex<>(2);
        Vertex<Integer> v3 = new Vertex<>(3);
        Vertex<Integer> v4 = new Vertex<>(4);

        v0.setNeighbors( Arrays.asList(v1,v4));
        v1.setNeighbors( Arrays.asList(v2,v3,v4));

        DepthFirstSearchIterator<Integer> it  = new DepthFirstSearchIterator<>(v0);

        while (it.hasNext()) System.out.println(it.next());

    }
}
