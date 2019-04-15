import java.util.ArrayList;

public class TaylorCodeUserGuide {
     /* Taylor's Code QuickStart Guide

    To create a cropRow:

        -initialize ArrayList<Crop> cropsOnPlant
        -initialize a Plant object(boolean hasBeenHarvested = false; ArrayList<Crop> = cropsOnPlant)
        -initialize ArrayList<Plant> plants
        -initialize CropRow object (String type = typeOfCrop; ArrayList<Plant> plants);

        **** CropRows contain many plants ****

     To create a Basket:
        -initialize ArrayList<Crop> cropsInBasket
        -initialize a Basket object(ArrayList<Crop> cropsInBasket)

        **** Baskets contain crops that have been harvested ****
        **** Baskets can hold up to 25 crops ****


     To initialize a Field
        -initialize an ArrayList<CropRow> cropRows
        -initialize a Field object (boolean hasBeenFertilized = false; ArrayList<CropRow> cropRows)

        **** Fields contain many cropRows ****


       /////////////////////////////////////////Methods////////////////////////////////////////////////

        CropRow:
            - plantCrop(Crop crop) : this will add a crop to ArrayList<Plant> plants if plants.size() < 6
            -getCropRowStatus(): this will return how many crops are in cropRow and will tell how many crops can still be added
            -harvestCrop(Field field, Basket basket): ***if field.getHasBeenFertilized() == true****this will take a crop from
            each plant in cropRow.plants and add it to basket; if all plants have no more crops, the plants will be removed from plants;
            if there are no more plants in plants, cropRow.hasBeenHarvested will be set to true


        Field:
            -fertilize(Field field): this will set field.getHasBeenFertilized == true-- plants can be harvested now

                                 ***Each variable has a getter and a setter***
     */

    public static void main(String[] args) {
        // creating CropRow tomatoRow


        ArrayList<Crop> tomatoesOnStalk = new ArrayList<Crop>();
        TomatoPlant tomatoPlant = new TomatoPlant(false, tomatoesOnStalk);
        ArrayList<Plant> tomatoPlants = new ArrayList<Plant>();
        CropRow tomatoRow = new CropRow("tomato", tomatoPlants);
        tomatoRow.plantCrop(tomatoPlant);
        tomatoRow.plantCrop(tomatoPlant);
        tomatoRow.plantCrop(tomatoPlant);
        tomatoRow.plantCrop(tomatoPlant);
        tomatoRow.plantCrop(tomatoPlant);
        tomatoRow.plantCrop(tomatoPlant);


        //tomatoRow Tests



        //creating Basket tomatoBasket

        ArrayList<Crop> tomatoesInBasket = new ArrayList<Crop>();
        Basket tomatoBasket = new Basket(tomatoesInBasket);

        //tomatoBasket tests
        System.out.println(tomatoRow.getCropRowStatus());
        System.out.println(tomatoRow);
        System.out.println(tomatoBasket.getCropsInBasket());

        // creating CropRow cornRow
        ArrayList<Crop> cornOnStalk = new ArrayList<Crop>();
        CornStalk cornStalk = new CornStalk(false, cornOnStalk);
        ArrayList<Plant> cornStalks = new ArrayList<Plant>();
        CropRow cornRow = new CropRow("corn", cornStalks);
        cornRow.plantCrop(cornStalk);
        cornRow.plantCrop(cornStalk);
        cornRow.plantCrop(cornStalk);

        //creating Basket cornBasket
        ArrayList<CropRow> cropRows = new ArrayList<CropRow>();
        ArrayList<Crop> cornInBasket = new ArrayList<Crop>();
        Basket cornBasket = new Basket(cornInBasket);

        //creating Field field
        Field field = new Field(false, cropRows);

        //field tests
        Field.fertilize(field);
        System.out.println(field.getHasBeenFertilized());
        Field.fertilize(field);
        System.out.println(field.getHasBeenFertilized());
        tomatoRow.harvestCrop(field, tomatoBasket);
        tomatoRow.harvestCrop(field, tomatoBasket);
        System.out.println(tomatoBasket.getCropsInBasket());


        cornRow.harvestCrop(field, cornBasket);
        cornRow.harvestCrop(field, cornBasket);
        cornRow.harvestCrop(field, cornBasket);
        cornRow.harvestCrop(field, cornBasket);
        cornRow.harvestCrop(field, cornBasket);
        cornRow.harvestCrop(field, cornBasket);

        System.out.println(cornRow.getCropRowStatus());
       // cornRow.harvestCrop(field, cornBasket);


        System.out.println(cornBasket.getCropsInBasket());
        //System.out.println(tomatoRow);
        System.out.println(cornRow);



    }
}
