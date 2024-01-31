package JavaSeminars.oopSem1.clients;

import java.time.LocalDate;

public class Fish extends Animal implements Swimable {
    public Fish(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness); //Сходи в род.класс и вызови 4 параметра
    }

    public Fish(){
        super();
    }

    @Override
    public void swim() {
        System.out.println("Can swim " + getSwimSpeed(20));
    }



    // Домашнее
    // @Override
    // public void aktion() {
    //     toGo();
    //     fly();
    //     swim();
    // }
    // Домашнее
    // @Override
    // public void toGo() { 
    //     System.out.println("Животное - " +nickName+ " Не Ходит"); 
    // }
    // // Домашнее
    // @Override
    // public void fly() { 
    //     System.out.println("Животное - " +nickName+ " Не Летает"); 
    // }
    // Домашнее 

    // public void swim() {
    //     System.out.println("Животное - " +nickName+ " Плавает");
    // }
}
