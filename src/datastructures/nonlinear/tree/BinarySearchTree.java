package datastructures.nonlinear.tree;

public class BinarySearchTree {
    class Node {
        int key;
        Node left, right;

        public Node(int item){
            this.key = item;
            left = right = null;
        }
    }

    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int key){
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    public void inorder(){
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    Node search(int key) {
        return searchRec(root, key);
    }

    Node searchRec(Node root, int key) {
        if (root == null || root.key == key)
            return root;

        if (root.key > key)
            return searchRec(root.left, key);

        return searchRec(root.right, key);
    }
}
