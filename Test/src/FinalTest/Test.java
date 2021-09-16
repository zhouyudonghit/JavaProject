package FinalTest;

import Base.ITest;

public class Test implements ITest{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println(test1());
	}
	
	
	/**
	 * ½á¹ûreturn 2
	 * @return
	 */
	private int test1()
	{
		try {
			return 1;
		}catch(Exception e)
		{
			
		}finally {
			System.out.println("here");
			return 2;
		}
	}
}
