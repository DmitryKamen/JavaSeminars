package JavaSeminars.sem4;

import java.util.LinkedList;
import java.util.Queue;

class MyQueue<T> {
    // Напишите свое решение ниже
    Queue<T> q = new LinkedList<>();
public void enqueue(T element){
    // Напишите свое решение ниже
    q.add((T) element);
}

public T dequeue(){
    // Напишите свое решение ниже
    T removedElement = (T) q.remove();
    return removedElement ;
}

public T first(){
    // Напишите свое решение ниже
    T firstElement = (T) q.element();
    return firstElement;
}

public LinkedList<T> getElements() {
    // Напишите свое решение ниже
    LinkedList<T> elements = new LinkedList<T>();
    for(T element : q ) {
        elements.add((T) element);
    }
    return elements;
}
}


public class HT2 {
    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}
