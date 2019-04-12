public abstract class Vehicle implements INoiseMaker, IRidable {

    private int wheels;
    private int windows;
    private int doors;

    public Vehicle(){

    }

    public Vehicle(int wheels, int windows, int doors) {
        this.wheels = wheels;
        this.windows = windows;
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean makeNoise() {
        return true;
    }

    public boolean ridable() {
        return true;
    }
}
