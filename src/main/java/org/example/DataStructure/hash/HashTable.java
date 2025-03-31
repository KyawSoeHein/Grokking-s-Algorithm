package org.example.DataStructure.hash;

import java.util.LinkedList;

public class HashTable {
    private final LinkedList<Node>[] linkedLists = new LinkedList[10];
    public static class Node {
        String key;
        String value;

        public Node(String key, String value) {
            this.key = key;
            this.value = value;
         }
    }

    private int getIndex(String key) {
        return Math.abs(key.hashCode()) % 10;
    }

    public void insert(String newKey, String newValue) {
        int index = getIndex(newKey);
        LinkedList<Node> linkedList = linkedLists[index];

        if (linkedList == null) {
            linkedLists[index] = new LinkedList<>();
        } else {
            for (Node node : linkedList) {
                if (node.key.equalsIgnoreCase(newKey)){
                    node.value = newValue;
                }
            }
        }

        linkedLists[index].add(new Node(newKey, newValue));
    }

    public String get(String targetKey) {
        int index = getIndex(targetKey);
        LinkedList<Node> linkedList = linkedLists[index];

        if (linkedList == null) {
            return null;
        }

        for (Node node : linkedList) {
            if (node.key.equalsIgnoreCase(targetKey)) {
                return node.value;
            }
        }

        return null;
    }

    public void print(String targetKey) {
        int index = getIndex(targetKey);
        LinkedList<Node> linkedList = linkedLists[index];

        if (linkedList == null) {
            System.out.println("LinkedList is Null");
            return;
        }

        for (Node node : linkedList) {
            System.out.print(node.value + ", ");
        }
    }
}
