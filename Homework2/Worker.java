/**
 * Created by Sasha on 22.03.2016.
 */
public class Worker {
    protected String surname;
    protected String name;
    protected String workshop;
    protected int category;
    protected int roomCabinet;
    protected String homeAddress;

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkshop(String workshop) {
        this.workshop = workshop;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public void setRoomCabinet (int roomCabinet) {
        this.roomCabinet = roomCabinet;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String toString() {
        return   "Surname: " + this.surname + "\nName: " + this.name + "\nWorkshop: " + this.workshop + "\nCategory: " + this.category + "\nRoomCabinet: " + this.roomCabinet + "\nHomeAddress: " + this.homeAddress;
    }

}
