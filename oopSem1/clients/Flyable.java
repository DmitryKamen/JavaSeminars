package JavaSeminars.oopSem1.clients;

@FunctionalInterface
public interface Flyable {
    void fly();
    default double getFlySpeed(double speed){
        return speed;
    }
    
}
