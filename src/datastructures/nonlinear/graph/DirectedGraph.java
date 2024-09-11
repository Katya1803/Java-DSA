package datastructures.nonlinear.graph;

public class DirectedGraph extends Graph {

    @Override
    public void addEdge(int u, int v) {
        addVertex(u);
        addVertex(v);
        adjList.get(u).add(v);  // Chỉ thêm cạnh từ u đến v
    }
}
