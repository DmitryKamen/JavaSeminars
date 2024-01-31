package JavaSeminars.oopSem1.clients;

@FunctionalInterface
public interface Swimable {
    void swim();
    default double getSwimSpeed(double speed){
        return speed;
    }
    
}
