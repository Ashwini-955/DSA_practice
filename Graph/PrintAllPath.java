import java.util.*;
public class PrintAllPath{
    static class Edge{
        int src;
        int des;
        Edge(int src,int des){
            this.src=src;
            this.des=des;
        }
    }
    public static void printAllPath(ArrayList<Edge> graph[],int s,int d, String path){
        if(s==d){
            System.out.println(path+d);
            return;
        }
        for(int i=0;i<graph[s].size();i++){
            Edge e =graph[s].get(i);
            printAllPath(graph,e.des,d,path+s);
        }
    }
    public static void main(String[] args){
        int v=6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,3));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
        printAllPath(graph,5,1,"");
    }
}