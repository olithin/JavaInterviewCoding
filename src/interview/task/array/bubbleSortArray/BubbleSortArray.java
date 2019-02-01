package interview.task.array.bubbleSortArray;

import java.util.Arrays;

public class BubbleSortArray {
    public static void main(String[] args) {
        int[] arr = {4, 7, 8, 2, 5, 9};
        System.out.println(Arrays.toString(bublleSort(arr)));
    }



    public static int[] bublleSort(int [] arr) {

        for(int i = arr.length-1 ; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
    }
    return arr;
}
}
