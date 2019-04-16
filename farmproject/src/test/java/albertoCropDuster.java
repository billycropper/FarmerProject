import org.junit.Assert;
import org.junit.Test;

public class albertoCropDuster {

	@Test

	public void testDustField(){

		CropDuster cropDuster = new CropDuster(4,2,1,4);


		boolean expected = false;
		boolean actual = cropDuster.getHasBeenFerilized();
		Assert.assertEquals(expected,actual);
	}
}
