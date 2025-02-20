package org.example.DataStructure;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void testIfStackAddIsOk() {
        List<Integer> expectedResult = List.of(1, 2, 3);
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();
        stack.pop();
        List<Integer> actualResult = stack.getStack();

        assertEquals(expectedResult, actualResult);
    }
}