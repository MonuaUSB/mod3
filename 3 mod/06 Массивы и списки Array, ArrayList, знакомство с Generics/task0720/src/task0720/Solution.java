package task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
3. Переставить M первых строк в конец списка.
4. Выведи список на экран, каждое значение с новой строки.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число N и М: ");
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        System.out.println("Значит строк: "+n+" ,а переставляем в конец списка: "+m+". Заполните список строк:");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) { list.add(reader.readLine());}
        if(m>0 && m<list.size()){
            for (int i = 0; i < m; i++) {
                list.add(list.remove(0));}
            for (String s : list) {
                System.out.println(s);
            }

        }


        //напишите тут ваш код
    }
}
