public class Earcorn extends Crop implements IProduce, IEdible{
    private boolean harvested;
    private boolean fertilized;
    private Earcorn earcorn;
    public Earcorn(boolean harvested, boolean fertilized){

    }
    public Earcorn(){

    }
    public boolean isHaveBeenHarvested() {
        return harvested;
    }
    public void setHaveBeenHarvested(boolean harvested) {
        this.harvested = harvested;
    }
    public boolean isHaveBeenFertilized() {
        return fertilized;
    }
    public void setHaveBeenFertilized(boolean fertilized) {
        this.fertilized = fertilized;
    }
    public Object yield(){
        return earcorn;
    }
    public boolean hasBeenHarvested(){
        return isHaveBeenHarvested();
    }
    public boolean hasBeenFertilized(){
        return isHaveBeenFertilized();
    }
    public boolean isEdible(){
        return isHaveBeenHarvested() && isHaveBeenFertilized();
    }
}
