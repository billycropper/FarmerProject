public class Chicken extends Animal implements IProduce, IEater {

    public Chicken(String color, int legs, int eyes)
    {super(color, legs, eyes);}

    public boolean makeNoise(){
        return true;
    }

    public void eat(){

    }

    public void yield(){

    }
    public boolean edible(){
        return true;
    }
    public boolean hasBeenHarvested(){
        return true;
    }
    public boolean hasBeenFertilized(){
        return true;
    }
}
