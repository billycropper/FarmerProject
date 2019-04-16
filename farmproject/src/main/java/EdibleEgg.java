public class EdibleEgg implements IProduce, IEdible{
    private boolean haveBeenHarvested;
    private boolean haveBeenFertilized;
    private EdibleEgg edibleegg;
    public EdibleEgg(String color, int legs, int eyes, boolean haveBeenHarvested, boolean haveBeenFertilized) {
        super(color, legs, eyes);
        this.haveBeenHarvested = haveBeenHarvested;
        this.haveBeenFertilized = haveBeenFertilized;
    }
    public EdibleEgg(boolean haveBeenHarvested, boolean haveBeenFertilized){
        this. haveBeenFertilized = haveBeenFertilized;
        this.haveBeenHarvested = haveBeenHarvested;
    }
    public boolean getHaveBeenHarvested() {
        return haveBeenHarvested;
    }
    public void setHaveBeenHarvested(boolean haveBeenHarvested) {
        this.haveBeenHarvested = haveBeenHarvested;
    }
    public boolean getHaveBeenFertilized() {
        return haveBeenFertilized;
    }
    public void setHaveBeenFertilized(boolean haveBeenFertilized) {
        this.haveBeenFertilized = haveBeenFertilized;
    }
    public Object yield(){
        return edibleegg;
    }
    public boolean hasBeenHarvested(){
        return getHaveBeenHarvested();
    }
    public boolean hasBeenFertilized(){
        return getHaveBeenFertilized();
    }
    public boolean isEdible(){
        return getHaveBeenHarvested();
    }
}
