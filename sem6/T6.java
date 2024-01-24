package JavaSeminars.sem6;

import java.util.HashSet;

public class T6 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Object[] numberArray = numbers.toArray();

        for (Object num : numberArray) {
            System.out.println(num);
        }
    }
}
