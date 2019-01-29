package interview.task;

import java.util.Scanner;


/*
 * Напишите программу, которая считывает символы пока не встретится точка.
 * */
public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        while (!input.equals(".")) {
            input = sc.nextLine();
        }
        System.out.println("Dot was founded");
    }
}
