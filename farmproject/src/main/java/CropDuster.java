public class CropDuster extends FarmerVehicle implements IAirCraft {

    public CropDuster(int wheels, int windows, int door) {
        super(wheels, windows, door);
    }
    public boolean makeNoise() {
        return true;
    }

    public boolean ridable() {
        return true;
    }

    public boolean fertilize(){
        return true;
    }

    public boolean fly() {
        return false;
    }

    public boolean operate(){
        return true;
    }
}
