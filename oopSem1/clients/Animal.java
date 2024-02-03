package JavaSeminars.oopSem1.clients;

import java.time.LocalDate;

public abstract class Animal {

    // protected видно в классе и во всех наследниках
    protected String nickName;
    protected Owner owner;
    protected LocalDate birthDate;
    protected Illness illness;

    // Это пустой конструктор (по умолчанию)
    public Animal(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        this.nickName = nickName;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
    }

    public Animal() {
        this("Кличка", new Owner("Хозяин"), LocalDate.now(), new Illness("Болеет"));
    }

    public String getNickName() {
        return nickName;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }
    
    // public abstract void eat(); Абстрактный метод

    // public void lifeCycle() {
    //     wakeUp();
    //     hunt();
    //     eat();
    //     sleep();
    // }
    // Домашнее
    // public void aktion() {
    //     toGo();
    //     fly();
    //     swim();
    // }

    // private void wakeUp() {
    //     wakeUp("12:00");
    // }

    // private void wakeUp(String time) {
    //     System.out.println("Животное " + nickName + " проснулось в " + time);
    // }

    public String getType() {
        return getClass().getSimpleName();
    }

    // private void hunt() {
    //     System.out.println("Животное охотится!");
    // }

    public void eat() {
        // System.out.println("Животное ест!");
    }

    // private void sleep() {
    //     System.out.println("Животное уснуло!");
    // }
    // Домашнее
    // public void toGo() {
    //     System.out.println("Животное - " +nickName+ " Ходит");
    // }
    // // Домашнее
    // public void fly() {
    //     System.out.println("Животное - " +nickName+ " Летает!");
    // }
    // // Домашнее
    // public void swim() {
    //     System.out.println("Животное - " +nickName+ " Плавает!");
    // }

    @Override
    public String toString() {
        return String.format("nickName = %s, bd = %s, owner = %s, illness = %s", nickName, birthDate, owner, illness);
    }
}