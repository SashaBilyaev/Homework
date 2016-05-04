/**
 * Created by Sasha on 22.02.2016.
 */
 
public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker ();

        worker.setSurname("Bilyaev");
        worker.setName("Sasha");
        worker.setWorkshop("Metallurgy");
        worker.setCategory(2);
        worker.setRoomCabinet(17);
        worker.setHomeAddress("Cherkasy");

        System.out.println(worker.read());
    }
}

