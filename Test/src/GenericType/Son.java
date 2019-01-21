package GenericType;

public class Son extends Father<String>{
	public void test(String... str)
	{
		System.out.println("son.test");
	}

}
