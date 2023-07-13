package classwork_6;

import java.util.*;

public class Task44 {
    /*
    1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
    а) информационной системой ветеринарной клиники
    б) архивом выставки котов
    в) информационной системой Театра кошек Ю. Д. Куклачёва
    Можно записатьв текстовом виде, не обязательно реализовывать в Java.
    */
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик", "Мейнкун", 10, "Василий Петрович");
        Cat cat2 = new Cat("Васька", "Персидская", 8, "Иван");
        Cat cat3 = new Cat("Васька", "Персидская", 8, "Иван");
        Cat cat4 = new Cat("Степув", "Неизвестна", 8, "Светлана");
//        System.out.println(cat1);
//        System.out.println(cat2);
//        System.out.println(cat3);

        Set<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
//        for (Cat cat: cats){
//            System.out.println(cat);
//        }
        for (Cat cat : cats) {
            if (cat.getAge() == 8) {
                System.out.println(cat);
            }
        }
    }
}
