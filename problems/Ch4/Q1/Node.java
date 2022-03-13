package Q1;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public int id;
    public List<Node> edgesOut;
    public List<Node> edgesIn;
    public Visit visitedTo;
    public Visit visitedFrom;

    public Node(int newId) {
        id = newId;
        edgesOut = new ArrayList<>();
        edgesIn = new ArrayList<>();
        visitedTo = Visit.UNVISITED;
        visitedFrom = Visit.UNVISITED;
    }
}
