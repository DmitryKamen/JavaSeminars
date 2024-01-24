package JavaSeminars.sem6;

import java.util.HashSet;

public class T1 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice"); // Дубликаты не добавятся

        System.out.println(names); // Выведет: [Alice, Bob, Charlie]

        names.remove("Alice"); // Удаляем элемент 10

        System.out.println(names); // Выведет: [5, 15]

        boolean containsBanana = names.contains("banana");
        System.out.println("Contains banana: " + containsBanana); // Выведет: Contains banana: true

        boolean empty = names.isEmpty();
        System.out.println("Is the set empty? " + empty); // Выведет: Is the set empty? true

        int vowelCount = names.size();
        System.out.println("Number of vowels: " + vowelCount); // Выведет: Number of vowels: 5

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("Before clear: " + numbers); // Выведет: Before clear: [1, 2, 3]

        numbers.clear(); // Очищаем множество

        System.out.println("After clear: " + numbers); // Выведет: After clear: []
    }
}
