import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
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
    public void removeHorseTest() {
        Horse horse1 = new Horse("Black", 4, 2);
        Horse horse2 = new Horse("Brown", 4, 4);
        ArrayList<Horse> horses = new ArrayList<Horse>();
        horses.add(horse1);
        Stable stable = new Stable(horses);
        stable.removeHorse(horse1);
        ArrayList expected = horses;
        ArrayList actual = stable.getHorses();
        Assert.assertEquals(expected,actual);
    }
    //////////////////////// FarmHouse Tests //////////////////
    @Test
    public void addPerson(){
        Person person1 = new Farmer("Bob",2,false,false);
        Person person2 = new Farmer("Jane",4,true,true);
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(person1);
        people.add(person2);
        FarmHouse farmHouse = new FarmHouse(people);
        farmHouse.getPeoples().add(person1);
        farmHouse.getPeoples().add(person2);
        ArrayList expected = people;
        ArrayList actual = farmHouse.getPeoples();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void removePerson(){
        Person person1 = new Farmer("Bob",2,false,false);
        Person person2 = new Farmer("Jane",4,true,true);
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(person1);
        people.add(person2);
        people.add(person2);
        FarmHouse farmHouse = new FarmHouse(people);
        farmHouse.getPeoples().add(person1);
        farmHouse.getPeoples().add(person2);
        farmHouse.getPeoples().remove(person2);
        ArrayList expected = people;
        ArrayList actual = farmHouse.getPeoples();

        Assert.assertEquals(expected,actual);
    }
    //////////////////////////////////Farm Tests////////////////////////////////////
    @Test
    public void addChickenCoopTest(){
        Chicken chicken1 = new Chicken("Brown",4,2);
        Chicken chicken2 = new Chicken("Black",3,2);
        ArrayList<Chicken> chickens = new ArrayList<Chicken>();
        chickens.add(chicken1);
        chickens.add(chicken2);
        ChickenCoop chickenCoop = new ChickenCoop(chickens);
        ArrayList<ChickenCoop> chickenCoops = new ArrayList<ChickenCoop>();
        ArrayList<Stable> stables = new ArrayList<Stable>();
        ArrayList<Person> persons = new ArrayList<Person>();
        FarmHouse farmhouse = new FarmHouse(persons);
        Crop corn1 = new CornStalk("Corn");
        CropRow cropRow1 = new CropRow(corn1);
        Field field = new Field(cropRow1);
        ArrayList<Field> fields = new ArrayList<Field>();
        Farm farm = new Farm(stables,chickenCoops,farmhouse,fields);
        Chicken chicken3 = new Chicken("Blakc", 3,1);
        Chicken chicken4 = new Chicken("Grey", 2,2);
        ArrayList<Chicken> chickenArrayList = new ArrayList<Chicken>();
        ChickenCoop chickenCoop1 = new ChickenCoop(chickenArrayList);
        farm.getChickenCoops().add(chickenCoop1);
        ArrayList expected = chickenCoops;
        ArrayList actual = farm.getChickenCoops();
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void removeChickenCoop(){
        Chicken chicken1 = new Chicken("Brown",4,2);
        Chicken chicken2 = new Chicken("Black",3,2);
        ArrayList<Chicken> chickens = new ArrayList<Chicken>();
        chickens.add(chicken1);
        chickens.add(chicken2);
        ChickenCoop chickenCoop = new ChickenCoop(chickens);
        ArrayList<ChickenCoop> chickenCoops = new ArrayList<ChickenCoop>();
        ArrayList<Stable> stables = new ArrayList<Stable>();
        ArrayList<Person> persons = new ArrayList<Person>();
        FarmHouse farmhouse = new FarmHouse(persons);
        Crop corn1 = new CornStalk("Corn");
        CropRow cropRow1 = new CropRow(corn1);
        Field field = new Field(cropRow1);
        ArrayList<Field> fields = new ArrayList<Field>();
        Farm farm = new Farm(stables,chickenCoops,farmhouse,fields);
        farm.getChickenCoops().remove(chickenCoop);
        ArrayList<ChickenCoop> chickenCoops1 = new ArrayList<ChickenCoop>();
        ArrayList expect = chickenCoops1;
        ArrayList actual = farm.getChickenCoops();
        Assert.assertEquals(expect,actual);
    }
    @Test
    public void addStable(){
        Horse horse1 = new Horse("Brown",4,2);
        Horse horse2 = new Horse("Black",3,2);
        ArrayList<Horse> horses = new ArrayList<Horse>();
        horses.add(horse1);
        horses.add(horse2);
        ArrayList<ChickenCoop> chickenCoops = new ArrayList<ChickenCoop>();
        ArrayList<Stable> stables = new ArrayList<Stable>();
        Stable stable = new Stable(horses);
        stables.add(stable);
        ArrayList<Person> persons = new ArrayList<Person>();
        FarmHouse farmhouse = new FarmHouse(persons);
        Crop corn1 = new CornStalk("Corn");
        CropRow cropRow1 = new CropRow(corn1);
        Field field = new Field(cropRow1);
        ArrayList<Field> fields = new ArrayList<Field>();
        Farm farm = new Farm(stables,chickenCoops,farmhouse,fields);
        ArrayList expect = chickenCoops;
        ArrayList actual = farm.getStables();
        Assert.assertEquals(expect,actual);
    }
}
