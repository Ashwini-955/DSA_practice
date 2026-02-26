import java.util.*;
public class Connected{
    static class Edge{
        int src;
        int des;
        int w;
        Edge(int src,int des,int w){
            this.src=src;
            this.des=des;
            this.w=w;
        }
    }
    public static void DfsHelper(ArrayList<Edge> graph[],boolean[] vis){
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                dfs(graph,i,vis);
            }
        }
    }
    public static void dfs(ArrayList<Edge> graph[],int curr,boolean[] vis){
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.des]){
                dfs(graph,e.des,vis);
            }
        }
    }
    public static void main(String[] args){
        int v=7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,1));
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,2,1));
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[3].add(new Edge(3,2,1));
        graph[4].add(new Edge(4,5,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));
        graph[6].add(new Edge(6,5,1));
        boolean[] vis =new boolean[v];
        DfsHelper(graph,vis);
    }
}