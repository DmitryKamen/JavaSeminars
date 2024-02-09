package JavaSeminars.oopSem1.drugstore;


import java.util.*;

import org.w3c.dom.Comment;

import JavaSeminars.oopSem1.drugstore.components.Azitronite;
import JavaSeminars.oopSem1.drugstore.components.Penicillin;
import JavaSeminars.oopSem1.drugstore.components.Water;

public class Drugmain {

    public static void main(String[] args) {
        Component water = new Water("Water", 10D, 1);
        Component azitronite = new Azitronite("Azitronite", 2D, 14);
        Component penicillin = new Penicillin("penicillin", 1.6D, 6);


        PharmacyTwo p1 = new PharmacyTwo();
        p1.addComponents(water, azitronite);

        PharmacyTwo p2 = new PharmacyTwo();
        p2.addComponents(penicillin, water);

        PharmacyTwo p3 = new PharmacyTwo();
        p3.addComponents(azitronite, penicillin);

        List<Component> components = new ArrayList<>();

        components.add(azitronite);
        components.add(water);
        components.add(penicillin);

        

        List<PharmacyTwo> pharmacies = new ArrayList<>();
        pharmacies.add(p1);
        pharmacies.add(p2);
        pharmacies.add(p3);
        // System.out.println(pharmacies);

        Collections.sort(pharmacies);
        // System.out.println(pharmacies);
        
        
        Collections.sort(pharmacies);
        
        


        // Пример с итератором   
        // Iterator<Component> iterator = p1;
        // while (iterator.hasNext()) {
        //     System.out.println(p1.next().toString());
        // }
        
        // Пример с циклом
        // for (Component c : p2) {
        //     System.out.println(c);
        // }

        

    }
}