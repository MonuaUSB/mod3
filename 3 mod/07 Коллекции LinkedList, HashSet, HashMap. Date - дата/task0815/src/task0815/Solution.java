package task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Александр");
        map.put("Петров", "Иван");
        map.put("Сидоров", "Антон");
        map.put("Кузнецов", "Григорий");
        map.put("Смирнов", "Сергей");
        map.put("Волков", "Александр");
        map.put("Лебедев", "Павел");
        map.put("Морозов", "Иван");
        map.put("Новиков", "Антон");
        map.put("Федоров", "Дмитрий");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (String firstName : map.values()) {
            if (firstName.equals(name)) {count++;}}
        return count;}

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (String lastNameKey : map.keySet()) {
            if (lastNameKey.equals(lastName)) {count++;}}
        return count;}

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        System.out.println(getCountTheSameFirstName(map, "Иван"));
        System.out.println(getCountTheSameLastName(map, "Иванов"));
    }
}
