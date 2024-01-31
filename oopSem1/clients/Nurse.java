package JavaSeminars.oopSem1.clients;

public class Nurse {
    private String firstName;
    private String lastName;

    public Nurse(String firstName, String lastName) {
         
        this.firstName = firstName;
        this.lastName = lastName;
              
    }

    public Nurse() {
        this("Медсестра", "СестраПоДефодту");
    
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void conductsSurveillance(Animal nickName) {
        System.out.println("Животное - " +nickName.getNickName()+ "Под наблюдением, указания доктора выполняются");
    }

    @Override
    public String toString() {
        return String.format("firstName = %s, lastName = %s", firstName, lastName);
    }
}
