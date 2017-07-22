package org.z1key.projects.sort;

import java.util.Arrays;

/**
 * Created by User on 15.07.2017.
 */
public class Choice {

    public static void sort(int[] array) {

//        int length = array.length;

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
