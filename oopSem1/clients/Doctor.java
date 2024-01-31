package JavaSeminars.oopSem1.clients;



public class Doctor {
    String fistName;
    String lastName;

    public Doctor(String fistName, String lastName) {
         
        this.fistName = fistName;
        this.lastName = lastName;
              
    }

    public Doctor() {
        this("Доктор", "ПоДефодту");
    
    }

    public void makesDiagnosis(Animal nickName) {
        System.out.println("Животное - " +nickName+ "Диагноз установлен");
    }

    public void prescribesTreatment( Animal nickName ) {
        System.out.println("Животное - " +nickName+ "Лечение назначенно");
    }



    @Override
    public String toString() {
        return String.format("firstName = %s, lastName = %s", fistName, lastName);
    }

    
}
