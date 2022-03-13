package Q1;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<Node> vertices;

    public Graph() {
        vertices = new ArrayList<>();
    }

    public Node addNode(int newId) {
        Node node = new Node(newId);
        vertices.add(node);
        return node;
    }

    public List<Node> getVertices() {
        return vertices;
    }

    public void addConnection(Node from, Node to) {
        from.edgesOut.add(to);
        to.edgesIn.add(from);
    }
}
