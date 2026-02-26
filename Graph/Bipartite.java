import java.util.*;

public class Bipartite {
    static class Edge {
        int src, des;
        Edge(int src, int des) {
            this.src = src;
            this.des = des;
        }
    }

    public static boolean isBipartite(ArrayList<Edge> graph[]) {
        int[] color = new int[graph.length];
        Arrays.fill(color, -1); // More concise way to initialize

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if (color[i] == -1) {
                q.add(i);
                color[i] = 0; // Start coloring with 0

                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);
                        
                        if (color[e.des] == -1) {
                            // Assign opposite color
                            color[e.des] = color[curr] == 0 ? 1 : 0;
                            q.add(e.des);
                        } else if (color[e.des] == color[curr]) {
                            return false; // Found same color on adjacent nodes
                            // Removed 'break;' as it was unreachable
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        // This specific graph represents a pentagon (5-cycle)
        // 5-cycles are NOT bipartite because they are odd-length cycles.
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));

        System.out.println("Is the graph Bipartite? " + isBipartite(graph));
    }
}