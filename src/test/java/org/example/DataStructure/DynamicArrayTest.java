package org.example.DataStructure;

import org.example.DataStructure.array.DynamicArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DynamicArrayTest {
    @Test
    void testIfNewValueIsAdded() {
        int newValue = 10;
        int[] expectedResult = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        DynamicArray dynamicArray = new DynamicArray();
        int[] actualResult = dynamicArray.insert(10);

        int[] actualSubArray = Arrays.copyOfRange(actualResult, 0, expectedResult.length);

        assertEquals(16, actualResult.length);
        assertArrayEquals(expectedResult, actualSubArray);
    }
}