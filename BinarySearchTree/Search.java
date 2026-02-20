public class Search {
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
    public static Boolean Search(Node root, int val){
        if(root==null) return false;
        if(root.data== val) return true;
        if(root.data>val){
            return Search(root.left,val);
        }else{
            return Search(root.right,val);
        }
    }
    public static void main(String[] args){
        Node root=new Node(5);
        root.left=new Node(1);
        root.right=new Node(7);
        root.left.right=new Node(3);
        root.left.right.left=new Node(4);
        root.left.right.left=new Node(2);
        System.out.println(Search(root, 0));
        System.out.println(Search(root, 2));
    }
}
