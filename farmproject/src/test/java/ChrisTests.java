import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ChrisTests {
    @Test
    public void chickenCoopAdd(){
        Chicken chicken1 = new Chicken("Brown",4,2);
        Chicken chicken2 = new Chicken("Black",3,2);
        ArrayList<Chicken> chickens = new ArrayList<Chicken>();
        chickens.add(chicken1);
        ChickenCoop chickenCoop = new ChickenCoop(chickens);
        chickenCoop.addChicken(chicken2);
        ArrayList expected = chickens;
        ArrayList actual = chickenCoop.getChickens();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void chickenCoopRemove(){
        Chicken chicken1 = new Chicken("Brown",4,2);
        Chicken chicken2 = new Chicken("Black",3,2);
        ArrayList<Chicken> chickens = new ArrayList<Chicken>();
        chickens.add(chicken1);
        ChickenCoop chickenCoop = new ChickenCoop(chickens);
        chickenCoop.removeChicken(chicken1);
        chickens.remove(chicken1);

        ArrayList expected = chickens;
        ArrayList actual = chickenCoop.getChickens();

        Assert.assertEquals(expected,actual);
    }
    ////////////////////////////////STABLE TEST/////////////////////////////////
    @Test
    public void addHorseTest(){
        Horse horse1 = new Horse("Black",4,2);
        Horse horse2 = new Horse("Brown",4,4);
        ArrayList<Horse> horses = new ArrayList<Horse>();
        horses.add(horse1);
        Stable stable = new Stable(horses);
        stable.addHorse(horse2);
        horses.add(horse2);
        ArrayList expected =horses;
        ArrayList actual = stable.getHorses();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void removeHorseTest(){
        Horse horse1 = new Horse("Black",4,2);
        Horse horse2 = new Horse("Brown",4,4);
        ArrayList<Horse> horses = new ArrayList<Horse>();
        horses.add(horse1);
        Stable stable = new Stable(horses);
        stable.removeHorse(horse1);
    }
}
