import java.util.*;
public class Topological_BFS{
    static class Edge{
        int src;
        int des;
        Edge(int src,int des){
            this.src=src;
            this.des=des;
        }
    }
    public static void  calculateIndegree(ArrayList<Edge> graph[],int[] indeg){
        for(int i=0;i<graph.length;i++){
            int v=i;
            for(int j=0;j<graph[v].size();j++){
                Edge e =graph[v].get(j);
                indeg[e.des]++;
            }
        }
    }
    public static void topsort(ArrayList<Edge> graph[]){
        int[] indeg=new int[graph.length];
        Queue<Integer> q=new LinkedList<>();
        calculateIndegree(graph,indeg);
        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int curr =q.remove();
            System.out.println(curr);
            for(int i=0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                indeg[e.des]--;
                if(indeg[e.des]==0){
                    q.add(e.des);
                }
            }
        }
    }
    public static void main(String[] args){
        int v=6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
        topsort(graph);
    }
}