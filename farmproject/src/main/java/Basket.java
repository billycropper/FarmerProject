import java.util.ArrayList;

public class Basket {
    private ArrayList<Crop> cropsInBasket;



    public Basket(ArrayList<Crop> cropsInBasket){
        this.cropsInBasket = cropsInBasket;
    }

    public void setCropsInBasket(ArrayList<Crop> crops){
        cropsInBasket = crops;
    }
    public ArrayList getCropsInBasket(){
        return cropsInBasket;
    }
    public void addToBasket(Crop crop) {
        if (getCropsInBasket().size() < 25) {
            cropsInBasket.add(crop);
        } else if (getCropsInBasket().size() >= 25) {
            System.out.println("Maximum number of crops in basket reached. Please fill a new basket.");
        }
    }
    public void removeFromBasket(Crop crop){
        cropsInBasket.remove(crop);
        System.out.println("You removed one crop from your basket!");
    }

}