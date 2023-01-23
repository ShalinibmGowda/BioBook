package maven_script;

import org.testng.annotations.Test;

public class Profile_module {

	@Test(groups = "smoke")
	public void addPhoto()
	{
		System.out.println("adding the photo successfully");
	}
	
	@Test(groups = "regression")
	public void deletePhoto()
	{
		System.out.println("delete the photo");
	}
}
