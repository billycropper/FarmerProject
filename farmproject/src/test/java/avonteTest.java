import org.junit.Assert;
import org.junit.Test;

public class avonteTest {

    @Test
    public void testInheritance(){
        //Given
        Farmer farmer = new Farmer("Avonte", 2, true, true);
        boolean expected = true;

        //When
        boolean actual = farmer instanceof Person;


        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testImplimication(){
        //Given
        Farmer farmer = new Farmer("Avonte", 2, true, true);
        boolean expected = true;

        //When
        boolean actual = farmer instanceof IBotanist;


        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public boolean testMount(){
        //Given
        Farmer farmer = new Farmer("Avonte", 2, true, true);
        Horse horse = new Horse("Brown", 4, 2);
        boolean expected = true;

        //When

        if (farmer.mount()==horse.ridable()){
            return true;
        }
        boolean actual = true;



        //Then
        Assert.assertEquals(expected, actual);

        return expected;
    }

    @Test
    public void testDismount(){

    }

    @Test
    public void testPlant(){

    }




}

