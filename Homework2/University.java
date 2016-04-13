/**
 * Created by Sasha on 22.03.2016.
 */
public class University {
    protected String name;
    protected String address;
    protected int giveSalary;
    protected Worker[] workersArray;
    protected int number;

    public University() {
        this.workersArray = new Worker[100];
        this.number = 0;

    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setgiveSalary(int giveSalary) {
        this.giveSalary = giveSalary;
    }

    public void addWorker(Worker worker) {
        this.workersArray[this.number] = worker;
        this.number++;
    }

    public String toString() {
        String result = "Need to get salary " + this.giveSalary + " for the workers at the University " + this.name + " on address " + this.address + ":\n--------\n";
        for(int i = 0; i < this.number; i++) {
            result += this.workersArray[i].toString() + "\n--------\n";
        }
        return result;
    }

}

