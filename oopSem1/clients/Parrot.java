package JavaSeminars.oopSem1.clients;

import java.time.LocalDate;

public class Parrot extends Animal implements Flyable{
    public Parrot(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness); //Сходи в род.класс и вызови 4 параметра
    }

    public Parrot(){
        super();
    }

    @Override
    public void fly() {
        System.out.println("Can fly " + getFlySpeed(30));
    }

}
