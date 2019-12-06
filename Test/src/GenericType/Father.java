package GenericType;

public class Father<T> {
	
	public void door(T...ts )
	{
		test(ts);
	}
	
	public void test(T... t)
	{
		System.out.println("father.tetst");
	}

}
