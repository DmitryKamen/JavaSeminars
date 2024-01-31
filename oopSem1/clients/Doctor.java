package JavaSeminars.oopSem1.clients;



public class Doctor {
    private String firstName;
    private String lastName;

    public Doctor(String firstName, String lastName) {
         
        this.firstName = firstName;
        this.lastName = lastName;
              
    }

    public Doctor() {
        this("Доктор", "ПоДефодту");
    
    }

    public void makesDiagnosis(Animal nickName) {
        System.out.println("Животное - " +nickName.getNickName()+ " Диагноз установлен");
    }

    public void prescribesTreatment( Animal nickName ) {
        System.out.println("Животное - " +nickName.getNickName()+ " Лечение назначенно");
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }


    @Override
    public String toString() {
        return String.format("firstName = %s, lastName = %s", firstName, lastName);
    }

    
}
