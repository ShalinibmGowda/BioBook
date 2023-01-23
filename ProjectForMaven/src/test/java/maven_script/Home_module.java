package maven_script;

import org.testng.annotations.Test;

public class Home_module {
  
	@Test(groups = "smoke")
	public void writeComment()
	{
		System.out.println("write the comment sucessfully");
	}
	
	@Test(groups = "regression")
	public void deleteComment()
	{
		System.out.println("delete the comment");
	}
}
