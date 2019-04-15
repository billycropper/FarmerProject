public class CropDuster extends FarmerVehicle {

    public CropDuster(int wheels, int windows, int door) {
        super(wheels, windows, door);
    }
    public boolean makeNoise() {
        return true;
    }

    public boolean ridable() {
        return true;
    }
}
