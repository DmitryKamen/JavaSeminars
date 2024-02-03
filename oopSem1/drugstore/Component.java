package JavaSeminars.oopSem1.drugstore;

public abstract class Component implements Comparable<Component> {
    private String title;
    private Double weight;
    private int power;

    public Component(String title, Double weight, int power) { //ALT + Insert
        this.title = title;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString() {
        return String.format("Title = %s, power = %s, weight = %s", title, power, weight);
    }

    @Override
    public int compareTo(Component o) {
//  return this.power - o.power;
        return Integer.compare(this.power, o.power);
//  Примеры с семинара
//    if(this.power < o.power){
//        return -1;
//    }
//    else if (this.power > o.power){
//        return 1;
//    }
//    else return 0;
    }

    public int getPower() {
        return power;
    }

    public Double getWeight() {
        return weight;
    }
}
