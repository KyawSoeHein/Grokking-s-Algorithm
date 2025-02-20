package org.example.DataStructure;

import java.util.ArrayList;

public class Queue {
    ArrayList<Integer> queue = new ArrayList<>();

    public void enqueue(int newValue) {
        queue.add(newValue);
    }

    public int dequeue() {
        return queue.remove(0);
    }
    public ArrayList<Integer> getQueue() {
        return queue;
    }
}
