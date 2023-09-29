package com.sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/
	@Test
	public void test1()
	{
		MyLogin ml1=new MyLogin();
		Assert.assertEquals(false,ml1.checkLogin("", ""));
	}
	@Test
	public void test2()
	{
		MyLogin ml1=new MyLogin();
		Assert.assertEquals(false, ml1.checkLogin("abc", "abc"));
	}
	@Test
	public void test3()
	{
		MyLogin ml1=new MyLogin();
		Assert.assertEquals(false, ml1.checkLogin("srinu", "12345"));
	}
	@Test
	public void test4()
	{
		MyLogin ml1=new MyLogin();
		Assert.assertEquals(false, ml1.checkLogin("SRINU", "12345"));
	}
}
