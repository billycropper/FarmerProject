public abstract class Crop implements IProduce{

    public Crop() {
    }

    public void yield() {

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
