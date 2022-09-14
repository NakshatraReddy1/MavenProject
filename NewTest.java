package Pack;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class NewTest {
  @Test(enabled = true)
  public void f() {
	  System.out.println("HI");
  }
  @Ignore
  public void f2()
  {
	  System.out.println("HIIIIIIIIIIIIIIIIIIIIIIIII");  
  }
  @Test
  public void f3() {
	  System.out.println("Hello");
  }
}
