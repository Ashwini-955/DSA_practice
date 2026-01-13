import java.util.*;
public class KAncestor{
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
    
    public static int Kances(Node root, int n, int k){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDistance=Kances(root.left,n,k);
        int rightDistance=Kances(root.right,n,k);
        int max=Math.max(leftDistance,rightDistance);
        if(leftDistance==-1&&rightDistance==-1){
            return-1; 
        }
        if(max+1==k){
            System.out.println("The node value is "+root.data);
        }
        return max+1;
    }
   
    public static void main(String[] args){
       Node root =new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
        System.out.println(" the 2nd ancestor is "+Kances(root,5,2));
    }
}