import java.util.ArrayList;
import java.util.LinkedList;

public class CornStalk extends Plant{
    private ArrayList<Crop> cornOnStalk;
    CornEars corn = new CornEars();

    public CornStalk(boolean hasBeenHarvested, ArrayList<Crop> cornOnStalk){
        super(hasBeenHarvested);
        this.cornOnStalk = cornOnStalk;
        cornOnStalk.add(corn);
        cornOnStalk.add(corn);
        cornOnStalk.add(corn);
        cornOnStalk.add(corn);
        cornOnStalk.add(corn);
    }
    @Override
    public String toString() {
        String str = "";
        for(int i = 0; i < cornOnStalk.size(); i++){
            str += "\n" + cornOnStalk.get(i);
        }
        return "\n" + "CornStalk" + str +"\n\n";
    }
    public void setCropsOnPlant(ArrayList<Crop> corn){
        cornOnStalk = corn;
    }
    public ArrayList getCropsOnPlant(){
        return cornOnStalk;
    }
    public Crop getCorn(){
        int index = cornOnStalk.size() - 1;
        return cornOnStalk.get(index);
    }

    public static void main(String[] args){

        ArrayList<Crop> cornOnStalk = new ArrayList<Crop>();
        CornStalk cornStalk = new CornStalk(false, cornOnStalk);
        System.out.println(cornStalk.getCorn());
        System.out.println(cornStalk.getCropsOnPlant());


    }


}
