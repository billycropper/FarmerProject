public abstract class FarmerVehicle extends Vehicle{

    public FarmerVehicle(int wheels, int windows, int door){
        super(wheels, windows, door);
    }

    public boolean makeNoise() {
        return true;
    }

    public boolean ridable() {
        return true;
    }
}

