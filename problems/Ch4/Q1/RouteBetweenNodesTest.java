package Q1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RouteBetweenNodesTest {
    @Test
    public void isRoute_shouldReturnTrue_whenThereIsARoute() {
        Graph graph = new Graph();
        Node n1 = graph.addNode(1);
        Node n2 = graph.addNode(2);
        Node n3 = graph.addNode(3);
        Node n4 = graph.addNode(4);
        Node n5 = graph.addNode(5);
        Node n6 = graph.addNode(6);

        graph.addConnection(n1, n2);
        graph.addConnection(n2, n4);
        graph.addConnection(n4, n3);
        graph.addConnection(n4, n4);
        graph.addConnection(n4, n5);
        graph.addConnection(n3, n2);
        graph.addConnection(n3, n1);
        graph.addConnection(n5, n2);
        graph.addConnection(n5, n6);
        graph.addConnection(n6, n4);

        assertTrue(RouteBetweenNodes.isRoute(n1, n6));
    }

    @Test
    public void isRoute_shouldReturnFalse_whenThereIsNoRoute() {
        Graph graph = new Graph();
        Node n1 = graph.addNode(1);
        Node n2 = graph.addNode(2);
        Node n3 = graph.addNode(3);
        Node n4 = graph.addNode(4);
        Node n5 = graph.addNode(5);

        graph.addConnection(n1, n2);
        graph.addConnection(n1, n3);
        graph.addConnection(n2, n3);
        graph.addConnection(n3, n4);
        graph.addConnection(n4, n1);
        graph.addConnection(n5, n3);

        assertFalse(RouteBetweenNodes.isRoute(n1, n5));
    }
}