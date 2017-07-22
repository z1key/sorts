package org.z1key.projects.sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by User on 15.07.2017.
 */
public class SortTest {

    private static int[] input = new int[10000];

    static {
         Random r = new Random();
         for (int i = 0; i < input.length; i++) input[i] = r.nextInt(200) - 100;
//         for (int i = input.length /2; i < input.length; i++) input[i] = /*r.nextInt(200) - 100*/ 2;

    }

    private int[] sdkSorted;

    @Before
    public void setUp() throws Exception {
        sdkSorted = Arrays.copyOf(input, input.length);
//        System.out.println(Arrays.toString(input));
        Arrays.sort(sdkSorted); // will believe that is true
    }

    @After
    public void tearDown() {
//        System.out.println(Arrays.toString(input));
    }

    @Test
    public void shell_sort() throws Exception {
        System.out.println("Shell sort");
        int[] output = Arrays.copyOf(input, input.length);

        long time = System.nanoTime();
        Shell.sort(output);
        System.out.println((System.nanoTime() - time)/1000);

        assertArrayEquals(sdkSorted, output);
    }

    @Test
    public void insertions_sort() throws Exception {
        System.out.println("Insertions sort");
        int[] output = Arrays.copyOf(input, input.length);

        long time = System.nanoTime();
        Insertions.sort(output);
        System.out.println((System.nanoTime() - time)/1000);

        assertArrayEquals(sdkSorted, output);
    }

    @Test
    public void bubble_sort() throws Exception {
        System.out.println("Bubble sort");
        int[] output = Arrays.copyOf(input, input.length);

        long time = System.nanoTime();
        Bubble.sort(output);
        System.out.println((System.nanoTime() - time)/1000);

        assertArrayEquals(sdkSorted, output);
    }

    @Test
    public void choice_sort() throws Exception {
        System.out.println("Choice sort");
        int[] output = Arrays.copyOf(input, input.length);

        long time = System.nanoTime();
        Choice.sort(output);
        System.out.println((System.nanoTime() - time)/1000);

        assertArrayEquals(sdkSorted, output);

    }

    @Test
    public void merge_sort() throws Exception {
        System.out.println("Merge sort");
        int[] output = Arrays.copyOf(input, input.length);

        long time = System.nanoTime();
        Merge.sort(output);
        System.out.println((System.nanoTime() - time)/1000);

        assertArrayEquals(sdkSorted, output);

    }

    @Test(expected = NullPointerException.class)
    public void insertions_sort_null_pointer() {
        Insertions.sort(null);
    }

    @Test(expected = NullPointerException.class)
    public void bubble_sort_null_pointer() {
        Bubble.sort(null);
    }

    @Test(expected = NullPointerException.class)
    public void shell_sort_null_pointer() {
        Shell.sort(null);
    }
}
