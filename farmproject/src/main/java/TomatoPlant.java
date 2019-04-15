import java.util.ArrayList;

public class TomatoPlant extends Plant{

    private ArrayList<Crop> tomatoesOnPlant;
    Tomato tomato = new Tomato();

    public TomatoPlant(boolean hasBeenHarvested, ArrayList<Crop> tomatoesOnPlant) {
        super(hasBeenHarvested);
        this.tomatoesOnPlant = tomatoesOnPlant;
        tomatoesOnPlant.add(tomato);
        tomatoesOnPlant.add(tomato);
        tomatoesOnPlant.add(tomato);
        tomatoesOnPlant.add(tomato);
        tomatoesOnPlant.add(tomato);
    }

    @Override
    public String toString() {
        String str = "";
        for(int i = 0; i < tomatoesOnPlant.size(); i++){
            str += "\n" + tomatoesOnPlant.get(i);
        }
        return "\n" + "TomatoPlant" + str +"\n\n";
    }

    public void setCropsOnPlant(ArrayList<Crop> tomatoes) {
        tomatoesOnPlant = tomatoes;
    }
    public ArrayList getCropsOnPlant() {
        return tomatoesOnPlant;
    }
    public Crop getTomato() {
        int index = tomatoesOnPlant.size() - 1;
        return tomatoesOnPlant.get(index);
    }

    public static void main(String[] args) {

        ArrayList<Crop> tomatoesOnStalk = new ArrayList<Crop>();
        TomatoPlant tomatoPlant = new TomatoPlant(false, tomatoesOnStalk);
        System.out.println(tomatoPlant.getTomato());
        System.out.println(tomatoPlant.getCropsOnPlant());

    }
}
