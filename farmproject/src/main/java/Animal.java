abstract class Animal implements IEater, INoiseMaker {

    private String color;
    private int legs;
    private int eyes;

    public Animal(String color, int legs, int eyes) {
        this.color = color;
        this.legs = legs;
        this.eyes = eyes;

    }

    public Animal() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }


    public boolean makeNoise() {
        return true;

    }

    public void eat(){

    }
}








