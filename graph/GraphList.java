package graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class GraphList {
    private List<Integer>[] adjLists;
    private int numVertices;

    @SuppressWarnings("unchecked")
    public GraphList(int numVertices) {
        this.numVertices = numVertices;
        adjLists = new LinkedList[numVertices];
        for (int i = 0; i < numVertices; i++) {
            adjLists[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest) {
        adjLists[src].add(dest);
        adjLists[dest].add(src); // For undirected graph
    }

    public void BFS(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int adjVertex : adjLists[vertex]) {
                if (!visited[adjVertex]) {
                    visited[adjVertex] = true;
                    queue.add(adjVertex);
                }
            }
        }
        System.out.println();
    }

    public void DFS(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        DFSUtil(startVertex, visited);
        System.out.println();
    }

    private void DFSUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int adjVertex : adjLists[vertex]) {
            if (!visited[adjVertex]) {
                DFSUtil(adjVertex, visited);
            }
        }
    }

    public static void main(String[] args) {
        GraphList graph = new GraphList(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("Breadth First Traversal starting from vertex 2:");
        graph.BFS(2);

        System.out.println("\nDepth First Traversal starting from vertex 2:");
        graph.DFS(2);
    }
}
