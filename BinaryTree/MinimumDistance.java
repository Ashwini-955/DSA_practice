import java.util.*;
public class MinimumDistance{
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
    
    public static Node lca(Node root,int n1,int n2){
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();
        getpath(root,n1,path1);
        getpath(root,n2,path2);
        int i=0;
        for(;i<path1.size()&&i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        Node lca =path1.get(i-1);
        return lca;
    }
    public static int distance(Node root, int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDistance =distance(root.left,n);
        int rightDistance=distance(root.right,n);
        if(leftDistance==-1&&rightDistance==-1){
            return -1;
        }else if(leftDistance==-1){
            return rightDistance+1;
        }else{
            return leftDistance+1;
        }
        }

    
    public static int minDist(Node root, int n1,int n2){
        Node lca1= lca(root,n1,n2);
        int dist1=distance(lca1,n1);
        int dist2=distance(lca1,n2);
        return dist1+dist2;
    }
    public static boolean getpath(Node root,int n,ArrayList<Node> path){
        if(root==null) return false;
        path.add(root);
        if(root.data==n) return true;
        boolean foundLeft=getpath(root.left,n,path);
        boolean foundRight=getpath(root.right,n,path);
        if(foundLeft||foundRight) return true;
        path.remove(path.size()-1);
        return false;
    }
   
    public static void main(String[] args){
       Node root =new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
        System.out.println(minDist(root,4,6));
    }
}