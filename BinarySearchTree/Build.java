public class Build {
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
    public static Node inorder(Node root){
        if(root==null) return null;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
        return root;
    }
    public static Node BuildTree(Node root, int val){
        if(root==null){
            root =new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=BuildTree(root.left,val);
        }else{
            root.right=BuildTree(root.right,val);
        }
        return root;
    }
    public static void main (String[] args){
        int val[] ={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<val.length;i++){
            root=BuildTree(root,val[i]);
        }
        inorder(root);
    }
}
