import java.util.ArrayList;

public class Stable {
    private ArrayList<Horse> horses = new ArrayList<Horse>();

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    public void setHorses(ArrayList<Horse> horses) {
        this.horses = horses;
    }
    public void addHorse(Horse horse){
        horses.add(horse);
    }
    public void removeHorse(Horse horse){
        horses.remove(horse);
    }

    public Stable(ArrayList<Horse> horses) {
        this.horses = horses;
    }
    public String stableToString(){
        return horses.toString();
    }

    @Override
    public String toString() {
        return " Stable contains " + stableToString();
    }
}
