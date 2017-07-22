package org.z1key.projects.sort;

import java.util.Arrays;

/**
 * Created by User on 16.07.2017.
 */
public class Merge {

    public static void sort(int[] array) {
        if (array.length > 3) {
            int splitIndex;
            splitIndex = (array.length -1) / 2;
            int[] arr1 = Arrays.copyOfRange(array, 0, splitIndex + 1);
            int[] arr2 = Arrays.copyOfRange(array, splitIndex + 1, array.length);
            sort(arr1);
            sort(arr2);
            merge(array, arr1, arr2);
        } else {
            Arrays.sort(array); //Quick sort for <= 3 elements
        }
    }

    private static void merge(int[] target, int[] array1, int[] array2) {
        int indexOfFirst = 0;
        int indexOfSecond = 0;
        int targetIndex = 0;
        while (targetIndex < target.length) {

            if (indexOfFirst == array1.length) {
                System.arraycopy(array2, indexOfSecond, target, targetIndex, array2.length - indexOfSecond);
                indexOfSecond++;
            } else if (indexOfSecond == array2.length) {
                System.arraycopy(array1, indexOfFirst, target, targetIndex, array1.length - indexOfFirst);
                indexOfFirst++;
            } else {
                if (array1[indexOfFirst] < array2[indexOfSecond]) {
                    System.arraycopy(array1, indexOfFirst, target, targetIndex, 1);
                    indexOfFirst++;
                } else {
                    System.arraycopy(array2, indexOfSecond, target, targetIndex, 1);
                    indexOfSecond++;
                }
            }
            targetIndex++;
        }
    }
}
