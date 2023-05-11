package classwork_4;

import java.util.*;

public class Task26 {
    public static void main(String[] args) {
        ex0();
    }
    static void ex0(){
        /*
       1) Замерьте время, за которое в ArrayList
       добавятся 10000 элементов.
       2) Замерьте время, за которое в LinkedList
       добавятся 10000 элементов.
       Сравните с предыдущим.
       */
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list1.add(0, i);
        }
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart);
    }
}
