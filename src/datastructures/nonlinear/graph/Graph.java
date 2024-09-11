package datastructures.nonlinear.graph;

import java.util.*;

public abstract class Graph {
    protected Map<Integer, List<Integer>> adjList;  // Danh sách kề

    public Graph() {
        adjList = new HashMap<>();
    }

    public abstract void addEdge(int u, int v);

    public List<Integer> getNeighbors(int u) {
        return adjList.getOrDefault(u, new ArrayList<>());
    }

    public void addVertex(int v) {
        adjList.putIfAbsent(v, new ArrayList<>());
    }

    public void removeVertex(int v) {
        adjList.remove(v);
        for (List<Integer> neighbors : adjList.values()) {
            neighbors.remove((Integer) v);
        }
    }

    public void removeEdge(int u, int v) {
        List<Integer> neighbors = adjList.get(u);
        if (neighbors != null) {
            neighbors.remove((Integer) v);
        }
    }

    public Set<Integer> getVertices() {
        return adjList.keySet();
    }

    // In danh sách kề của đồ thị
    public void printGraph() {
        for (Map.Entry<Integer, List<Integer>> entry : adjList.entrySet()) {
            System.out.println("Vertex " + entry.getKey() + ": " + entry.getValue());
        }
    }

    public List<Integer> bfs(int start) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            result.add(vertex);

            for (int neighbor : getNeighbors(vertex)) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
        return result;
    }

    public List<Integer> dfs(int start) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();

        stack.push(start);
        visited.add(start);

        while (!stack.isEmpty()) {
            int vertex = stack.pop();
            result.add(vertex);

            for (int neighbor : getNeighbors(vertex)) {
                if (!visited.contains(neighbor)) {
                    stack.push(neighbor);
                    visited.add(neighbor);
                }
            }
        }
        return result;
    }


}

