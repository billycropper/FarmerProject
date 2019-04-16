public abstract class   Person implements IRider, INoiseMaker, IEater {

    private String name;
    private int eyes;
    private boolean nose;
    private boolean mouth;

    public Person() {
    }

    public Person(String name, int eyes, boolean nose, boolean mouth) {
        this.name = name;
        this.eyes = eyes;
        this.nose = nose;
        this.mouth = mouth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public boolean isNose() {
        return nose;
    }

    public void setNose(boolean nose) {
        this.nose = nose;
    }

    public boolean isMouth() {
        return mouth;
    }

    public void setMouth(boolean mouth) {
        this.mouth = mouth;
    }

    public void dismount() {

    }

    public boolean mount() {

        return false;
    }

    public boolean makeNoise() {
        return true;
    }

    public void eat() {

    }
}
