package example.datastructures.nonlinear;

import datastructures.nonlinear.tree.AVLTree;

public class AVLExample {
    public void demo() {
        AVLTree avl = new AVLTree();
        avl.insert(10);
        avl.insert(20);
        avl.insert(30);
        avl.insert(40);
        avl.insert(50);
        avl.insert(25);

        System.out.println("AVL Inorder traversal:");
        avl.inorder();
    }
}
