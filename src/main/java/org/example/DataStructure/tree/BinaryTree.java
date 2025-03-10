package org.example.DataStructure.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Stack;

public class BinaryTree {
    Node root = null;

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int newData) {
            data = newData;
        }
    }

    public void insertLeft(int newValue, int parentValue) {
        Node newNode = new Node(newValue);
        if (root == null) {
            root = newNode;
            return;
        }

        Node targetParent = findByValueViaDFS(parentValue);
        if (targetParent == null) {
            System.out.println("No parent node found");
            return;
        }
        targetParent.left = newNode;
    }

    public void insertRight(int newValue, int parentValue) {
        Node newNode = new Node(newValue);
        if (root == null) {
            root = newNode;
            return;
        }

        Node targetParent = findByValueViaDFS(parentValue);
        if (targetParent == null) {
            System.out.println("No parent node found");
            return;
        }
        targetParent.right = newNode;
    }

    private Node findByValueViaDFS(int target) {
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node current = stack.pop();

            if (current.data == target) {
                return current;
            }

            Optional.ofNullable(current.right).ifPresent(stack::add);
            Optional.ofNullable(current.left).ifPresent(stack::add);
        }

        return null;
    }

    public List<Integer> printTree() {
        List<Integer> result = new ArrayList<Integer>();
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            result.add(current.data);
            Optional.ofNullable(current.right).ifPresent(stack::add);
            Optional.ofNullable(current.left).ifPresent(stack::add);
        }

        return result;
    }
}
