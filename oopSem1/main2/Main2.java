package JavaSeminars.oopSem1.main2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import JavaSeminars.oopSem1.clients.Animal;
import JavaSeminars.oopSem1.clients.Bird;
import JavaSeminars.oopSem1.clients.Cat;
import JavaSeminars.oopSem1.clients.Doctor;
import JavaSeminars.oopSem1.clients.Fish;
import JavaSeminars.oopSem1.clients.Goable;
import JavaSeminars.oopSem1.clients.Illness;
import JavaSeminars.oopSem1.clients.Nurse;
import JavaSeminars.oopSem1.clients.Owner;
import JavaSeminars.oopSem1.clients.VeterinaryClinic;

public class Main2 {
    public static void main(String[] args) {
        Animal cat1 = new Cat ("Персик", new Owner("Сергей Валерьевич"), //Создаём экземпляр класса по Домашней работе
        LocalDate.of(2021, 10, 05), new Illness("Лишай"),  5.0);

        Animal fish1 = new Fish ("Гуппи", new Owner("Сергей Валерьевич"), //Создаём экземпляр класса по Домашней работе
        LocalDate.of(2021, 10, 05), new Illness("Неизвестно"));
        Animal bird1 = new Bird ("Сокол", new Owner("Сергей Валерьевич"), //Создаём экземпляр класса по Домашней работе
        LocalDate.of(2021, 10, 05), new Illness("Неизвестно"));
        VeterinaryClinic v = new VeterinaryClinic();
        Doctor d1 = new Doctor("Дмитрий"  , "Валерьевич");
        Nurse n1 = new Nurse("Марина"  , "Дмитриевна");

        v.whatCanDo(cat1); // проверка работы кода 
        ((Cat) cat1).go(); // проверка работы кода 
        v.doctorsControleNurseWorkind(d1, n1);
        v.nurseReports(d1, n1);
        d1.makesDiagnosis(cat1); // решен вопрос со статикой это хорошо
    }
}
