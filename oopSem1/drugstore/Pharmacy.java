package JavaSeminars.oopSem1.drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterator<Component> {
    List<Component> components = new ArrayList<>();
    private int index = 0;
    public int pharmacyPower;

    public void addComponents(Component ... components) {
        for(Component c : components){
            this.components.add(c);
        }
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Component next() {
        return components.get(index++);
    }

    
    
}
