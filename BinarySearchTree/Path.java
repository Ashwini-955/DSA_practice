import java.util.ArrayList;

public class Path {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void printpath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println();
    }
    public static void printPath(Node root , ArrayList<Integer> path){
        if(root==null) return;
        path.add(root.data);
        if(root.left==null && root.right==null){
            printpath(path);
        }
        printPath(root.left, path);
        printPath(root.right, path);
        path.remove(path.size()-1);
    }
   
    public static void main (String[] args){
        Node root=new Node(5);
        root.left=new Node(1);
        root.right=new Node(7);
        root.left.right=new Node(3);
        root.left.right.left=new Node(4);
        root.left.right.left=new Node(2);
        printPath(root, new ArrayList<>());
    }
}


