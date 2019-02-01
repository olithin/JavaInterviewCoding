package interview.task;

/**
 * Class to find missing number in an array
 */
public class Task7 {


    public static void main(String[] args) {
        int maxNumber = 10;
        int[] givenArr = {1, 2, 3, 5, 7, 9, 6, 8, 10};

        findMissingNumber(givenArr, maxNumber);
    }


    static void findMissingNumber(int[] arr, int max) {

        int sumOfAllNumbers = 0;
        int currentSum = 0;

        //find the sum of all numbers
        sumOfAllNumbers = (max * (max + 1)) / 2;


        //find sum of all elements of the array by iterating through them
        for (int anArr : arr) {
            currentSum += anArr;
        }
        System.out.print("Missing number " + (sumOfAllNumbers - currentSum));
    }

}

