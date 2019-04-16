public class Farmer extends Person implements IBotanist{

    public Farmer(String name, int eyes, boolean nose, boolean mouth){
        super(name, eyes, nose, mouth);
    }

    public void dismount() {

    }

    public boolean mount() {

        return true;
    }

    public boolean makeNoise() {
        return true;
    }

    public void eat() {

    }

    public void plant() {
    }
}
