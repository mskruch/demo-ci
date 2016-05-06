package pl.mskruch;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mskruch on 06/05/16.
 */
public class AppTest {


	@Test
	public void test(){
		String foo = new App().foo();
		Assert.assertEquals("bar", foo);
	}

}