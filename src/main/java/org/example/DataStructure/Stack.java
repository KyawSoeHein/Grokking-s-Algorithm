package org.example.DataStructure;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    List<Integer> stack = new ArrayList<>();

    public void push(int newValue) {
        stack.add(newValue);
    }

    public int pop() {
        return stack.remove(stack.size() - 1);
    }

    public List<Integer> getStack() {
        return stack;
    }
}
