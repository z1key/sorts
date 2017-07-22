package org.z1key.projects.sort;

/**
 * Created by User on 15.07.2017.
 */
public class Shell {

    public static void sort(int[] array) {
        int step = array.length / 2;
        sort(array, step);
    }
    private static void sort(int[] array, int step) {
        for (int i = 0; i + step < array.length; i += step) {
            int memory;
            int internalIndex = i;

            while (internalIndex >= 0 && array[internalIndex] > array[internalIndex + step]) {
                memory = array[internalIndex];
                array[internalIndex] = array[internalIndex + step];
                array[internalIndex + step] = memory;

                internalIndex -= step;
            }
        }
        if (step > 1) {
            sort(array, step / 2);
        }
    }
}
