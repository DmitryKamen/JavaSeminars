package JavaSeminars.oopSem1.clients;

import java.time.LocalDate;

public class Turtle extends Animal implements Swimable {
    public Turtle(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness); //Сходи в род.класс и вызови 4 параметра
    }

    public Turtle(){
        super();
    }

    @Override
    public void swim() {
        System.out.println("Can swim " + getSwimSpeed(5));
    }


}
