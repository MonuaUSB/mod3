package task0724;

/* 
Семейная перепись
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...


Requirements:
1. Программа не должна считывать данные с клавиатуры.
2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
3. Добавить в класс конструктор public Human(String name, boolean sex, int age).
4. Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
6. Выведи созданные объекты на экран.*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandfather1 = new Human("Алексей", true, 75);
        Human grandmother1 = new Human("Мария", false, 70);
        Human grandfather2 = new Human("Иван", true, 72);
        Human grandmother2 = new Human("Надежда", false, 68);
        Human father = new Human("Павел", true, 45, grandfather1, grandmother1);
        Human mother = new Human("Катя", false, 42, grandfather2, grandmother2);
        Human child1 = new Human("Анна", false, 20, father, mother);
        Human child2 = new Human("Игорь", true, 18, father, mother);
        Human child3 = new Human("Ольга", false, 15, father, mother);
        System.out.println(grandfather1);
        System.out.println(grandmother1);
        System.out.println(grandfather2);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        int age;
        boolean sex;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}