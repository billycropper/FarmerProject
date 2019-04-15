import java.util.ArrayList;

public abstract class Plant {
    private boolean hasBeenHarvested;


    public Plant(boolean hasBeenHarvested){
        this.hasBeenHarvested = hasBeenHarvested;
    }
    public Plant(){

    }

    public void setHasBeenHarvested(boolean harvested){
        hasBeenHarvested = harvested;
    }
    public boolean getHasBeenHarvested(){
        return hasBeenHarvested;
    }
    public abstract ArrayList getCropsOnPlant();


}
