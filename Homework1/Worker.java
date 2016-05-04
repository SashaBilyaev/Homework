/**
 * Created by Sasha on 22.02.2016.
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

    public String getSurname() {return surname;}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {return name;}

    public void setWorkshop(String workshop) {
        this.workshop = workshop;
    }

    public String getWorkshop() {return workshop;}

    public void setCategory(int category) {
        this.category = category;
    }

    public int getCategory() {return category;}

    public void setRoomCabinet (int roomCabinet) {
        this.roomCabinet = roomCabinet;
    }

    public int getRoomCabinet() {return roomCabinet;}

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getHomeAddress() {return homeAddress;}

    public String read() {
        String result = "About Worker \nSurname: " + this.surname + "\nName: " + this.name + "\nWorkshop: " + this.workshop + "\nCategory: " + this.category + "\nRoomCabinet: " + this.roomCabinet + "\nHomeAddress: " + this.homeAddress;
        return result;
    }

}
