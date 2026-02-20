public class IsValid {
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
    public static Boolean vaild(Node root , Node min,Node max){
        if(root==null) return true;
        if(min!=null && root.data<=min.data){
            return false;
        }
        if(max!=null && root.data>=max.data){
            return false;
        }
        return vaild(root.left,min,root) && vaild(root.right,root,max);
    }
    public static void main(String[] args){
        Node root=new Node(5);
        root.left=new Node(1);
        root.right=new Node(7);
        root.left.right=new Node(3);
        root.left.right.left=new Node(10);
        root.left.right.left=new Node(2);
        System.out.println(vaild(root, null, null));
    }
}
