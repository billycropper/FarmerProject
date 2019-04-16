public abstract class Crop implements IProduce{
    private Crop crop;

    public Crop() {
    }
    public Object yield(){
        return crop;
    }
    public boolean edible() {
        return false;
    }
    public boolean hasBeenHarvested() {
        return false;
    }
    public boolean hasBeenFertilized() {
        return false;
    }
}
