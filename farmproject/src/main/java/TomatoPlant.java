public class TomatoPlant extends Crop {
    private String Tomato;
    private TomatoPlant tomatoplant;

    public TomatoPlant(String tomato) {
        Tomato = tomato;
    }

    public String getTomato() {
        return Tomato;
    }

    public void setTomato(String tomato) {
        Tomato = tomato;
    }

    public Object yield() {
        return tomatoplant;
    }

}
