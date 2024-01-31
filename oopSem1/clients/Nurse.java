package JavaSeminars.oopSem1.clients;

public class Nurse {
    String fistName;
    String lastName;

    public Nurse(String fistName, String lastName) {
         
        this.fistName = fistName;
        this.lastName = lastName;
              
    }

    public Nurse() {
        this("Медсестра", "СестраПоДефодту");
    
    }

    public void conductsSurveillance(Animal nickName) {
        System.out.println("Животное - " +nickName+ "Под наблюдением, указания доктора выполняются");
    }

    @Override
    public String toString() {
        return String.format("firstName = %s, lastName = %s", fistName, lastName);
    }
}
