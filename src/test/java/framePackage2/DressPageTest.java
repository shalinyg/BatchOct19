package framePackage2;

import org.testng.Assert;
import org.testng.annotations.Test;

import framePackage1.Basepage;
import framePackage1.DressPageObject;
import framePackage1.HomepageObjects;

public class DressPageTest {

	HomepageObjects hp;
	DressPageObject dp;
	Basepage bp;
	public DressPageTest()
	{
		hp=new HomepageObjects();
		bp=new Basepage();
		dp=new DressPageObject();
		
	}
/*	@Test
	public void verifysize()
	{
		
		Assert.assertTrue(bp.elementFound(dp.Sizes()));
		Assert.assertTrue(bp.elementFound(dp.Sizesmall()));
		Assert.assertTrue(bp.elementFound(dp.Sizemedium()));
		Assert.assertTrue(bp.elementFound(dp.Sizelarge()));
		Assert.assertTrue(dp.Sizesmall().isSelected());
	
	}*/
	@Test
public void verifyProductCount()
	{
		hp.clickDress();
Assert.assertTrue(dp.getProductNumberfromHeader()==dp.getproductCount(),"Failed:Count");
		
}		
				
				
				
}
				