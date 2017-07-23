package org.z1key.projects.sort;

public class Choice {

    public static void sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int index = i;
            for (int k = i + 1; k < array.length; k++) {
                if (array[k] < min) {
                    min = array[k];
                    index = k;
                }
            }
            array[index] = array[i];
            array[i] = min;
        }
    }

}
