package JavaSeminars.oopSem1.list;

import JavaSeminars.oopSem1.list.core.GBList;
import JavaSeminars.oopSem1.list.core.lists.GBArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        GBList<Integer> list = new GBArrayList<>();

        list.add(3);
        list.add(5);
        list.add(6);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());

    }
}