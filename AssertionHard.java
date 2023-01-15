package testngproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionHard {
	@Test
	public void test1() {
		int a=100 , b=100;
		Assert.assertTrue(a!=b,"a is not equal to b''''''''");
	}
	@Test
	public void test2() {
		int x=100,y=100;
		Assert.assertFalse(x==y,"x is equal to y''''''''");
	}
		@Test
		public void test3() {
		int act=100, exp=200;
		Assert.assertEquals(act, exp,"uiegfgfgfgdfg");
	}
		@Test
		public void test4() {
		int act1=100, exp1=100;
		Assert.assertNotEquals(act1,exp1,"uuhhfuhh");
	}

}

