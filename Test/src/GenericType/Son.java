package GenericType;

public class Son extends Father<String> implements ITest<Integer>{
	public void test(String... str)
	{
		System.out.println("son.test");
	}

}
