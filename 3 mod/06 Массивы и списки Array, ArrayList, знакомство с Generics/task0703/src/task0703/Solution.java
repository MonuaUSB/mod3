package task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.

Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.


Requirements:
1. Программа должна создавать массив на 10 строк.
2. Программа должна создавать массив на 10 целых чисел.
3. Программа должна считывать строки для массива с клавиатуры.
4. Программа должна в массив чисел записать длины строк из массива строк, а затем их вывести на экран.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] array = new String[10];
        int[] pyku = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 10 строк, заполнить массив строк: ");
        for (int i=0; i<10; i++){
            array[i] = br.readLine();}
        for (int i=0; i<10; i++){
            pyku[i] = array[i].length();}
        for (int i=0; i<10; i++){
            System.out.println(pyku[i]);}
        }
    }

