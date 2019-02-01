package interview.task;

import java.util.Arrays;

/*
* Find Missing Number From Series
* */
public class Task5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 7, 8, 9};

        System.out.println(findMissingNumber(array));;

    }

    private static int findMissingNumber(int[] array) {
        int missingNum = 0;
        int sum =0;
        for(int i = 0; i< array.length; i++) {
            sum += array[i];
        }

       // if()



        return missingNum;
    }
}
