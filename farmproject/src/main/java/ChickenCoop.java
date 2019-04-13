import java.util.ArrayList;

public class ChickenCoop {
    private ArrayList<Chicken> chickens = new ArrayList<Chicken>();

    public ChickenCoop(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }

    public ArrayList<Chicken> getChickens() {
        return chickens;
    }
    public void addChicken(Chicken chicken){
        chickens.add(chicken);
    }
    public void removeChicken(Chicken chicken){
        chickens.remove(chicken);
    }
    public String chickensToString(){
        return chickens.toString();
    }

    @Override
    public String toString() {
        return " Chicken Coop contains " + chickensToString();
    }
}
