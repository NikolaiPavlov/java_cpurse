package homework_4;

public class Task32 {
    public static void main(String[] args) {
        Task2();
    }
    static void Task2(){
        /*
        Реализуйте очередь с помощью LinkedList со следующими методами:
        enqueue() - помещает элемент в конец очереди,
        dequeue() - возвращает первый элемент из очереди и удаляет его,
        first() - возвращает первый элемент из очереди, не удаляя.
         */
        MyEnqueue enqueue = new MyEnqueue();
        enqueue.enqueue("one");
        enqueue.enqueue("two");
        enqueue.enqueue("three");
        System.out.println(enqueue);
        System.out.println("----------------------");
        System.out.println("возвращаем первый элемент из очереди и удаляем его:");
        System.out.println("первый элемент: " + enqueue.dequeue());
        System.out.println(enqueue);
        System.out.println("----------------------");
        System.out.println("возвращаем первый элемент из очереди не удаляя его:");
        System.out.println("первый элемент: " + enqueue.first());
        System.out.println(enqueue);
    }
}
