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

    public void dustField(Field field){

        if (getHasBeenFerilized() == true){

            System.out.println(" These crop has been fertilized. ");
        }
        else if (getHasBeenFerilized() == false) {

            System.out.println(" Let's not forget these crops...");

            setHasBeenFerilized(true);
        }
    }


//prototype method for IAirCraft
    public boolean fly() {
        return false;
    }
}
