public class Farm {
    private Stable stable;
    private  ChickenCoop chickenCoop;
    private FarmHouse farmHouse;

    public Farm(Stable stable, ChickenCoop chickenCoop, FarmHouse farmHouse) {
        this.stable = stable;
        this.chickenCoop = chickenCoop;
        this.farmHouse = farmHouse;
    }

    public Stable getStable() {
        return stable;
    }

    public void setStable(Stable stable) {
        this.stable = stable;
    }

    public ChickenCoop getChickenCoop() {
        return chickenCoop;
    }

    public void setChickenCoop(ChickenCoop chickenCoop) {
        this.chickenCoop = chickenCoop;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public void setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
    }
}
