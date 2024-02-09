package JavaSeminars.oopSem1.list;

import JavaSeminars.oopSem1.list.core.GBList;
import JavaSeminars.oopSem1.list.core.lists.GBLinkedList;

public class Main {
    public static void main(String[] args) {
        
        GBList<Integer> list = new GBLinkedList();
        list.add(30);
        list.add(31);
        list.add(33);
        list.add(34);
        list.add(35);
        System.out.println(list);
        System.out.println(list.size());

        System.out.println("Index = 2 " + list.get(2));
        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());
    //     for (int elem : list) {
    //         System.out.println(elem);
    // }
}
}
