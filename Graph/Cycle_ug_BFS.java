public class Cycle_ug_BFS{
    static class Edge {
        int src, des;
        Edge(int src, int des) {
            this.src = src;
            this.des = des;
        }
    }
    public static void detectCycle(ArrayList<Edge> graph[]){

    }
    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }
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
        System.out.println(detectCycle(graph));
    }
}