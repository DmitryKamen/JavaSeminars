package JavaSeminars.oopSem1.list.core.lists;

import java.util.Iterator;

import JavaSeminars.oopSem1.list.core.GBList;

public class GBLinkedList<T> implements GBList<T> {

   private Node<T> head;
   private int size;



    @Override
    public void add(T elem) {
        Node<T> newNode = new Node<>();
        newNode.value = elem;
        newNode.next = head;
        newNode.previous = null;

        if (head != null) {
            head.previous = newNode;

        }
        head = newNode;
        size++;
    }

    @Override
    public void remove(int index) {
        if (isOutOfBounds (index)) {
            throw new IndexOutOfBoundsException( "Index: " + index + ", size: " + size() );
        }
        if (index == 0){
            head.previous = null;
        } 
        else {
            Node<T> curent = head;
            for (int i = 0; i != index; i++) {
                curent = curent.next;
            }
            if (curent.next != null){
                curent.next.previous = curent.previous;
            }
            curent.previous.next = curent.next;
        }
        size--;
    }

    @Override
    public T get(int index) {
        if (isOutOfBounds (index)) {
            throw new IndexOutOfBoundsException( "Index: " + index + ", size: " + size() );
        }
        Node<T> curent = head;
        for (int i = 0; i < index; i++) {
            curent = curent.next;
        }
        return curent.value;
    }

    @Override
    public int size() {
        return size;
    }

    private boolean isOutOfBounds (int index) {
        return index < 0 || index >=size();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        Node<T> curent = head;
        while (curent != null) {
            builder.append(curent.value).append(", ");
            curent = curent.next;
        }
        if (builder.length() == 1)
            return "[]";
        builder.deleteCharAt(builder.length() - 1).deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            Node<T> prev = null;
            Node<T> curent = head;
            @Override
            public boolean hasNext() {
                return curent != null;
            }
            @Override
            public T next() {
                prev = curent;
                curent = curent.next;
                return prev.value;
            }
        };
    }
    
}
