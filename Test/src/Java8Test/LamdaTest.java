package Java8Test;

public class LamdaTest {

	public void test()
	{
		test1();
	}

	private void test1()
	{
		MathOperation max = (a,b) -> {
			if(a > b)
			{
				return a;
			}else {
				return b;
			}
		};
		
		MathOperation add = (a,b) -> a=a+b;
		
		GreetingService greetingService = a -> System.out.println(a);
	}
	
	interface MathOperation {
	      int operation(int a, int b);
	   }
	    
	   interface GreetingService {
	      void sayMessage(String message);
	   }
	    
	   private int operate(int a, int b, MathOperation mathOperation){
	      return mathOperation.operation(a, b);
	   }
	   
}
