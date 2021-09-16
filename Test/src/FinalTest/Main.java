package FinalTest;

import java.util.List;

import Base.ITest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("123");
        test(str);
        System.out.println(str);
        ITest test = new Test();
        test.test();
	}
	
	public static void test(final String str)
	{
		//str = "dsfds";
		test2(str);
	}
	
	public static void test2(String str)
	{
		str = new String("dsf");
	}
}
