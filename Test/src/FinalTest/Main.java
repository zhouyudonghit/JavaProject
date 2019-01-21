package FinalTest;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("123");
        test(str);
        System.out.println(str);
        
        List<String> strs = null;
        for(String s: strs)
        {
        	
        }
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
