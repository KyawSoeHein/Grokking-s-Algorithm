package org.example.DataStructure;

import java.util.List;

public class DynamicArray {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

    public int[] insert(int newValue) {
        int arrSize = arr.length;
        int[] newArr = new int[arrSize * 2];

        for (int i = 0; i < arrSize; i++) {
            newArr[i] = arr[i];
        }

        newArr[arrSize] = newValue;

        return newArr;
    }
}
