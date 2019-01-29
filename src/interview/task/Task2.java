package interview.task;

/*
* Сила тяжести на Луне примерно равна 17%, напишите программу, которая вычисляет ваш вес на Луне
*/

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add weight:");
        System.out.println("Your weight on the Moon: " + scanner.nextDouble()*0.17);
    }
}
