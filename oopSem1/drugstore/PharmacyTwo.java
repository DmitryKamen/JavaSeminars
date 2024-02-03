package JavaSeminars.oopSem1.drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PharmacyTwo implements Iterable<Component>,Comparable<PharmacyTwo> {
    private List<Component> components = new ArrayList<>();
    private int index = 0;
    private int pharmacyPower;
    private Double pharmacyWeight = 0.0;


    public void addComponents(Component ... components) {
        for(Component c : components){
            this.components.add(c);
            this.pharmacyPower += c.getPower();
            this.pharmacyWeight += c.getWeight();
        }
    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() { //Анонимный класс

            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }


    @Override
    public String toString() {
        return String.format("list = %s, powerRes = %s, weightRes = %s", components, pharmacyPower, pharmacyWeight);
    }

    @Override
    public int compareTo(PharmacyTwo o) {
        if (this.pharmacyPower - o.pharmacyPower == 0) {
            return (int)(this.pharmacyWeight - o.pharmacyWeight);
        }
        else return this.pharmacyPower - o.pharmacyPower;
    }
}

