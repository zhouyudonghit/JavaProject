package RetryTest;

public class RetryTest {
	public void test()
	{
		retry:
			for(int i = 0;i < 2;i++)
			{
				System.out.println("i = "+i);
				for(int j = 0;j < 2;j++)
				{
					System.out.println("j = "+j);
					for(int k = 0;k < 5;k++)
					{
						System.out.println("k = "+k);
						if(k == 3)
						{
							continue retry;
						}
					}
				}
			}
	}

	public void test1()
	{
		retry:
			for(int i = 0;i < 2;i++)
			{
				System.out.println("i = "+i);
				for(int j = 0;j < 2;j++)
				{
					System.out.println("j = "+j);
					for(int k = 0;k < 5;k++)
					{
						System.out.println("k = "+k);
						if(k == 3)
						{
							break retry;
						}
					}
				}
			}
	}
	
	
	/*
	 * k = 0
       k = 1
       k = 2
       k = 3
	 */
	public void test2()
	{
		retry:
			for(int k = 0;k < 5;k++)
			{
				System.out.println("k = "+k);
				if(k == 3)
				{
					break retry;
				}
			}
	}
	
	public void test3()
	{
		retry:
			for(int k = 0;k < 5;k++)
			{
				System.out.println("k = "+k);
				if(k == 3)
				{
					continue retry;
				}
			}
	}

}
