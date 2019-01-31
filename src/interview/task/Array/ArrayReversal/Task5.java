package interview.task.Array.ArrayReversal;

import static org.junit.Assert.assertArrayEquals;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {3, 8, 9, 6, 2};
        reverse(array);
    }

    /**
     * reverse the given array in place
     */
    public static void reverse(int[] input) {
        if (input == null || input.length <= 1) {
            return;
        }

        for (int i = 0; i < input.length / 2; i++) {
            int temp = input[i];
            // swap numbers
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = temp;
        }
    }

}

