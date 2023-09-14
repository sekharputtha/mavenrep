package mavenpack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertclass {
  @Test
  public void in() 
  {
	  String name="india";
	  Assert.assertEquals(name, "india");
	  System.out.println("country name is :" + name);
  }
  @Test
  public void pak() 
  {
	  String name="pakistan";
	  Assert.assertEquals(name, "pakistan");
	  System.out.println("country name is :" + name);
  }
  @Test
  public void sl() 
  {
	  String name="srilanka";
	  Assert.assertEquals(name, "sreelanka");
	  System.out.println("country name is :" + name);
  }
}
