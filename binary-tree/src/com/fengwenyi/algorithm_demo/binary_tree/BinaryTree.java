package com.fengwenyi.algorithm_demo.binary_tree;

/**
 * @author Wenyi Feng
 */
public class BinaryTree {

    private Node root = null;

    public BinaryTree(int value) {
        this.root = new Node(value);
        this.root.leftChild = null;
        this.root.rightChild = null;
    }
}
