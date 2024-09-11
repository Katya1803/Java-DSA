package datastructures.nonlinear.graph;

public class UndirectedGraph extends Graph {

    @Override
    public void addEdge(int u, int v) {
        addVertex(u);
        addVertex(v);
        adjList.get(u).add(v);
        adjList.get(v).add(u);  // Thêm cạnh ngược lại vì đây là đồ thị vô hướng
    }
}
