package JavaSeminars.sem4;

import java.util.LinkedList;

class LLTasks {
    public LinkedList<Object> revert(LinkedList<Object> ll) {
        // Напишите свое решение ниже
        Object [] array = new Object[ ll.size() ];
        for ( int i = 0; i < ll.size(); i++ ) {
            array[i] = (Object) ll.get( i );
        }
        Object temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;

        }
        LinkedList<Object> result = new LinkedList<Object>();
        for ( int i = 0; i < array.length; i++ ) {
            result.add(array[i]);
        }
        return (LinkedList<Object>) result;

    }
}

public class HT1 {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();

        if (args.length == 0 || args.length != 4) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            ll.add(1);
            ll.add("One");
            ll.add(2);
            ll.add("Two");
        } else {
            ll.add(Integer.parseInt(args[0]));
            ll.add(args[1]);
            ll.add(Integer.parseInt(args[2]));
            ll.add(args[3]);
        }

        LLTasks answer = new LLTasks();
        System.out.println(ll);
        LinkedList<Object> reversedList = answer.revert(ll);
        System.out.println(reversedList);
    }
}
