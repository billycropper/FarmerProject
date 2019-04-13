import java.util.ArrayList;

public class FarmHouse {
    private ArrayList<Person> peoples = new ArrayList<Person>();

    public ArrayList<Person> getPeoples() {
        return peoples;
    }

    public void setPeoples(ArrayList<Person> peoples) {
        this.peoples = peoples;
    }

    public FarmHouse(ArrayList<Person> peoples) {
        this.peoples = peoples;
    }

    public void addPerson(Person person){
        peoples.add(person);
    }
    public void removePerson(Person person){
        peoples.remove(person);
    }

    public String farmHouseToString(){
        return peoples.toString();
    }

    @Override
    public String toString() {
        return " FarmHouse contains " + farmHouseToString();
    }
}
