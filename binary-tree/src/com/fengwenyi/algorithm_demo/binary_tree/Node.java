package com.fengwenyi.algorithm_demo.binary_tree;

/**
 * @author Wenyi Feng
 */
public class Node {

    int value;
    Node leftChild;
    Node rightChild;

    public Node(int value) {
        this.value = value;
    }

    public void display () {
        System.out.println(this.value + "\n");
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
