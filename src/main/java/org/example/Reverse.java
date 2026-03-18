package org.example;

import static java.util.Collections.swap;

public class Reverse {
    void cross(int i, int n, int[] arr) {
        if (i >= n / 2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        cross(i + 1, n, arr);
    }
}

