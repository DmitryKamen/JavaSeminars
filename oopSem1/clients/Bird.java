package JavaSeminars.oopSem1.clients;

import java.time.LocalDate;

public class Bird extends Animal {
    public Bird(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness); //Сходи в род.класс и вызови 4 параметра
    }

    public Bird(){
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
    // // Домашнее
    // public void fly() { 
    //     System.out.println("Животное - " +nickName+ " Летает"); 
    // }
    // Домашнее 
    @Override
    public void swim() {
        System.out.println("Животное - " +nickName+ " Не Плавает");
    }
}
