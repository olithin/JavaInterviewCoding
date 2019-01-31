package interview.task.array.countPositivesSumNegatives;

import java.util.Arrays;

/**
 * Given an array of integers.
Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.
If the input array is empty or null, return an empty array.

Example
For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].
*/
public class CountPositivesSumNegatives {
    public static void main(String[] args) {
        int[] array = {3, 8, 9, 6, 2, -5, -2, -7};
        System.out.println(Arrays.toString(countPositivesSumNegatives(array)));
    }

    public static int[] countPositivesSumNegatives(int[] input)
    {
        int count =0;
        int sum=0;
        if (input == null || input.length <= 1) {
            return new int[]{};
        }
        for(int i =0;i<input.length; i++ ) {
            if (input[i] > 0) {
                count++;
            } else sum += input[i];
        }
        return new int[] {count,sum};
    }
}

