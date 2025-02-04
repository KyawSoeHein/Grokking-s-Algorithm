package org.example.Algorithms.Sorting;

import java.util.ArrayList;

public class SelectionSort {
    public ArrayList<Integer> start(ArrayList<Integer> arrayList) throws Exception {
        if (null == arrayList || arrayList.isEmpty()) {
            throw new Exception("Array needs to be valid");
        }

        ArrayList<Integer> result = new ArrayList<>();

        while (!arrayList.isEmpty()) {
            int smallest = findSmallest(arrayList);
            result.add(arrayList.remove(smallest));
        }

        return result;
    }

    private int findSmallest(ArrayList<Integer> arrayList) {
        int smallest = 0;
        for (int j = 1; j < arrayList.size(); j++) {
            if (arrayList.get(j) < arrayList.get(smallest)) {
                smallest = j;
            }
        }

        return smallest;
    }
}
