package classwork_3;

import java.util.*;
public class Task21 {
    public static void main(String[] args) {
        ex3();
    }
    static void ex3(){
        /*
        Каталог товаров книжного магазина сохранен в виде
        двумерного списка List<ArrayList<String>> так, что на 0й позиции
        каждого внутреннего списка содержится название жанра,
        а на остальных позициях - названия книг.
        Напишите метод для заполнения данной структуры.
        */

        //фантастика, гарри поттер, ночной дозор
        //роман, война и мир
        //сказки, репка, колобок
        List<List<String>> shopBook = new ArrayList<>();
        addBook(shopBook, "фентези", "гарри поттер");
        addBook(shopBook, "сказки", "репка");
        addBook(shopBook, "фентези", "ночной дозор");
        addBook(shopBook, "роман", "война и мир");
        addBook(shopBook, "сказки", "колобок");
        System.out.println(shopBook);
    }
    static void addBook(List<List<String>> shopBook, String genre, String name){
        for (int i = 0; i < shopBook.size(); i++) {
            if (shopBook.get(i).get(0).equalsIgnoreCase(genre)){
                shopBook.get(i).add(name);
                return;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(genre);
        list.add(name);
        shopBook.add(list);
    }
}
