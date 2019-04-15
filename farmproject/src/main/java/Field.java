import java.util.ArrayList;

public class Field {
    private boolean hasBeenFertilized;
    ArrayList<CropRow> cropRows;
    Field field;

    public Field(boolean hasBeenFertilized, ArrayList<CropRow> cropRows){
        this.hasBeenFertilized = hasBeenFertilized;
        this.cropRows = cropRows;
    }
    public void setHasBeenFertilized(boolean fertilized){
        hasBeenFertilized = fertilized;
    }
    public boolean getHasBeenFertilized(){
        return hasBeenFertilized;
    }
    public void setCropRows(ArrayList<CropRow> cropRowArrayList){
        cropRows = cropRowArrayList;
    }
    public ArrayList getCropRows(){
        return cropRows;
    }
    public static void fertilize(Field field) {
        if (field.getHasBeenFertilized() == false) {
            System.out.println("Fertilizing field...");
            field.setHasBeenFertilized(true);
        } else {
            System.out.println("This field has already been fertilized! Harvest now!");
        }
    }
    }






