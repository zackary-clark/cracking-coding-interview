package Q1;

import java.util.LinkedList;
import java.util.Queue;

public class RouteBetweenNodes {
    // Given a directed graph and two nodes S and E, design an algorithm to find out whether there is a route from S to E.
    public static boolean isRoute(Node from, Node to) {
        Queue<Node> q1 = new LinkedList<>();
        Queue<Node> q2 = new LinkedList<>();

        q1.add(from);
        q2.add(to);

        from.visitedFrom = Visit.VISITED;
        to.visitedTo = Visit.VISITED;

        while (!(q1.isEmpty() || q2.isEmpty())) {
            Node currFrom = q1.remove();
            Node currTo = q2.remove();

            for (Node n : currFrom.edgesOut) {
                if (n.visitedTo == Visit.VISITED) {
                    return true;
                }
                if (n.visitedFrom == Visit.UNVISITED) {
                    q1.add(n);
                    n.visitedFrom = Visit.VISITED;
                }
            }
            for (Node n : currTo.edgesIn) {
                if (n.visitedFrom == Visit.VISITED) {
                    return true;
                }
                if (n.visitedTo == Visit.UNVISITED) {
                    q2.add(n);
                    n.visitedTo = Visit.VISITED;
                }
            }
        }
        return false;
    }
}
