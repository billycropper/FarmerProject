public class Horse extends Animal implements IRidable {

    public Horse (String color, int legs, int eyes)
    {super(color, legs, eyes);}

    public boolean makeNoise(){
        return true;
    }

    public void eat(){

    }

    public boolean canRide() {
        return true;
    }

    public boolean ridable(){
        return true;
    }

}
