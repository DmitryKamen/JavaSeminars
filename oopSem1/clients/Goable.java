package JavaSeminars.oopSem1.clients;

@FunctionalInterface
public interface Goable {
    void go();
    default double getRunSpeed(double speed){
        return speed;
    }
    
}
