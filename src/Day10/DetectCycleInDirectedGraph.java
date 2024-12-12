package Day10;

import java.util.*;

class DetectCycleInDirectedGraph {
    static class Graph {
        private final Map<Integer, List<Integer>> adjList = new HashMap<>();

        public void addEdge(int src, int dest) {
            adjList.putIfAbsent(src, new ArrayList<>());
            adjList.get(src).add(dest);
        }

        public boolean hasCycle() {
            Set<Integer> visited = new HashSet<>();
            Set<Integer> recursionStack = new HashSet<>();

            for (Integer node : adjList.keySet()) {
                if (dfs(node, visited, recursionStack)) {
                    return true;
                }
            }
            return false;
        }

        private boolean dfs(int node, Set<Integer> visited, Set<Integer> recursionStack) {
            if (recursionStack.contains(node)) {
                return true;
            }
            if (visited.contains(node)) {
                return false;
            }

            visited.add(node);
            recursionStack.add(node);

            if (adjList.containsKey(node)) {
                for (Integer neighbor : adjList.get(node)) {
                    if (dfs(neighbor, visited, recursionStack)) {
                        return true;
                    }
                }
            }

            recursionStack.remove(node);
            return false;
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);

        if (graph.hasCycle()) {
            System.out.println("Graph contains a cycle");
        } else {
            System.out.println("Graph does not contain a cycle");
        }
    }
}
