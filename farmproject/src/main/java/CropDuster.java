public class CropDuster extends FarmerVehicle implements IAirCraft{

    int wings;

    public CropDuster(int wheels, int windows, int door, int wings) {
        super(wheels, windows, door);
        this.wings = wings;
    }

    public boolean makeNoise() { return true; }

    public boolean ridable() {
        return true;
    }

    private boolean hasBeenFerilized;
    private boolean isDusted;


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
