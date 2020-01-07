package Reflect;

import Base.PrintUtil;
public class TestBean {
	private String s;
	
	public TestBean()
	{
		PrintUtil.println("TestBean(),this = " + this);
	}
	
	public TestBean(String a)
	{
		s = a;
	}
}
