package task0827;

import java.util.Calendar;
import java.util.Date;

/* 
Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудь учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false


Requirements:
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать два метода.
3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
4. Метод main() должен вызывать метод isDateOdd().*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(isDateOdd("MAY 1 2013"));
        System.out.println(isDateOdd("JANUARY 1 2000"));
        System.out.println(isDateOdd("JANUARY 2 2020"));
        System.out.println(isDateOdd("JANUARY 6 2020"));
    }
    public static boolean isDateOdd(String date) {
        try {
            Date inputDate = new Date(date);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(inputDate);
            int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
            return dayOfYear % 2 != 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;}
    }
}
