import java.util.*;
public class CreateGraph{
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
    public static void main(String[] args){
        int V=5;
        ArrayList<Edge>[] graph =new ArrayList[V];
        for(int i=0;i<V;i++){ 
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,3,3));
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));
        graph[4].add(new Edge(4,2,2));
        for(int i=0;i<graph[2].size();i++){
        Edge e =graph[2].get(i);
        System.out.println(e.des);
    }
    }
}