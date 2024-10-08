package neetcode.graphs.redundant_connection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class FindRedundant {
    /*
     * In this problem, a tree is an undirected graph that is connected and has no
     * cycles.
     * 
     * You are given a graph that started as a tree with n nodes labeled from 1 to
     * n, with one additional edge added. The added edge has two different vertices
     * chosen from 1 to n, and was not an edge that already existed. The graph is
     * represented as an array edges of length n where edges[i] = [ai, bi] indicates
     * that there is an edge between nodes ai and bi in the graph.
     * 
     * Return an edge that can be removed so that the resulting graph is a tree of n
     * nodes. If there are multiple answers, return the answer that occurs last in
     * the input.
     */
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;

        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int edge[] : edges) {
            int node1 = edge[0];
            int node2 = edge[1];
            boolean[] visited = new boolean[n + 1];
            if (graph.containsKey(node1) && graph.containsKey(node2) && isPath(graph, node1, node2, visited)) {
                return edge;
            }

            graph.get(node1).add(node2);
            graph.get(node2).add(node1);
        }

        return new int[0];
    }

    private boolean isPath(Map<Integer, List<Integer>> graph, int source, int destination, boolean[] visited) {
        if (source == destination) {
            return true;
        }

        visited[source] = true;
        for (int neighbor : graph.get(source)) {
            if (!visited[neighbor]) {
                if (isPath(graph, neighbor, destination, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        FindRedundant fr = new FindRedundant();
        String output = "Output: ";

        int[][] edges1 = {{1, 2}, {1, 3}, {2, 3}};
        System.out.println(output + Arrays.toString(fr.findRedundantConnection(edges1)));
    }
}
