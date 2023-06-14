package com.udayan.dsa.trees;

import java.util.ArrayList;

public class BST {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(2);
        bst.insert(1);
        bst.insert(3);

        System.out.println("Root =" + bst.getRootNode().getValue());
        System.out.println("Left =" + bst.getRootNode().getLeftNode().getValue());
        System.out.println("Right =" + bst.getRootNode().getRightNode().getValue());

        bst.delete(bst.getRootNode(), 2);


        BinarySearchTree bst2 = new BinarySearchTree();
        bst2.insert(47);
        bst2.insert(21);
        bst2.insert(76);
        bst2.insert(18);
        bst2.insert(27);
        bst2.insert(52);
        bst2.insert(82);
        System.out.println("BFS =" + bst2.BFS());

        ArrayList<Integer> x = new ArrayList<Integer>();
        bst2.DFSPreOrder(bst2.getRootNode(), x);
        System.out.println(x);


        bst2.DFSInOrder(bst2.getRootNode());

        bst2.DFSPostOrder(bst2.getRootNode());


    }

}
