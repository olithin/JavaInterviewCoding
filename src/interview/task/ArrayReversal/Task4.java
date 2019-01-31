package interview.task.ArrayReversal;

public class Task4 {

        public static String reverseByArray(String s) {
            char[] entryString = s.toCharArray();
            char[] b = new char[entryString.length];
            for (int i = 0; i < entryString.length; i++) {
                b[(entryString.length - 1) - i] = entryString[i];
            }
            return new String(b);
        }

        public static void main(String[] args) {
            String string = "Hello world!!";
            System.out.println(reverseByArray(string));
        }
    }


    /*Задачи на массивы
Задача 1. Напишите программу, печатающую количество нулевых элементов в заданном целочисленном массиве.

Задача 2. Напишите программу, печатающую максимальный элемент непустого массива.

Задача 3. Напишите программу (линейный поиск), определяющую первое вхождение заданного целого числа x в массив целых чисел, заведомо содержащий это число.
Задача 4. Напишите программу, печатающую количество максимальных элементов непустого массива, в которой используется только один цикл.


Задача 5. Напишите программу, печатает массив, затем инвертирует (то есть меняет местами первый элемент с последним, второй — с предпоследним и т.д.), и вновь печатает.



Задача 6. Напишите программу, которая печатает массив, затем сортирует (то есть переставляет его элементы так, чтобы они располагались в неубывающем порядке), и вновь печатает.

Задача 7. Напишите программу, которая определяет, является ли введенная фраза палиндромом.

Указание Палиндром — эта фраза, инвертирование которой не изменяет ее. При этом все пробелы во фразе игнорируются.

Задача 8. Напишите программу, которая циклически сдвигает элементы массива вправо на одну позицию, и печатает результат. Цикличность означает, что последний элемент массива становится самым первым его элементом.

Задача 9. Напишите программу, которая циклически сдвигает элементы массива вправо на k позиций, и печатает результат.

Задача 10. Напишите программу, которая заменяет все элементы массива, кроме крайних, на полусумму соседей, и печатает результат.

Задача 11. Напишите программу, которая считая два непустых массива целых чисел в диапазоне от нуля до девяти десятичным представлением двух чисел, печатает их разность.

Задача 12. Напишите программу, которая из двух непустых неубывающих массивов целых чисел, печатает те и только те элементы, которые встречаются хотя бы в одном из массивов (объединение множеств).

Задача 13. Напишите программу, которая  из двух непустых неубывающих массивов целых чисел, и печатает те и только те элементы, которые встречаются в обоих массивах (пересечение множеств).

Задача 14. Напишите программу, которая из двух непустых неубывающих массивов целых чисел, печатает те и только те элементы, которые входят только в один из массивов (симметрическая разность множеств).

Задача 15. Напишите программу, заносящую в массив первые 100 натуральных чисел, делящихся на 13 или на 17, и печатающую его.

Задача 16. Напишите программу, которая в массиве целых чисел печатает количество локальных максимумов (элемент является локальным максимумом, если он не имеет соседей, больших, чем он сам).*/