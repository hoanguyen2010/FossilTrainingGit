package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 5, 7, 1, 7, 6, 5};
        int[] output = uniq(arr);

        for (int i: output)
            System.out.println(i);


    }

    public static int[] uniq(int[] arr) {
        int[] temp = new int[arr.length];
        int tempCount = 0;
        boolean dup = false;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < i; j++) {
                if (arr[i] == temp[j]) {
                    dup = true;
                    break;
                }
            }
            if (!dup) {
                temp[tempCount] = arr[i];
                tempCount++;
            } else {
                dup = false;
            }
        }
        return temp;
    }

}
