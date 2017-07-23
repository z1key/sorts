package org.z1key.projects.sort;

public class Insertions {

    public static void sort(final int [] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int memory;
            if (array[i] > array[i + 1]) {
                memory = array[i + 1];
                for (int k = i; k >= 0; k--) {
                    if (memory < array[k]) {
                        array[k + 1] = array[k];
                        if (k == 0) {
                            array[k] = memory;
                        }
                    } else {
                        array[k + 1] = memory;
                        break;
                    }
                }
            }
        }

    }
}
