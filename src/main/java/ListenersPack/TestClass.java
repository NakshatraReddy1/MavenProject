package ListenersPack;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(Listener.class)
public class TestClass {

	@Test
	public void method1()
	{
		System.out.print("method 1 executed");
	}
	@Test
	public void method2()
	{
		System.out.print("method 2 executed");
	}
	@Test(timeOut = 1000)
	public void method3() throws InterruptedException
	
	{
		Thread.sleep(2000);
		System.out.print("method 3 executed");
	}
	@Test(dependsOnMethods = "method3")
	public void method4()
	{
		System.out.print("method 4 executed");
	}

}
