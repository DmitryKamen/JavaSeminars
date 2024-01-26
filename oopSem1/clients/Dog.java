package JavaSeminars.oopSem1.clients;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness); //Сходи в род.класс и вызови 4 параметра
    }

    public Dog(){
        super();
    }

    // Домашнее
    // @Override
    // public void aktion() {
    //     toGo();
    //     fly();
    //     swim();
    // }
    // Домашнее
    // public void toGo() { 
    //     System.out.println("Животное - " +nickName+ " Ходит"); 
    // }
    // Домашнее
    @Override
    public void fly() { 
        System.out.println("Животное - " +nickName+ " Не Летает"); 
    }
    // Домашнее 
    @Override
    public void swim() {
        System.out.println("Животное - " +nickName+ " Не Плавает");
    }
}
