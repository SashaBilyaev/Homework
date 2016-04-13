/**
 * Created by Sasha on 22.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        University university = new University();
        university.setName("CNU");
        university.setAddress("Shevchenko, 81");
        university.setgiveSalary(2500);

          Worker worker = new Worker ();

        worker.setSurname("Bilyaev");
        worker.setName("Sasha");
        worker.setWorkshop("Economy");
        worker.setCategory(1);
        worker.setRoomCabinet(7);
        worker.setHomeAddress("Cherkasy");
        university.addWorker(worker);

        worker = new Worker();
        worker.setSurname("Petrenko");
        worker.setName("Vasya");
        worker.setWorkshop("Tourism");
        worker.setCategory(2);
        worker.setRoomCabinet(17);
        worker.setHomeAddress("Cherkasy");
        university.addWorker(worker);

        worker = new Worker();
        worker.setSurname("Poltorachenko");
        worker.setName("Max");
        worker.setWorkshop("Tourism");
        worker.setCategory(3);
        worker.setRoomCabinet(25);
        worker.setHomeAddress("Cherkasy");
        university.addWorker(worker);



        System.out.println(university.toString());
    }
}
