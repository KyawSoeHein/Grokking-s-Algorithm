package org.example.DataStructure.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Tree {
    TreeNode root = null;

    public static class TreeNode {
        int value;
        List<TreeNode> children;

        public TreeNode(int  newValue) {
            value = newValue;
            this.children = new ArrayList<>();
        }
    }

    public void add(int newValue, int parentValue) {
        TreeNode newTreeNode = new TreeNode(newValue);

        if (root == null) {
            root = newTreeNode;
            return;
        }

        TreeNode parentNode = findNodeWithDFS(parentValue);
        if (parentNode == null) {
            System.out.println("There is no parent with that value");
            return;
        }

        parentNode.children.add(newTreeNode);
    }

    public TreeNode getRoot() {
        return root;
    }

    public TreeNode findNodeWithDFS(int target) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            if (current.value == target) {
                return current;
            }

            for (int i = current.children.size() - 1; i >= 0 ; i--) {
                stack.push(current.children.get(i));
            }
        }

        return null;
    }

    public List<Integer> printList() {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        List<Integer> result = new ArrayList<>();

        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            result.add(current.value);

            for (int i = current.children.size() - 1; i >= 0 ; i--) {
                stack.push(current.children.get(i));
            }
        }

        return result;
    }
}
