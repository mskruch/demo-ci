package pl.mskruch;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

	@Test
	public void test()
	{
		String foo = new App().foo();
		Assert.assertEquals("bar", foo);
	}

}