package interview.task;


/*
* FizzBuzz: Output  numbers from 1 to x.
* If the number is divisible by 3, replace it with "Fizz".
* If it is divisible by 5 , replace it with "Buzz".
* If it is divisible by 3 and 5 replace it with "FizzBuzz"*/

public class Task3 {


    public static void main(String[] args) {
        int [] array = {3,8,9,5,15,8,4,6,30,25};
        for(int i =0; i < array.length;i++) {
            if (array[i] % 5 == 0 && array[i] % 3 == 0) {
                System.out.println("Fizz");
            } else if (array[i] % 3 == 0) {
                System.out.println("FizzBuzz");
            }else {
                System.out.println("Buzz");
            }
        }

    }
}
