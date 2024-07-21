package task0817;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        HashSet<String> names = new HashSet<>();
        HashSet<String> duplicates = new HashSet<>();
        for (String name : map.values()) {
            if (!names.add(name)) {duplicates.add(name);}}

        for (String duplicate : duplicates) {
            removeItemFromMapByValue(map, duplicate);}}



    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());}}
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());}
    }
}
