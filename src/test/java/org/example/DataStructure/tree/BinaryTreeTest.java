package org.example.DataStructure.tree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void testBinaryTree() {
        List<Integer> expected = List.of(1, 2, 6, 3, 4, 5);
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insertLeft(1, 0);
        binaryTree.insertLeft(2, 1);
        binaryTree.insertRight(3, 1);
        binaryTree.insertRight(4, 3);
        binaryTree.insertRight(5,4);
        binaryTree.insertLeft(6, 2);

        List<Integer> actual = binaryTree.printTree();
        assertEquals(expected, actual);
    }
}