public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame ();

        frame.setSurname("Bilyaev");
        frame.setName("Sasha");
        frame.setWorkshop("Metallurgy");
        frame.setCategory(2);
        frame.setRoomCabinet(17);
        frame.setHomeAddress("Cherkasy");

        System.out.println(frame.read());
    }
}
