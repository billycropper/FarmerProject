public class CornStalk extends Crop {
    private String Earcorn;
    private Earcorn earcorn;
    public CornStalk(String earcorn) {
        Earcorn = earcorn;
    }

    public String getEarcorn() {
        return Earcorn;
    }

    public void setEarcorn(String earcorn) {
        Earcorn = earcorn;
    }

    public Object yield() {
        return earcorn;
    }
}
