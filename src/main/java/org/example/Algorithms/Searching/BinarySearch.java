package org.example.Algorithms.Searching;

import java.util.ArrayList;

public class BinarySearch {
    public int start(int target, ArrayList<Integer> arrayList) throws Exception {
        if (arrayList == null || arrayList.isEmpty()) {
            throw new Exception("List is empty");
        }

        int start = 0;
        int end = arrayList.size() - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2); // to avoid integer overflow

            if (arrayList.get(mid) == target) {
                return mid;
            } else if (target > arrayList.get(mid)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        throw new Exception("Target is not inside the list");
    }
}
