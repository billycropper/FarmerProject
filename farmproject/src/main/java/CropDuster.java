public class CropDuster extends FarmerVehicle {

    public CropDuster(int wheels, int windows, int door) {
        super(wheels, windows, door);
    }
    public boolean makeNoise() {
        return true;
    }

    private boolean hasBeenFerilized;


    public boolean getHasBeenFerilized() {
        return hasBeenFerilized;
    }

    public void setHasBeenFerilized(boolean hasBeenFerilized) {
        this.hasBeenFerilized = hasBeenFerilized;
    }

    public void dustField(){

        if (hasBeenFerilized == hasBeenFerilized){
            hasBeenFerilized = true;
        }
        else if (hasBeenFerilized != hasBeenFerilized){
            hasBeenFerilized = false;}

    }

//prototype method for IAirCraft
    public boolean fly() {
        return false;
    }
}