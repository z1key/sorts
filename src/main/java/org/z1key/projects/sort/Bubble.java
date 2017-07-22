package org.z1key.projects.sort;

import java.util.Arrays;

/**
 * Created by User on 15.07.2017.
 */
public class Bubble {

    public static void sort(int[] array) {
        int length = array.length;
        for (int i = 0; i < array.length; i++) {
            boolean mod = false;
            for (int k = 0; k < length - 1; k++) {
                int memory;
                if (array[k] > array[k + 1]) {
                    memory = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = memory;
                    mod = true;
                }
            }
            if (!mod) break;
            length--;
        }
    }
}
