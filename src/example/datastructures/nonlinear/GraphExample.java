package example.datastructures.nonlinear;

import datastructures.nonlinear.graph.*;

public class GraphExample {
    public static void demo() {
        System.out.println("Undirected Graph:");
        UndirectedGraph undirectedGraph = new UndirectedGraph();
        undirectedGraph.addEdge(0, 1);
        undirectedGraph.addEdge(0, 2);
        undirectedGraph.addEdge(1, 3);
        undirectedGraph.addEdge(3, 4);
        undirectedGraph.printGraph();

        System.out.println("BFS from vertex 0: " + undirectedGraph.bfs(0));
        System.out.println("DFS from vertex 0: " + undirectedGraph.dfs(0));

        System.out.println("\nDirected Graph:");
        DirectedGraph directedGraph = new DirectedGraph();
        directedGraph.addEdge(0, 1);
        directedGraph.addEdge(0, 2);
        directedGraph.addEdge(1, 3);
        directedGraph.addEdge(3, 4);
        directedGraph.printGraph();

        System.out.println("BFS from vertex 0: " + directedGraph.bfs(0));
        System.out.println("DFS from vertex 0: " + directedGraph.dfs(0));
    }
}
