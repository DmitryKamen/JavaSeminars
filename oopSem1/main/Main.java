package JavaSeminars.oopSem1.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import JavaSeminars.oopSem1.clients.Animal;
import JavaSeminars.oopSem1.clients.Bird;
import JavaSeminars.oopSem1.clients.Cat;
import JavaSeminars.oopSem1.clients.Dog;
import JavaSeminars.oopSem1.clients.Fish;
import JavaSeminars.oopSem1.clients.Illness;
import JavaSeminars.oopSem1.clients.Owner;

public class Main {
    public static void main(String[] args) {

        // Animal cat = new Animal("Солнышко", new Owner("Сергей Валерьевич"),
        //         LocalDate.of(2021, 10, 05), new Illness("Лишай")); //Создаём экземпляр класса
        Animal cat1 = new Cat ("Персик", new Owner("Сергей Валерьевич"), //Создаём экземпляр класса по Домашней работе
        LocalDate.of(2021, 10, 05), new Illness("Лишай"),  5.0);

        Animal fish1 = new Fish ("Гуппи", new Owner("Сергей Валерьевич"), //Создаём экземпляр класса по Домашней работе
        LocalDate.of(2021, 10, 05), new Illness("Неизвестно"));
        Animal bird1 = new Bird ("Сокол", new Owner("Сергей Валерьевич"), //Создаём экземпляр класса по Домашней работе
        LocalDate.of(2021, 10, 05), new Illness("Неизвестно"));

        // System.out.println(cat.getOwner());
        // System.out.println(cat.getNickName());
        // System.out.println("Болезнь:" + cat.getIllness());
        // System.out.println(cat.getNickName());
        // cat.setIllness(new Illness(null));
        // System.out.println("Болезнь:" + cat.getIllness());
        // Animal testAnimal = new Animal();
        // System.out.println(testAnimal.getNickName());
        // cat.lifeCycle();
        // Animal catty = new Cat();
        // Dog goodBoy = new Dog();
        // System.out.println(goodBoy.getType());
        // System.out.println(catty.getType());
        // System.out.println(catty);
        // Cat.meow();
        // List<Animal> animals = new ArrayList<Animal>();

        // animals.add(catty);
        // animals.add(goodBoy);
        // animals.add(cat);

        // int i = 0;
        // for (Animal animal : animals){
        //     System.out.println(i + " "+ animal);
        //     i++;
        // }
        // cat1.toGo(); // Домашнее Задание
        // cat1.fly(); // Домашнее Задание
        // cat1.swim(); // Домашнее Задание
        // fish1.toGo(); // Домашнее Задание
        // fish1.fly(); // Домашнее Задание
        // fish1.swim(); // Домашнее Задание
        // bird1.toGo(); // Домашнее Задание
        // bird1.fly(); // Домашнее Задание
        // bird1.swim(); // Домашнее Задание
    }
}
