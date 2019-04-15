public class Tomato extends Crop implements IProduce {
    private boolean beenFertilized;
    private boolean beenHarvested;
    private Tomato tomato;
    public Tomato(boolean beenFertilized, boolean beenHarvested) {
        this.beenFertilized = beenFertilized;
        this.beenHarvested = beenHarvested;
    }
    public Tomato() {

    }
    public boolean isHaveBeenHarvested() {
        return beenHarvested;
    }
    public void setHaveBeenHarvested(boolean beenHarvested) {
        this.beenHarvested = beenHarvested;
    }
    public boolean isHaveBeenFertilized() {
        return beenFertilized;
    }
    public void setHaveBeenFertilized(boolean beenFertilized) {
        this.beenFertilized = beenFertilized;
    }
    public Object yield() {
        return tomato;
    }
    public boolean hasBeenHarvested() {
        return isHaveBeenHarvested();
    }
    public boolean hasBeenFertilized() {
        return isHaveBeenFertilized();
    }
    public boolean isEdible() {
        return isHaveBeenHarvested() && isHaveBeenFertilized();
    }
}

