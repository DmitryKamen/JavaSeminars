package JavaSeminars.oopSem1.clients;

// import java.util.ArrayList;
// import java.util.List;




public class VeterinaryClinic {
    String title;
    
    public VeterinaryClinic(String title) {
         
            this.title = title;
                      
        }
    
    public VeterinaryClinic() {
            this( "Аврора");
        
        }
    
    
    public void whatCanDo(Animal animal){
        if (animal instanceof Goable) System.out.println("Ходит");
        if (animal instanceof Flyable) System.out.println("Летает");
        if (animal instanceof Swimable) System.out.println("Плавает");
    }


    public void doctorsControleNurseWorkind(Doctor doctor, Nurse nurse){
        System.out.println("Доктор "+ doctor + " Поставил задачи и контролирует работу медсестры " + nurse);
    }

    public void nurseReports(Doctor doctor, Nurse nurse){
        System.out.println("Медсеста "+ nurse + " Сообщает о состоянии больных в клинике доктору " + doctor);
    }

    // public ArrayList<Animal> takeList(Animal animal) { 
    //     List<Animal> list = new ArrayList<Animal>();
    //     list.add(animal);
    // return (ArrayList<Animal>) list;
        
    // }

    // public List<Goable> getCanGo(Cat animal) {
    //     List<Goable> result = new ArrayList<>();
    //         try { result.add((Goable) animal);} 
    //         catch  (Exception e) {
    //     }
    //     return result;
    // }

    // public List<Flyable> getCanFly(Animal animal) {
    //     List<Flyable> result = new ArrayList<>();
    //         try { result.add((Flyable) animal);} 
    //         catch  (Exception e) {
    //     }
    //     return result;
    // }

    // public List<Swimable> getCanSwim(Animal animal) {
    //     List<Swimable> result = new ArrayList<>();
    //         try { result.add((Swimable) animal);} 
    //         catch  (Exception e) {
    //     }
    //     return result;
    // }
    
}

