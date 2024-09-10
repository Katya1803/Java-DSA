package example.datastructures.nonlinear;

import datastructures.nonlinear.tree.BinarySearchTree;

public class BSTExample {
    public void demo() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.println("BST Inorder traversal:");
        bst.inorder();
    }
}
