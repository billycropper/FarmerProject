import java.util.*;

public class CropRow {
    Field field;
    private CropRow cropRow;
    private ArrayList<Plant> plants;
    private String type;
    private boolean harvested;



    public CropRow(String type, ArrayList<Plant> plants) {
        this.type = type;
        this.plants = plants;
    }

    public CropRow() {

    }
    public void setPlants(ArrayList<Plant> plantArrayList){
        plants = plantArrayList;
    }
    public ArrayList getPlants(){
        return plants;
    }
    public CropRow getCropRow(){
        return cropRow;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < plants.size(); i++) {
            str = str + plants.get(i);
        }

        return "Plants in " + type + " row: " + "\n" +
                str + "\n";
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }


    public void plantCrop(Plant plant) {
        if (plants.size() >= 5) {
            System.out.println("Too many crops in this row!");
        } else if (plants.size() < 6) {
            addPlant(plant);
            System.out.println("You just planted a crop!");
        }
    }
    public String getCropRowStatus() {
        String str = "";
        str += "You have " + plants.size() + " crops in this row! You can plant " + (5 - plants.size()) + " more!";
        if (plants.size() == 5) {
            str = "You have planted the maximum amount of crops in this row!";
        }
        return str;
    }
    public void harvestCrop(Field field, Basket basket) {
        int index = plants.size() - 1;
        if (plants.size() == 0) {
            System.out.println("There are no crops in this row! Please plant more!");
        } else if (plants != null && field.getHasBeenFertilized() == false) {
                System.out.println("Fertilize your field first!");
            } else if (plants != null && field.getHasBeenFertilized() == true) {
                Plant plant = plants.get(index);
                ArrayList<Crop> cropsOnPlant = plant.getCropsOnPlant();
                int cropIndex = cropsOnPlant.size() - 1;
                Crop crop = cropsOnPlant.get(cropIndex);
                basket.addToBasket(crop);
                basket.addToBasket(crop);
                basket.addToBasket(crop);
                basket.addToBasket(crop);
                basket.addToBasket(crop);
                System.out.println("You just harvested one crop! Your basket now holds " + basket.getCropsInBasket().size() + " crops!");
                if (basket.getCropsInBasket().size() == 25) {
                    plants.remove(plant);
                    plants.remove(plant);
                    plants.remove(plant);
                    plants.remove(plant);
                    plants.remove(plant);

                }
            }


        }
    }


