package classwork_3;

import java.util.*;

public class Task20 {
    public static void main(String[] args) {
        ex2();
    }
    static void ex2(){
        /*
        Создать список типа ArrayList
        Поместить в него как строки, так и целые числа.
        Пройти по списку, найти и удалить целые числа.
        */
        List list = new ArrayList();
        list.add(4);
        list.add("15");
        list.add("Привет");
        list.add("Привет");
        list.add(77);
        list.add(5);
        list.add(4.5);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()){
//            Object o = iterator.next();
//            if (o instanceof Integer){
//                iterator.remove();
//            }
//        }
    }
}
