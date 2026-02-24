import java.util.*;

public class Closest {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static int closestVal;
    static int minDiff = Integer.MAX_VALUE;

    public static void closestNode(Node root, int target) {
        if (root == null) return;

        int diff = Math.abs(root.data - target);
        if (diff < minDiff) {
            minDiff = diff;
            closestVal = root.data;
        }

        if (target < root.data)
            closestNode(root.left, target);
        else
            closestNode(root.right, target);
    }

    public static int getClosest(Node root, int target) {
        minDiff = Integer.MAX_VALUE;
        closestNode(root, target);
        return closestVal;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(11);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(20);

        System.out.println(getClosest(root, 5));   // 5
        System.out.println(getClosest(root, 19));  // 20
    }
}